/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.component;

import dao.design.IClienteDAO;
import dao.design.IEmpleadoDAO;
import dao.ds.AccesoDB;
import dao.to.ClienteTO;
import dao.to.EmpleadoTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class EmpleadoDAO implements IEmpleadoDAO {

   AccesoDB db;

   public EmpleadoDAO() {
      db = new AccesoDB();
   }
   
    @Override
   public ArrayList<EmpleadoTO> listarDisponibles() {
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ArrayList<EmpleadoTO> lista = new ArrayList();
      String procedimientoalmacenado = "{CALL sp_listarEmpDisp()} ";
      Connection cn = db.getConnection();
      if (cn != null) {//si la conexion no es 
         System.out.println("listando empleados");
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
               EmpleadoTO em = new EmpleadoTO();
               em.setIDEMPLEADO(rs.getString("idempleado"));
               em.setCONTRASEÑA(rs.getString("contrasena"));
               em.setESTADO(rs.getBoolean("estado"));
               em.setCARGO(rs.getString("cargo"));
               em.setAREA(rs.getString("area"));
               em.setNOMBRE(rs.getString("nombre"));
               System.out.println(em.getAREA());
               lista.add(em);
            }
         } catch (SQLException ex) {
             System.out.println(ex);
         } finally {
            try {
               cn.close();
            } catch (SQLException e) {
            }
         }
      }
      return lista;
   
   }

   @Override
   public ArrayList<EmpleadoTO> listarEmpleados() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public EmpleadoTO empleadoxid(String idEmpleado) {
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

      Connection cn = db.getConnection();
      EmpleadoTO e = new EmpleadoTO();
      String procedimientoalmacenado = "{CALL sp_EmpxId(?)} ";

      if (cn != null) {
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);

            cs.setString(1, idEmpleado);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
               e.setIDEMPLEADO(rs.getString("idempleado"));
               e.setESTADO(rs.getBoolean("estado"));
               e.setNOMBRE(rs.getString("nombre"));
               e.setCARGO(rs.getString("cargo"));

            }

          
         } catch (SQLException ex1) {
            System.out.println(ex1);
            
         } finally {
            try {
               cn.close();
            } catch (SQLException ex2) {
            }
         }
      }
      return e;
   
   }

   @Override
   public String actualizarEstadoEmpleado(List<String> idEmpleados,boolean estado) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String rpta = "";
      Connection cn = db.getConnection();
      String procedimientoalmacenado = "{CALL sp_actualizarEstEmp(?,?)} ";

      if (cn != null) {
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
           for(String  l:idEmpleados){               
               cs.setBoolean(1, estado);
               cs.setString(2, l);

            int actualizo = cs.executeUpdate();

            if (actualizo == 0) {
               rpta = "error";
            } }
         } catch (SQLException ex) {
             System.out.println(ex);
            rpta = ex.getMessage();
         } finally {
            try {
               cn.close();
            } catch (SQLException e) {
            }
         }
      }
      return rpta;
   }
   @Override
   public EmpleadoTO login(String id,String pwd){
       EmpleadoTO emp= new EmpleadoTO();
       Connection cn= db.getConnection();
       String sp= "{CALL sp_login(?,?)}";
       if(cn!= null){
         try {
            CallableStatement cs = cn.prepareCall(sp);
            cs.setString(1,id);
            cs.setString(2, pwd);
            ResultSet rs= cs.executeQuery();
            if(rs.next()){
                emp.setCARGO(rs.getString("cargo"));
                emp.setAREA(rs.getString("area"));
               
            }
         } catch (SQLException ex) {
             System.out.println("error " + ex);
         } finally {
            try {
               cn.close();
            } catch (SQLException e) {
            }
         }  
       }
       return emp;
   }

   @Override
   public String insertarEmp(EmpleadoTO e) {
        String rpta="";
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_insertarempleado(?,?,?,?,?,?,?)} ";
        
        if(cn!=null){
           System.out.println("conectooo");
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                cs.setString(1, e.getIDEMPLEADO());
                cs.setString(2, e.getCONTRASEÑA());
                cs.setString(3, e.getCARGO());
                cs.setString(4,e.getAREA());
                cs.setBoolean(5,e.getESTADO());
                cs.setString(6,e.getNOMBRE());
                cs.setString(7,"");
               


              
                int inserto=cs.executeUpdate();
                
                if(inserto==0){
                    rpta="error";
                }else{
                   rpta="exito";
                }             
            }catch(SQLException ex){
               System.out.println(ex);
            }finally{
                try{
                    cn.close();
                }catch(SQLException ex1){
                }
            }
        }
        return rpta;
    }

   
   }

