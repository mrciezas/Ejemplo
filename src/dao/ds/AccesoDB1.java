/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class AccesoDB1 {
    public Connection getConnection(){
        Connection cn= null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn=DriverManager.getConnection("jdbc:mysql://arredondos.webcindario.com/arredondos","arredondos","12200213");
        }catch(SQLException e){
           System.out.println(e);
        }catch (Exception ex){
           System.out.println(ex);
            
        }
        return cn;
    }
    
    public AccesoDB1(){
    }
}
