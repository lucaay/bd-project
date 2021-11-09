package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Frigider extends Electrocasnice {
    ///// date membre

    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private String sistem_dezghetare;
    private String sistem_racire;
    private List<String> functii;

    ///// metode
    Frigider() {
        super();
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        sistem_dezghetare = "Necunoscut";
        sistem_racire = "Necunoscut";
        functii = new ArrayList<String>();
        functii.add("Necunoscut");

    }

    public void set_TipElectrocasnice(String s) {
        super.setTip_electrocasnice(s);
    }

    public void setpret(float s) {
        super.setPret(s);
    }

    public void set_Disponibilitate(Boolean s) {
        super.setDisponibilitate(s);
    }

    public void set_Model(String s) {
        super.setModel(s);
    }

    public void set_Brand(String s) {
        super.setBrand(s);
    }

    public void set_Rating(String s) {
        super.setRating(s);
    }

    public void setIncastrare(String rez) {
        tip_incastrare = rez;
    }

    public void setTipDisplay(String rez) {
        tip_display = rez;
    }

    public void setClasaEnergetica(String rez) {
        clasa_energetica = rez;
    }

    public void setSistemDezghetare(String rez) {
        sistem_dezghetare = rez;
    }

    public void setSistemRacire(String rez) {
        sistem_racire = rez;
    }

    public void setFunctii(List<String> rez) {
        functii = rez;
    }

    Frigider(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand, String rating,
            String tip_incastrare, String tip_display, String clasa_energetica, String sistem_dezghetare,
            String sistem_racire, List<String> functii) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.sistem_dezghetare = sistem_dezghetare;
        this.sistem_racire = sistem_racire;
        this.functii = functii;

    }

    public Frigider(Frigider f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.tip_incastrare = f.tip_incastrare;
        this.tip_display = f.tip_display;
        this.clasa_energetica = f.clasa_energetica;
        this.sistem_dezghetare = f.sistem_dezghetare;
        this.sistem_racire = f.sistem_racire;
        this.functii = f.functii;

    }

    public String toString() {

        return super.toString() + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Sistem Dezghetare: " + sistem_dezghetare
                + "\n Sistem racire: " + sistem_racire + "\n Functii" + functii;
    }

}
