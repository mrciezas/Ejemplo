/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dao.component.*;
import dao.design.IClienteDAO;
import dao.design.IEmpleadoDAO;
import dao.design.IRequerimientoDAO;
//mox es mi amiwis :3
/**
 *
 * @author pc
 */
public class DAOFactory {
   private static DAOFactory daoFac;
   static {
      daoFac=new DAOFactory();
      
   }
   public static DAOFactory getInstance(){
      return daoFac;
   }
   
    public IClienteDAO getClienteDAO(){
      
      return new ClienteDAO();
   }
    public IEmpleadoDAO getEmpleadoDAO(){
       
    return new EmpleadoDAO();
    }
    public IRequerimientoDAO getRequerimientoDAO(){  
    return new RequerimientoDAO();
    }

   
}
