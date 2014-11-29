/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;


import dao.to.ClienteTO;
import dao.to.EmpleadoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IEmpleadoDAO {
    public abstract ArrayList<EmpleadoTO> listarDisponibles();
    public abstract ArrayList<EmpleadoTO> listarEmpleados();
    public abstract EmpleadoTO  empleadoxid(String idEmpleado);
    public abstract String actualizarEstadoEmpleado(List <String> lemp,boolean estado);
    public abstract EmpleadoTO login(String id,String pwd);
    public abstract String insertarEmp(EmpleadoTO e);

}
