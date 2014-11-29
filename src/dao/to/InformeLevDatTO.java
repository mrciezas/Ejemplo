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
public class InformeLevDatTO extends InformeTO  implements Serializable {
   private int NRODIAS ;
   private  String  PAQMANT;
	private  int NROOPE ;
	private int NROHOR ;

  

   public InformeLevDatTO(int NRODIAS, String PAQMANT, int NROOPE, int NROHOR, String DESCRIPCION, boolean CONSIDERABILIDAD, Date FECVISITA, Date FECREG, ArrayList<RequerimientoTO> requerimientos, ArrayList<String> observaciones) {
      super(DESCRIPCION, CONSIDERABILIDAD, FECVISITA, FECREG, requerimientos, observaciones);
      this.NRODIAS = NRODIAS;
      this.PAQMANT = PAQMANT;
      this.NROOPE = NROOPE;
      this.NROHOR = NROHOR;
   }

   public int getNRODIAS() {
      return NRODIAS;
   }

   public void setNRODIAS(int NRODIAS) {
      this.NRODIAS = NRODIAS;
   }

   public String getPAQMANT() {
      return PAQMANT;
   }

   public void setPAQMANT(String PAQMANT) {
      this.PAQMANT = PAQMANT;
   }

   public int getNROOPE() {
      return NROOPE;
   }

   public void setNROOPE(int NROOPE) {
      this.NROOPE = NROOPE;
   }

   public int getNROHOR() {
      return NROHOR;
   }

   public void setNROHOR(int NROHOR) {
      this.NROHOR = NROHOR;
   }
   
   
   
   
}
