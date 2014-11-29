/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.to;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class CuentaTO implements Serializable{
   private String IDUSUARIO ;
   private String CONTRASEÑA;

   public CuentaTO(String IDUSUARIO, String CONTRASEÑA) {
      this.IDUSUARIO = IDUSUARIO;
      this.CONTRASEÑA = CONTRASEÑA;
   }

   public CuentaTO() {
   }
 

   public String getIDUSUARIO() {
      return IDUSUARIO;
   }

   public void setIDUSUARIO(String IDUSUARIO) {
      this.IDUSUARIO = IDUSUARIO;
   }

   public String getCONTRASEÑA() {
      return CONTRASEÑA;
   }

   public void setCONTRASEÑA(String CONTRASEÑA) {
      this.CONTRASEÑA = CONTRASEÑA;
   }
	

   
   
}