/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;


import dao.to.ClienteTO;
import dao.to.EmpleadoTO;
import dao.to.Req_EmpTO;
import dao.to.RequerimientoTO;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface IRequerimientoDAO {
   
    public abstract String insertarRequerimiento(RequerimientoTO req);
    public abstract ArrayList<RequerimientoTO> listarRequerimiento(String tipo,String estado);
    public abstract ArrayList<RequerimientoTO> listarAllRequerimiento();
    public abstract RequerimientoTO requerimientoxid(String idReq);
    public abstract String actualizarEstado(String estado,String idrequerimiento);
    public abstract String actualizarReq(RequerimientoTO req);//editar toso el req
    public abstract String asignarEmpleado(ArrayList<Req_EmpTO> detReq);//asiganr empleados al req
   }
