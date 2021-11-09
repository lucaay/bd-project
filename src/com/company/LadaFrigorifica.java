package com.company;

import java.util.ArrayList;

import java.util.List;


public class LadaFrigorifica extends Electrocasnice {
    ///// date membre
    private String clasa_energetica;
    String culoare;

    ///// metode
    LadaFrigorifica() {
        super();
        clasa_energetica = "Necunoscut";
        culoare="Alb";

    }

    LadaFrigorifica(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating,String clasa_energetica,String culoare) {
                
            
        
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.clasa_energetica = clasa_energetica;
        this.culoare =culoare;

    }

    public LadaFrigorifica(LadaFrigorifica f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.clasa_energetica = f.clasa_energetica;
        this.culoare = f.culoare;

    }

    public String toString() {

        return super.toString() + "\n Clasa energetica: " + clasa_energetica + "\n Culoare: " + culoare;

    }
}
