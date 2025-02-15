package com.company;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;

public class MasinaSpalatVase extends Electrocasnice {

    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private int nrPrograme;
    private String functii;

    MasinaSpalatVase() {
        super();
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        nrPrograme = 0;
        functii = "Necunoscut";
    }

    MasinaSpalatVase(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String tip_incastrare, String tip_display, String clasa_energetica, int nrPrograme,
            String functii) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.nrPrograme = nrPrograme;
        this.functii = functii;
    }

    public MasinaSpalatVase(MasinaSpalatVase v) {
        super.setBrand(v.getBrand());
        super.setModel(v.getModel());
        super.setPret(v.getPret());
        super.setDisponibilitate(v.getDisponibilitate());
        super.setTip_electrocasnice(v.getTip_electrocasnice());
        super.setRating(v.getRating());
        this.tip_incastrare = v.tip_incastrare;
        this.tip_display = v.tip_display;
        this.clasa_energetica = v.clasa_energetica;
        this.nrPrograme = v.nrPrograme;
        this.functii = v.functii;

    }

    public String toString() {

        return super.toString() + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Numar Programe: " + nrPrograme + "\n Functii: "
                + functii;
    }

    public String getClasaEnergetica() {
        return clasa_energetica;
    }

    public void setClasaEnergetica(String clasa_energetica) {
        this.clasa_energetica = clasa_energetica;
    }

    public String getTipDisplay() {
        return tip_display;
    }

    public void setTipDisplay(String tip_display) {
        this.tip_display = tip_display;
    }
}
