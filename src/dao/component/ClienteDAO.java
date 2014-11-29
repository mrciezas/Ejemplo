/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.component;


import dao.design.IClienteDAO;
import dao.ds.AccesoDB;
import dao.to.ClienteTO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author pc
 */
public class ClienteDAO implements IClienteDAO{
    AccesoDB db;
    
    public ClienteDAO(){
        db=new AccesoDB();
    }

    @Override
    public ArrayList<ClienteTO> listaclientes() {
        ArrayList<ClienteTO> lista=new ArrayList();
        String procedimientoalmacenado="{CALL sp_listarclientes()} ";
        Connection cn=db.getConnection();
        if(cn!=null){//si la conexion no es 
           System.out.println("jjjjj");
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                ResultSet rs=cs.executeQuery();
                while(rs.next()){
                    ClienteTO cli=new ClienteTO();
                    cli.setIDCLIENTE(rs.getString("idcliente"));
                    cli.setEstado(rs.getBoolean("estado"));
                    cli.setEMAIL(rs.getString("email"));
                    cli.setAPEPAT(rs.getString("apepat"));
                    cli.setAPEMAT(rs.getString("apemat"));
                    cli.setNOMBRE(rs.getString("nombre"));
                    cli.setCARGO(rs.getString("cargo"));
                    cli.setTELEFONO(rs.getString("telefono"));
                    cli.setDNI(rs.getString("dni"));
                    lista.add(cli);
                }                
            }catch(SQLException ex){
            }finally{
                try{
                    cn.close();
                }catch(SQLException e){
                }
            }
        }
        return lista;
    }

    @Override
    public boolean insertarcliente(ClienteTO cli) {
        boolean rpta=false;
        Connection cn=db.getConnection();
        String procedimientoalmacenado="{CALL sp_insertarcliente(?,?,?,?,?,?,?,?,?)} ";
        
        if(cn!=null){
           System.out.println("conectooo");
            try{
                CallableStatement cs=cn.prepareCall(procedimientoalmacenado);
                cs.setString(1, cli.getIDCLIENTE());
                cs.setBoolean(2, cli.isEstado());
                cs.setString(3, cli.getEMAIL());
                cs.setString(4,cli.getDNI());
                cs.setString(5,cli.getTELEFONO());
                cs.setString(6,cli.getCARGO());
                cs.setString(7,cli.getNOMBRE());
                cs.setString(8,cli.getAPEPAT());
               cs.setString(9,cli.getAPEMAT());


              
                int inserto=cs.executeUpdate();
                
                if(inserto==0){
                    rpta=false;
                }else{
                   rpta=true;
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
