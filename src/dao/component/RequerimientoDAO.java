/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.component;

import dao.design.IClienteDAO;
import dao.design.IEmpleadoDAO;
import dao.design.IRequerimientoDAO;
import dao.ds.AccesoDB;
import dao.to.ClienteTO;
import dao.to.EmpleadoTO;
import dao.to.Req_EmpTO;
import dao.to.RequerimientoTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class RequerimientoDAO implements IRequerimientoDAO {

   AccesoDB db;

   public RequerimientoDAO() {
      db = new AccesoDB();
   }

   /**
    *
    * @return
    */
 
   

  

 
 



   @Override
   public String insertarRequerimiento(RequerimientoTO req) {
       String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_insertarRequerimiento(?,?,?,?,?,?,?,?)} ";
        
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                cs.setString(1, req.getIDREQUERIMIENTO());
                cs.setString(2, req.getEstado());
                cs.setDate(3, req.getFECREG());
                cs.setDate(4,req.getFECCUL());
                cs.setString(5,req.getTIPO());
                cs.setString(5,req.getDESCRIPCION());
                cs.setString(5,req.getProy().getIDPROYECTO());
                cs.setString(5,req.getCli().getIDCLIENTE());
                int inserto=cs.executeUpdate();
                
                if(inserto==0){
                    rpta="error";
                }                
            }catch(SQLException ex){
            }finally{
                try{
                    cn.close();
                }catch(SQLException e){
                }
            }
        }
        return rpta;
      
   }
   @Override
   public ArrayList<RequerimientoTO> listarRequerimiento(String tipo,String estado) {
      
   ArrayList<RequerimientoTO> lista = new ArrayList();
      String procedimientoalmacenado = "{CALL sp_listasRequerimiento(?,?)} ";
      Connection cn = db.getConnection();
      if (cn != null) {//si la conexion no es 
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            cs.setString(1, estado);
            cs.setString(2, tipo);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
               RequerimientoTO req = new RequerimientoTO();
               req.setIDREQUERIMIENTO(rs.getString("idrequerimiento"));
               req.setEstado(rs.getString("estado"));
               req.setFECREG(rs.getDate("fecreq"));
               req.setFECCUL(rs.getDate("feclim"));
               req.setTIPO(rs.getString("tipo"));
               req.setDESCRIPCION(rs.getString("Descripcion"));
               req.setProy(null);//proyectodao te devuelve un proyecto
               req.setInformes(null);//informedao se encarga  de traer infomes 
               lista.add(req);
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
   public ArrayList<RequerimientoTO> listarAllRequerimiento() {
      
   ArrayList<RequerimientoTO> lista = new ArrayList();
      String procedimientoalmacenado = "{CALL sp_listarAllRequerimiento()} ";
      Connection cn = db.getConnection();
      if (cn != null) {//si la conexion no es 
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
               RequerimientoTO req = new RequerimientoTO();
               req.setIDREQUERIMIENTO(rs.getString("idrequerimiento"));
               req.setEstado(rs.getString("estado"));
               req.setFECREG(rs.getDate("fecreq"));
               req.setFECCUL(rs.getDate("feclim"));
               req.setTIPO(rs.getString("tipo"));
               req.setDESCRIPCION(rs.getString("Descripcion"));
               req.setProy(null);//proyectodao te devuelve un proyecto
               req.setInformes(null);//informedao se encarga  de traer infomes 
               lista.add(req);
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
   public RequerimientoTO requerimientoxid(String idReq) {
       Connection cn = db.getConnection();
      RequerimientoTO req = new RequerimientoTO();
      String procedimientoalmacenado = "{CALL sp_requerimientoxid(?)} ";

      if (cn != null) {
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);

            cs.setString(1,idReq);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
             req.setIDREQUERIMIENTO(rs.getString("idrequerimiento"));
               req.setEstado(rs.getString("estado"));
               req.setFECREG(rs.getDate("fecreq"));
               req.setFECCUL(rs.getDate("feclim"));
               req.setDESCRIPCION(rs.getString("descripcion"));
               req.setTIPO(rs.getString("tipo"));
               req.setProy(null);
               req.setInformes(null);

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
      return req;
   }

   @Override
   public String actualizarEstado(String estado,String idrequerimiento) {
       String rpta = "";
      Connection cn = db.getConnection();
      String procedimientoalmacenado = "{CALL sp_actualizarEstReq(?,?)} ";

      if (cn != null) {
         try {
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            cs.setString(1, idrequerimiento);
            cs.setString(2, estado);
            int actualizo = cs.executeUpdate();
            if (actualizo == 0) {
               rpta = "error";
            }
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
   public String actualizarReq(RequerimientoTO req) {
      
          String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_actualizarRequerimiento(?,?,?,?,?,?,?,?)} ";
        
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                cs.setString(1, req.getIDREQUERIMIENTO());
                cs.setString(2, req.getEstado());
                cs.setDate(3, req.getFECREG());
                cs.setDate(4,req.getFECCUL());
                cs.setString(5,req.getTIPO());
                cs.setString(5,req.getDESCRIPCION());
                cs.setString(5,req.getProy().getIDPROYECTO());
                cs.setString(5,req.getCli().getIDCLIENTE());
                int actualizo=cs.executeUpdate();
                
                if(actualizo==0){
                    rpta="error";
                }                
            }catch(SQLException ex){
                rpta=ex.getMessage();
            }finally{
                try{
                    cn.close();
                }catch(SQLException e){
                }
            }
        }
        return rpta;
      
   }

   @Override
   public String asignarEmpleado(ArrayList<Req_EmpTO> detReq) {
      
      String rpta=null;
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_asignarEmpleados(?,?,?)} ";
        
        if(cn!=null){
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                for(Req_EmpTO dr : detReq) {
                cs.setString(1,dr.getReq());
                cs.setString(2,dr.getEm());                
                cs.setBoolean(3,dr.isEsEncargado());
               
                int inserto=cs.executeUpdate();
                 if(inserto==0){
                    rpta="error";
                } 
                }   
            }catch(SQLException ex){
                System.out.println(ex);
            }finally{
                try{
                    cn.close();
                }catch(SQLException e){
                }
            }
        }
        return rpta;
      
      
  }
   
   
   
}
