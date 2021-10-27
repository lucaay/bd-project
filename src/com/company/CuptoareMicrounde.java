package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class CuptoareMicrounde extends Electrocasnice {
      /////date membre
      private String tip_incastrare;
      private String tip_panoucomanda;
      private String tip_modalitatigatire;
      private String tip_culoare;
      private List<String> functii;
  
      /////metode
      CuptoareMicrounde() {
          super();
          tip_incastrare = "Necunoscut";
          tip_panoucomanda = "Necunoscut";
          tip_culoare = "Necunoscut";
          functii = new ArrayList<String>();
          functii.add("Necunoscut");
          //capacitate
    
      }
  
      CuptoareMicrounde(String tip_electrocasnice,float pret,Boolean disponibilitate,String model,String brand,String rating,Vector<Integer>capacitate,String tip_incastrare,String tip_panoucomanda, String tip_modalitatigatire, String tip_culoare,
               List<String> functii) {
          super(tip_electrocasnice,pret,disponibilitate,model,brand,rating,capacitate);
          this.tip_incastrare = tip_incastrare;
          this.tip_panoucomanda=tip_panoucomanda;
          this.tip_modalitatigatire=tip_modalitatigatire;
          this.tip_culoare = tip_culoare;

      }
  
      public CuptoareMicrounde(CuptoareMicrounde f,Electrocasnice e) {
          super(e);
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