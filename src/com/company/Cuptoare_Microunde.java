package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Cuptoare_Microunde extends Electrocasnice {
      /////date membre
      private float pret;
      private String disponibilitate;
      private String brand;
      private String rating;
      private String tip_incastrare;
      private String tip_panoucomanda;
      private String tip_modalitatigatire;
      private String tip_culoare;
      private List<String> functii;
      private Vector<Integer> capacitate;
  
      /////metode
      Cuptoare_Microunde() {
          pret = 0;
          disponibilitate = "Necunoscut";
          brand = "Necunoscut";
          rating = "⭐";
          tip_incastrare = "Necunoscut";
          tip_panoucomanda = "Necunoscut";
          tip_culoare = "Necunoscut";
          functii = new ArrayList<String>();
          functii.add("Necunoscut");
          //capacitate
          capacitate = new Vector<Integer>(3);
          for (int i = 0; i < 4; i++)
              capacitate.add(i, 0);
      }
  
      Cuptoare_Microunde(float pret,  String disponibilitate, String brand, String rating, String tip_incastrare,
               String tip_panoucomanda, String tip_modalitatigatire, String tip_culoare,
               List<String> functii, Vector<Integer> capacitate) {
          this.pret = pret;
          this.disponibilitate = disponibilitate;
          this.brand = brand;
          this.rating = rating;
          this.tip_incastrare = tip_incastrare;
          this.tip_panoucomanda=tip_panoucomanda;
          this.tip_modalitatigatire=tip_modalitatigatire;
          this.tip_culoare = tip_culoare;
          this.capacitate = new Vector<Integer>();
          for (int i = 0; i < capacitate.capacity(); i++) {
              this.capacitate.add(i, capacitate.get(i));
          }
      }
  
      public Cuptoare_Microunde(Cuptoare_Microunde f) {
          this.pret = f.pret;
          this.disponibilitate = f.disponibilitate;
          this.brand = f.brand;
          this.rating = f.rating;
          this.tip_incastrare = f.tip_incastrare;
          this.tip_panoucomanda = f.tip_panoucomanda;
          this.tip_modalitatigatire = f.tip_modalitatigatire;
          this.tip_culoare=f.tip_culoare;
          this.functii = f.functii;
          this.capacitate = new Vector<Integer>();
          for (int i = 0; i < f.capacitate.capacity(); i++) {
              this.capacitate.add(i, f.capacitate.get(i));
  
          }
      }
      public String toString(){
  
          return " Pret: "+ pret+"\n Disponibilitate: "+disponibilitate+"\n Brand: "+brand+"\n Rating: "+rating+
                  "\n Tip Încastrare: "+tip_incastrare+"\n Tip Panou Comanda: "+tip_panoucomanda+"\n Tip Modalitati Gatire: "+tip_modalitatigatire+
                  "\n Tip Culoare: "+tip_culoare+"\n Functii"+functii+
                  "\n Capacitate: "+capacitate;
      }
  
  }