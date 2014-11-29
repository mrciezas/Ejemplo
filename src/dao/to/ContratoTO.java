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
public class ContratoTO implements Serializable{
   private String IDCONTRATO ;
   private String CONDICION;
	private Date FECINICIO ;
   private Date FECFINAL;
   private Date FECREG;
	private String  FORMAPAGO ;
	private  String  DESCRIPCION ;
   private int VALIDEZ;

   public ContratoTO() {
   }
   
   

   public ContratoTO(String IDCONTRATO, String CONDICION, Date FECINICIO, Date FECFINAL, Date FECREG, String FORMAPAGO, String DESCRIPCION, int VALIDEZ) {
      this.IDCONTRATO = IDCONTRATO;
      this.CONDICION = CONDICION;
      this.FECINICIO = FECINICIO;
      this.FECFINAL = FECFINAL;
      this.FECREG = FECREG;
      this.FORMAPAGO = FORMAPAGO;
      this.DESCRIPCION = DESCRIPCION;
      this.VALIDEZ = VALIDEZ;
   }

   public String getIDCONTRATO() {
      return IDCONTRATO;
   }

   public void setIDCONTRATO(String IDCONTRATO) {
      this.IDCONTRATO = IDCONTRATO;
   }

   public String getCONDICION() {
      return CONDICION;
   }

   public void setCONDICION(String CONDICION) {
      this.CONDICION = CONDICION;
   }

   public Date getFECINICIO() {
      return FECINICIO;
   }

   public void setFECINICIO(Date FECINICIO) {
      this.FECINICIO = FECINICIO;
   }

   public Date getFECFINAL() {
      return FECFINAL;
   }

   public void setFECFINAL(Date FECFINAL) {
      this.FECFINAL = FECFINAL;
   }

   public Date getFECREG() {
      return FECREG;
   }

   public void setFECREG(Date FECREG) {
      this.FECREG = FECREG;
   }

   public String getFORMAPAGO() {
      return FORMAPAGO;
   }

   public void setFORMAPAGO(String FORMAPAGO) {
      this.FORMAPAGO = FORMAPAGO;
   }

   public String getDESCRIPCION() {
      return DESCRIPCION;
   }

   public void setDESCRIPCION(String DESCRIPCION) {
      this.DESCRIPCION = DESCRIPCION;
   }

   public int getVALIDEZ() {
      return VALIDEZ;
   }

   public void setVALIDEZ(int VALIDEZ) {
      this.VALIDEZ = VALIDEZ;
   }

}
