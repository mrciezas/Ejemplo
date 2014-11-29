package dao.ds;

import dao.DAOFactory;
import dao.design.IClienteDAO;
import dao.design.IEmpleadoDAO;
import dao.design.IRequerimientoDAO;
import dao.to.ClienteTO;
import dao.to.EmpleadoTO;
import dao.to.Req_EmpTO;
import dao.to.RequerimientoTO;
import java.util.ArrayList;
import java.util.List;

public class Test {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
            
      AccesoDB  a= new  AccesoDB();
      if(a.getConnection()!= null){
         System.out.println("conecto");
      }else{
         System.out.println("no conecto");
      }
      
      /*
      IClienteDAO clienteDAO = DAOFactory.getInstance().getClienteDAO();
      IEmpleadoDAO empleadoDAO = DAOFactory.getInstance().getEmpleadoDAO();
       IRequerimientoDAO reqDAO = DAOFactory.getInstance().getRequerimientoDAO();
       IRequerimientoDAO requerimientoDAO = DAOFactory.getInstance().getRequerimientoDAO();
      ArrayList<ClienteTO> listacliente= clienteDAO.listaclientes();
      ArrayList<EmpleadoTO> listaempleado= empleadoDAO.listarDisponibles(); 
         ArrayList<RequerimientoTO> listareq= reqDAO.listarRequerimiento("Instalacion","Culminado");
      //ArrayList<RequerimientoTO> listareq= requerimientoDAO.listarRequerimiento("","");
      //ArrayList<RequerimientoTO> listarequerimiento = requerimientoDAO.listarRequerimiento("Culminado","Instalacion");
      //EmpleadoTO emp= empleadoDAO.empleadoxid("emp-001");
      EmpleadoTO emp=empleadoDAO.login("emp-004", "4942224");
      System.out.println(emp.getCARGO()+" "+emp.getAREA());
       
      //EmpleadoTO emp= new EmpleadoTO("1","1","JEFE", false,"Juan","OPERACIONES");
      ArrayList<EmpleadoTO> le= empleadoDAO.listarDisponibles();
      for( EmpleadoTO  em : le){
         System.out.println(em.getIDEMPLEADO());
         System.out.println(em.getNOMBRE());
         System.out.println(em.getCONTRASEÑA());
   }
      listareq= reqDAO.listarAllRequerimiento();
         for( RequerimientoTO  r : listareq){
         System.out.println(r.getDESCRIPCION());
         System.out.println(r.getTIPO());
         System.out.println(r.getEstado());
    
   }
         System.out.println("holaaaaa");
          listareq= reqDAO.listarRequerimiento("Instalacion","Culminado");
         for( RequerimientoTO  r : listareq){
         System.out.println(r.getDESCRIPCION());
         System.out.println(r.getTIPO());
             
    
   }
      
           */    
       
      
       
       

   }
}
   

