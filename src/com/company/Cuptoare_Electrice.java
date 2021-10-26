package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Cuptoare_Electrice extends Electrocasnice {
    /////date membre
    private float pret;
    private String disponibilitate;
    private String brand;
    private String rating;
    private String tip_incastrare;
    private String tip_produs;
    private String tip_culoare;
    private List<String> functii;
    private Vector<Integer> capacitate;
    private Vector<Integer> putere;
    private Vector<Integer> temperatura_maxima;
    /////metode
    Cuptoare_Electrice() {
        pret = 0;
        disponibilitate = "Necunoscut";
        brand = "Necunoscut";
        rating = "⭐";
        tip_incastrare = "Necunoscut";
        tip_produs = "Necunoscut";
        tip_culoare = "Necunoscut";
        functii = new ArrayList<String>();
        functii.add("Necunoscut");
        //capacitate
        capacitate = new Vector<Integer>(3);
        for (int i = 0; i < 4; i++)
            capacitate.add(i, 0);
        //putere
        putere = new Vector<Integer>(3);
        for (int i = 0; i < 4; i++)
            putere.add(i, 0);  
        //temperatura_maxima
        temperatura_maxima = new Vector<Integer>(3);
        for (int i = 0; i < 4; i++)
            temperatura_maxima.add(i, 0);
    }

    Cuptoare_Electrice(float pret,  String disponibilitate, String brand, String rating, String tip_incastrare,
             String tip_produs, String tip_culoare,
             List<String> functii, Vector<Integer> capacitate, Vector<Integer> putere, Vector<Integer> temperatura_maxima) {
        this.pret = pret;
        this.disponibilitate = disponibilitate;
        this.brand = brand;
        this.rating = rating;
        this.tip_incastrare = tip_incastrare;
        this.tip_produs=tip_produs;
        this.tip_culoare = tip_culoare;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < capacitate.capacity(); i++) {
            this.capacitate.add(i, capacitate.get(i));
        }
        this.putere = new Vector<Integer>();
        for (int i = 0; i < putere.capacity(); i++) {
            this.putere.add(i, putere.get(i));
        }
        this.temperatura_maxima = new Vector<Integer>();
        for (int i = 0; i < temperatura_maxima.capacity(); i++) {
            this.temperatura_maxima.add(i, temperatura_maxima.get(i));
        }
    }

    public Cuptoare_Electrice(Cuptoare_Electrice f) {
        this.pret = f.pret;
        this.disponibilitate = f.disponibilitate;
        this.brand = f.brand;
        this.rating = f.rating;
        this.tip_incastrare = f.tip_incastrare;
        this.tip_produs = f.tip_produs;
        this.tip_culoare=f.tip_culoare;
        this.functii = f.functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < f.capacitate.capacity(); i++) {
            this.capacitate.add(i, f.capacitate.get(i));

        }
        this.putere = new Vector<Integer>();
        for (int i = 0; i < f.putere.capacity(); i++) {
            this.putere.add(i, f.putere.get(i));

        } 
        this.temperatura_maxima = new Vector<Integer>();
        for (int i = 0; i < f.temperatura_maxima.capacity(); i++) {
            this.capacitate.add(i, f.temperatura_maxima.get(i));
            
        }
    }
    public String toString(){

        return " Pret: "+ pret+"\n Disponibilitate: "+disponibilitate+"\n Brand: "+brand+"\n Rating: "+rating+
                "\n Tip Încastrare: "+tip_incastrare+"\n Tip Produs: "+tip_produs+"\n Tip Culoare: "+tip_culoare+"\n Functii"+functii+
                "\n Capacitate: "+capacitate+"\n Putere:"+putere+"\n Temperatura Maxima:"+temperatura_maxima;
    }

}