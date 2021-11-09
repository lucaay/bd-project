package com.company;//calea 

import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;

public class MasinaSpalatRufe extends Electrocasnice {

    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private int nrPrograme;
    private String functii;

    ///// metode
    MasinaSpalatRufe() {
        super();
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        nrPrograme = 0;
        functii = "Necunoscut";

    }

    MasinaSpalatRufe(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String tip_incastrare, String tip_display, String clasa_energetica, int nrPrograme,
            String functii) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.nrPrograme = nrPrograme;
        this.functii = functii;

    }

    public MasinaSpalatRufe(MasinaSpalatRufe f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.tip_incastrare = f.tip_incastrare;
        this.tip_display = f.tip_display;
        this.clasa_energetica = f.clasa_energetica;
        this.nrPrograme = f.nrPrograme;
        this.functii = f.functii;

    }

    // override
    public String toString() {

        return super.toString() + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Numar Programe: " + nrPrograme + "\n Functii"
                + functii;
    }

}
