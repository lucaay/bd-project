package com.company;//calea 

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MasinaSpalatRufe extends Electrocasnice {
    private float pret;
    private String model;
    private String disponibilitate;
    private String brand;
    private String rating;
    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private int nrPrograme;
    private List<String> functii;
    private Vector<Integer> capacitate;

    ///// metode
    MasinaSpalatRufe() {
        pret = 0;
        model = "Necunoscut";
        disponibilitate = "Necunoscut";
        brand = "Necunoscut";
        rating = "⭐";
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        nrPrograme = 0;
        functii = new ArrayList<String>();
        functii.add("Necunoscut");
        // capacitate
        capacitate = new Vector<Integer>(3);
        for (int i = 0; i < 4; i++)
            capacitate.add(i, 0);
    }

    MasinaSpalatRufe(float pret, String model, String disponibilitate, String brand, String rating,
            String tip_incastrare, String tip_display, String clasa_energetica, int nrPrograme, List<String> functii,
            Vector<Integer> capacitate) {
        this.pret = pret;
        this.model = model;
        this.disponibilitate = disponibilitate;
        this.brand = brand;
        this.rating = rating;
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.nrPrograme = nrPrograme;
        this.functii = functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < capacitate.capacity(); i++) {
            this.capacitate.add(i, capacitate.get(i));
        }
    }

    public MasinaSpalatRufe(MasinaSpalatRufe a) {
        this.pret = a.pret;
        this.model = a.model;
        this.disponibilitate = a.disponibilitate;
        this.brand = a.brand;
        this.rating = a.rating;
        this.tip_incastrare = a.tip_incastrare;
        this.tip_display = a.tip_display;
        this.clasa_energetica = a.clasa_energetica;
        this.nrPrograme = a.nrPrograme;
        this.functii = a.functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < a.capacitate.capacity(); i++) {
            this.capacitate.add(i, a.capacitate.get(i));

        }
    }
//override
    public String toString() {

        return " Pret: " + pret + "\n Model: " + model + "\n Disponibilitate: " + disponibilitate + "\n Brand: " + brand
                + "\n Rating: " + rating + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Numar Programe: " + nrPrograme + "\n Functii"
                + functii + "\n Capacitate: " + capacitate;
    }

}
