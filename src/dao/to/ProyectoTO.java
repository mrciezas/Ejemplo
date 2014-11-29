/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.to;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ProyectoTO implements Serializable{
   private String IDPROYECTO ;
   private String NOMBRE;
	private  String ESTADO ;
	private Date FECREG ;
	private String  SECTOR ;
	private  String  CODJEFE ;
   private ArrayList<RequerimientoTO> requerimientos;


   public ProyectoTO() {
   }

   public ProyectoTO(String IDPROYECTO, String NOMBRE, String ESTADO, Date FECREG, String SECTOR, String CODJEFE) {
      this.IDPROYECTO = IDPROYECTO;
      this.NOMBRE = NOMBRE;
      this.ESTADO = ESTADO;
      this.FECREG = FECREG;
      this.SECTOR = SECTOR;
      this.CODJEFE = CODJEFE;
   }

   public String getIDPROYECTO() {
      return IDPROYECTO;
   }

   public void setIDPROYECTO(String IDPROYECTO) {
      this.IDPROYECTO = IDPROYECTO;
   }

   public String getNOMBRE() {
      return NOMBRE;
   }

   public void setNOMBRE(String NOMBRE) {
      this.NOMBRE = NOMBRE;
   }

   public String getESTADO() {
      return ESTADO;
   }

   public void setESTADO(String ESTADO) {
      this.ESTADO = ESTADO;
   }

   public Date getFECREG() {
      return FECREG;
   }

   public void setFECREG(Date FECREG) {
      this.FECREG = FECREG;
   }

   public String getSECTOR() {
      return SECTOR;
   }

   public void setSECTOR(String SECTOR) {
      this.SECTOR = SECTOR;
   }

   public String getCODJEFE() {
      return CODJEFE;
   }

   public void setCODJEFE(String CODJEFE) {
      this.CODJEFE = CODJEFE;
   }
   
   
}
