package com.company;

import java.util.ArrayList;

import java.util.List;


public class LadaFrigorifica extends Electrocasnice {
    ///// date membre
    private String clasa_energetica;
    private List<String> functii;

    ///// metode
    LadaFrigorifica() {
        super();
        clasa_energetica = "Necunoscut";
        functii = new ArrayList<String>();
        functii.add("Necunoscut");

    }

    LadaFrigorifica(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String tip_incastrare, String tip_display, String clasa_energetica, String sistem_dezghetare,
            String sistem_racire, List<String> functii) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.clasa_energetica = clasa_energetica;
        this.functii = functii;

    }

    public LadaFrigorifica(LadaFrigorifica f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.clasa_energetica = f.clasa_energetica;
        this.functii = f.functii;

    }

    public String toString() {

        return super.toString() + "\n Clasa energetica: " + clasa_energetica + "\n Functii: " + functii;

    }
}
