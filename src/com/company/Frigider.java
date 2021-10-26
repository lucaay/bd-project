package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Frigider extends Electrocasnice {
    /////date membre
    private float pret;
    private String model;
    private String disponibilitate;
    private String brand;
    private String rating;
    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private String sistem_dezghetare;
    private String sistem_racire;
    private List<String> functii;
    private Vector<Integer> capacitate;

    /////metode
    Frigider() {
        pret = 0;
        model = "Necunoscut";
        disponibilitate = "Necunoscut";
        brand = "Necunoscut";
        rating = "⭐";
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        sistem_dezghetare = "Necunoscut";
        sistem_racire = "Necunoscut";
        functii = new ArrayList<String>();
        functii.add("Necunoscut");
        //capacitate
        capacitate = new Vector<Integer>(3);
        for (int i = 0; i < 4; i++)
            capacitate.add(i, 0);
    }

    Frigider(float pret, String model, String disponibilitate, String brand, String rating, String tip_incastrare,
             String tip_display, String clasa_energetica, String sistem_dezghetare, String sistem_racire,
             List<String> functii, Vector<Integer> capacitate) {
        this.pret = pret;
        this.model = model;
        this.disponibilitate = disponibilitate;
        this.brand = brand;
        this.rating = rating;
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.sistem_dezghetare = sistem_dezghetare;
        this.sistem_racire = sistem_racire;
        this.functii = functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < capacitate.capacity(); i++) {
            this.capacitate.add(i, capacitate.get(i));
        }
    }

    public Frigider(Frigider f) {
        this.pret = f.pret;
        this.model = f.model;
        this.disponibilitate = f.disponibilitate;
        this.brand = f.brand;
        this.rating = f.rating;
        this.tip_incastrare = f.tip_incastrare;
        this.tip_display = f.tip_display;
        this.clasa_energetica = f.clasa_energetica;
        this.sistem_dezghetare = f.sistem_dezghetare;
        this.sistem_racire = f.sistem_racire;
        this.functii = f.functii;
        this.capacitate = new Vector<Integer>();
        for (int i = 0; i < f.capacitate.capacity(); i++) {
            this.capacitate.add(i, f.capacitate.get(i));

        }
    }
    public String toString(){

        return " Pret: "+ pret+"\n Model: "+model+"\n Disponibilitate: "+disponibilitate+"\n Brand: "+brand+"\n Rating: "+rating+
                "\n Tip Încasare: "+tip_incastrare+"\n Tip Display: "+tip_display+"\n Clasa Energetica: "+clasa_energetica+
                "\n Sistem Dezghetare: "+sistem_dezghetare+"\n Sistem racire: "+sistem_racire+"\n Functii"+functii+
                "\n Capacitate: "+capacitate;
    }

}

