package com.company;

//import java.util.Vector;

public class Espressor extends Electrocasnice {
    ///// date membre
    private float putere;

    ///// metode
    Espressor() {
        super();
        this.putere = 0.01f;
    }

    Espressor(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand, String rating,
            float putere) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.putere = putere;

    }

    public Espressor(Espressor f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());

        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.putere = f.putere;
    }

    public String toString() {

        return super.toString() + "\n Putere: " + putere;
    }

    // setteri & getteri
    public float getPutere() {
        return putere;
    }

    public void setPutere(float putere) {
        this.putere = putere;
    }
}