package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MasinaSpalatVase extends Electrocasnice {
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

    MasinaSpalatVase() {
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

    MasinaSpalatVase(float pret, String model, String disponibilitate, String brand, String rating,
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

    public MasinaSpalatVase(MasinaSpalatVase v) {
        this.pret = v.pret;
        this.model = v.model;
        this.disponibilitate = v.disponibilitate;
        this.brand = v.brand;
        this.rating = v.rating;
        this.tip_incastrare = v.tip_incastrare;
        this.tip_display = v.tip_display;
        this.clasa_energetica = v.clasa_energetica;
        this.nrPrograme = v.nrPrograme;
        this.functii = v.functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < v.capacitate.capacity(); i++) {
            this.capacitate.add(i, v.capacitate.get(i));

        }
    }

    public String toString() {

        return " Pret: " + pret + "\n Model: " + model + "\n Disponibilitate: " + disponibilitate + "\n Brand: " + brand
                + "\n Rating: " + rating + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Numar Programe: " + nrPrograme + "\n Functii"
                + functii + "\n Capacitate: " + capacitate;
    }

}
