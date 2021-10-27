package com.company;

import java.util.ArrayList;
import java.util.List;


public class CuptoareMicrounde extends Electrocasnice {
      /////date membre
      private String tip_incastrare;
      private String tip_panoucomanda;
      private String tip_modalitatigatire;
      private String tip_culoare;
      private List<String> functii;
  
      /////metode
      CuptoareMicrounde() {
         
          tip_incastrare = "Necunoscut";
          tip_panoucomanda = "Necunoscut";
          tip_culoare = "Necunoscut";
          functii = new ArrayList<String>();
          functii.add("Necunoscut");
          //capacitate
    
      }
  
      CuptoareMicrounde(String tip_incastrare,String tip_panoucomanda, String tip_modalitatigatire, String tip_culoare,
               List<String> functii) {

          this.tip_incastrare = tip_incastrare;
          this.tip_panoucomanda=tip_panoucomanda;
          this.tip_modalitatigatire=tip_modalitatigatire;
          this.tip_culoare = tip_culoare;

      }
  
      public CuptoareMicrounde(CuptoareMicrounde f) {

          this.tip_incastrare = f.tip_incastrare;
          this.tip_panoucomanda = f.tip_panoucomanda;
          this.tip_modalitatigatire = f.tip_modalitatigatire;
          this.tip_culoare=f.tip_culoare;
          this.functii = f.functii;
      }
      public String toString(){
  
          return super.toString()+ "\n Tip Încastrare: "+tip_incastrare+
          "\n Tip Panou Comanda: "+tip_panoucomanda+"\n Tip Modalitati Gatire: "+tip_modalitatigatire+
          "\n Tip Culoare: "+tip_culoare+"\n Functii"+functii;
      }
  
  }