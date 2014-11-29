
package dao.to;

import java.io.Serializable;
import java.sql.Date;

public class EmpleadoTO implements Serializable{
   private String IDEMPLEADO ;
	private  String CONTRASEÑA ;
	private String    CARGO;
	private boolean   ESTADO ;
        private String AREA;
   private String  NOMBRE ;
   
   
           

   public String getNOMBRE() {
      return NOMBRE;
   }

   public void setNOMBRE(String NOMBRE) {
      this.NOMBRE = NOMBRE;
   }

   public EmpleadoTO() {
   }

   public EmpleadoTO(String IDEMPLEADO, String CONTRASEÑA, String CARGO, boolean ESTADO,String NOMBRE,String area) {
      this.IDEMPLEADO = IDEMPLEADO;
      this.CONTRASEÑA = CONTRASEÑA;
      this.CARGO = CARGO;
      this.ESTADO = ESTADO;
      this.NOMBRE=NOMBRE;
      AREA=area;
   }

   public String getIDEMPLEADO() {
      return IDEMPLEADO;
   }

   public void setIDEMPLEADO(String IDEMPLEADO) {
      this.IDEMPLEADO = IDEMPLEADO;
   }

   public String getCONTRASEÑA() {
      return CONTRASEÑA;
   }

   public void setCONTRASEÑA(String CONTRASEÑA) {
      this.CONTRASEÑA = CONTRASEÑA;
   }

   public String getCARGO() {
      return CARGO;
   }

   public void setCARGO(String CARGO) {
      this.CARGO = CARGO;
   }

   public boolean getESTADO() {
      return ESTADO;
   }

   public void setESTADO(boolean ESTADO) {
      this.ESTADO = ESTADO;
   }

    public String getAREA() {
        return AREA;
    }

    public void setAREA(String AREA) {
        this.AREA = AREA;
    }
   
  


   
}