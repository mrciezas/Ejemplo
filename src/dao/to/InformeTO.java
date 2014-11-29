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
public class InformeTO implements Serializable{
   private String DESCRIPCION ;
   private boolean CONSIDERABILIDAD;
	private  Date FECVISITA ;
	private Date FECREG ;
   private ArrayList<RequerimientoTO> requerimientos;
   private ArrayList<String> observaciones;

   public InformeTO() {
   }

   public ArrayList<String> getObservaciones() {
      return observaciones;
   }

   public void setObservaciones(ArrayList<String> observaciones) {
      this.observaciones = observaciones;
   }

  
   
   public InformeTO(String DESCRIPCION, boolean CONSIDERABILIDAD, Date FECVISITA, Date FECREG, ArrayList<RequerimientoTO> requerimientos,ArrayList<String> observaciones) {
      this.DESCRIPCION = DESCRIPCION;
      this.CONSIDERABILIDAD = CONSIDERABILIDAD;
      this.FECVISITA = FECVISITA;
      this.FECREG = FECREG;
      this.requerimientos = requerimientos;
       this.observaciones = observaciones;
   }

   public String getDESCRIPCION() {
      return DESCRIPCION;
   }

   public void setDESCRIPCION(String DESCRIPCION) {
      this.DESCRIPCION = DESCRIPCION;
   }

   public boolean isCONSIDERABILIDAD() {
      return CONSIDERABILIDAD;
   }

   public void setCONSIDERABILIDAD(boolean CONSIDERABILIDAD) {
      this.CONSIDERABILIDAD = CONSIDERABILIDAD;
   }

   public Date getFECVISITA() {
      return FECVISITA;
   }

   public void setFECVISITA(Date FECVISITA) {
      this.FECVISITA = FECVISITA;
   }

   public Date getFECREG() {
      return FECREG;
   }

   public void setFECREG(Date FECREG) {
      this.FECREG = FECREG;
   }

   public ArrayList<RequerimientoTO> getRequerimientos() {
      return requerimientos;
   }

   public void setRequerimientos(ArrayList<RequerimientoTO> requerimientos) {
      this.requerimientos = requerimientos;
   }


   
   
}