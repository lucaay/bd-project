package com.company;


//import java.util.Vector;

public class CuptoareMicrounde extends Electrocasnice {
    ///// date membre
    private String tip_incastrare;
    private String tip_panoucomanda;
    private String tip_modalitatigatire;
    private String tip_culoare;
    private String functii;

    ///// metode
    CuptoareMicrounde() {
        super();
        tip_incastrare = "Necunoscut";
        tip_panoucomanda = "Necunoscut";
        tip_culoare = "Necunoscut";
        functii = "Necunoscut";
        // capacitate

    }

    CuptoareMicrounde(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String tip_incastrare, String tip_panoucomanda, String tip_modalitatigatire,
            String tip_culoare, String functii) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.tip_incastrare = tip_incastrare;
        this.tip_panoucomanda = tip_panoucomanda;
        this.tip_modalitatigatire = tip_modalitatigatire;
        this.tip_culoare = tip_culoare;
        this.functii = functii;

    }

    public CuptoareMicrounde(CuptoareMicrounde f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());
        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.tip_incastrare = f.tip_incastrare;
        this.tip_panoucomanda = f.tip_panoucomanda;
        this.tip_modalitatigatire = f.tip_modalitatigatire;
        this.tip_culoare = f.tip_culoare;
        this.functii = f.functii;
    }

    public String toString() {

        return super.toString() + "\n Tip Încastrare: " + tip_incastrare + "\n Tip Panou Comanda: " + tip_panoucomanda
                + "\n Tip Modalitati Gatire: " + tip_modalitatigatire + "\n Tip Culoare: " + tip_culoare + "\n Functii: "
                + functii;
    }

}