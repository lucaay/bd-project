package com.company;


//import java.util.Vector;

public class CuptoareElectrice extends Electrocasnice {
    ///// date membre

    private String tip_gatire;
    private String tip_culoare;
    private String functii;
    private float putere;
    private float temperatura_maxima;

    ///// metode
    CuptoareElectrice() {
        super();
        tip_gatire = "Necunoscut";
        tip_culoare = "Necunoscut";
        functii = "Necunoscut";
        putere = 0.01f;
        temperatura_maxima = 0.01f;

    }

    CuptoareElectrice(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String tip_gatire, String tip_culoare, String functii,
            float putere, float temperatura_maxima) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.tip_gatire = tip_gatire;
        this.tip_culoare = tip_culoare;
        this.functii = functii;
        this.putere = putere;
        this.temperatura_maxima = temperatura_maxima;

    }

    public CuptoareElectrice(CuptoareElectrice f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.tip_gatire = f.tip_gatire;
        this.tip_culoare = f.tip_culoare;
        this.functii = f.functii;
        this.putere = f.putere;
        this.temperatura_maxima = f.temperatura_maxima;
    }

    public String toString() {

        return super.toString()  + "\n Tip Gatire: " + tip_gatire
                + "\n Tip Culoare: " + tip_culoare + "\n Functii: " + functii + "\n Putere: " + putere + "W"
                + "\n Temperatura Maxima:" + temperatura_maxima + "C";
    }

}