/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.to;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author pc
 */
public class Req_EmpTO implements Serializable{
   private Date FECASIG;
   private boolean esEncargado;
   private String req;
   private String em;

    public Req_EmpTO(String req, String em,boolean esEncargado) {
        this.esEncargado = esEncargado;
        this.req = req;
        this.em = em;
    }
   
   

   public String getReq() {
      return req;
   }

   public void setReq(String req) {
      this.req = req;
   }

   public String getEm() {
      return em;
   }

   public void setEm(String em) {
      this.em = em;
   }

   public Date getFECASIG() {
      return FECASIG;
   }

   public void setFECASIG(Date FECASIG) {
      this.FECASIG = FECASIG;
   }

   public boolean isEsEncargado() {
      return esEncargado;
   }

   public void setEsEncargado(boolean esEncargado) {
      this.esEncargado = esEncargado;
   }

   
   
   
}