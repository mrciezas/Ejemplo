/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.design;


import dao.to.ClienteTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IClienteDAO {
    public abstract ArrayList<ClienteTO> listaclientes();
    public abstract boolean insertarcliente(ClienteTO cliente);

}
