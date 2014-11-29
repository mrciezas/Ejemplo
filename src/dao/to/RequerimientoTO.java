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
public class RequerimientoTO implements Serializable{
   private String IDREQUERIMIENTO ;
	private  String estado ;
	private Date FECREG ;
	private Date  FECCUL ;
	private  String  TIPO ;
	private  String  DESCRIPCION ;
   private int NROAMBIENTES;//atributo adicional
   private ArrayList<InformeTO> informes;
   private ProyectoTO proy;
   private ClienteTO cli;

   public RequerimientoTO() {
   }

   public RequerimientoTO(String IDREQUERIMIENTO, String estado, Date FECREG, Date FECCUL, String TIPO, String DESCRIPCION, String NOMBRE, int NROAMBIENTES) {
      this.IDREQUERIMIENTO = IDREQUERIMIENTO;
      this.estado = estado;
      this.FECREG = FECREG;
      this.FECCUL = FECCUL;
      this.TIPO = TIPO;
      this.DESCRIPCION = DESCRIPCION;
      this.NROAMBIENTES = NROAMBIENTES;
   }

   public String getIDREQUERIMIENTO() {
      return IDREQUERIMIENTO;
   }

   public void setIDREQUERIMIENTO(String IDREQUERIMIENTO) {
      this.IDREQUERIMIENTO = IDREQUERIMIENTO;
   }

   public String getEstado() {
      return estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public Date getFECREG() {
      return FECREG;
   }

   public void setFECREG(Date FECREG) {
      this.FECREG = FECREG;
   }

   public Date getFECCUL() {
      return FECCUL;
   }

   public void setFECCUL(Date FECCUL) {
      this.FECCUL = FECCUL;
   }

   public String getTIPO() {
      return TIPO;
   }

   public void setTIPO(String TIPO) {
      this.TIPO = TIPO;
   }

   public String getDESCRIPCION() {
      return DESCRIPCION;
   }

   public void setDESCRIPCION(String DESCRIPCION) {
      this.DESCRIPCION = DESCRIPCION;
   }


   public int getNROAMBIENTES() {
      return NROAMBIENTES;
   }

   public void setNROAMBIENTES(int NROAMBIENTES) {
      this.NROAMBIENTES = NROAMBIENTES;
   }

   public ArrayList<InformeTO> getInformes() {
      return informes;
   }

   public void setInformes(ArrayList<InformeTO> informes) {
      this.informes = informes;
   }

   public ProyectoTO getProy() {
      return proy;
   }

   public void setProy(ProyectoTO proy) {
      this.proy = proy;
   }

   public ClienteTO getCli() {
      return cli;
   }

   public void setCli(ClienteTO cli) {
      this.cli = cli;
   }

  

   
}