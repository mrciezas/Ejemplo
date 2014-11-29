/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.to;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class ClienteTO implements Serializable{
   private String IDCLIENTE ;
	private  boolean estado ;
	private String EMAIL ;
	private  String  DNI ;
	private  String  TELEFONO ;
	private  String  CARGO ;
	private  String  NOMBRE ;
	private  String  APEPAT ;
	private  String  APEMAT;

   public ClienteTO() {
   }

   public ClienteTO(String IDCLIENTE, boolean estado, String EMAIL, String DNI, String TELEFONO, String CARGO, String NOMBRE, String APEPAT, String APEMAT) {
      this.IDCLIENTE = IDCLIENTE;
      this.estado = estado;
      this.EMAIL = EMAIL;
      this.DNI = DNI;
      this.TELEFONO = TELEFONO;
      this.CARGO = CARGO;
      this.NOMBRE = NOMBRE;
      this.APEPAT = APEPAT;
      this.APEMAT = APEMAT;
   }

   public String getIDCLIENTE() {
      return IDCLIENTE;
   }

   public void setIDCLIENTE(String IDCLIENTE) {
      this.IDCLIENTE = IDCLIENTE;
   }

   public boolean isEstado() {
      return estado;
   }

   public void setEstado(boolean estado) {
      this.estado = estado;
   }

   public String getEMAIL() {
      return EMAIL;
   }

   public void setEMAIL(String EMAIL) {
      this.EMAIL = EMAIL;
   }

   public String getDNI() {
      return DNI;
   }

   public void setDNI(String DNI) {
      this.DNI = DNI;
   }

   public String getTELEFONO() {
      return TELEFONO;
   }

   public void setTELEFONO(String TELEFONO) {
      this.TELEFONO = TELEFONO;
   }

   public String getCARGO() {
      return CARGO;
   }

   public void setCARGO(String CARGO) {
      this.CARGO = CARGO;
   }

   public String getNOMBRE() {
      return NOMBRE;
   }

   public void setNOMBRE(String NOMBRE) {
      this.NOMBRE = NOMBRE;
   }

   public String getAPEPAT() {
      return APEPAT;
   }

   public void setAPEPAT(String APEPAT) {
      this.APEPAT = APEPAT;
   }

   public String getAPEMAT() {
      return APEMAT;
   }

   public void setAPEMAT(String APEMAT) {
      this.APEMAT = APEMAT;
   }
   

    /**
     * @return the idalumno
     */
   
   
}