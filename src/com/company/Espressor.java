package com.company;


public class Espressor extends Electrocasnice {
    //Date membre
    private String culoare;
    private float putere;
    private String tipcafea;


    //Metode
    Espressor() {
        super();
        this.culoare = " ";
        this.putere = 0.01f;
        this.tipcafea = " ";
    }

    Espressor(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand, String rating, String culoare,
            float putere, String tipcafea) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.culoare = culoare;
        this.putere = putere;
        this.tipcafea = tipcafea;
    }

    public Espressor(Espressor f) {
        super.setBrand(f.getBrand());
        super.setModel(f.getModel());
        super.setPret(f.getPret());

        super.setDisponibilitate(f.getDisponibilitate());
        super.setTip_electrocasnice(f.getTip_electrocasnice());
        super.setRating(f.getRating());
        this.culoare = f.culoare;
        this.putere = f.putere;
        this.tipcafea = f.tipcafea;
    }

    // setteri & getteri
    public float getPutere() {
        return putere;
    }

    public void setPutere(float putere) {
        this.putere = putere;
    }

    public String getTipcafea(){
        return tipcafea;
    }

    public void setTipcafea(String tipcafea){
        this.tipcafea = tipcafea;
    }

    public void setCuloare(String culoare){
        this.culoare =culoare;
    }

    public String getCuloare(){
        return culoare;
    }

    public String toString() {

        return super.toString() + "\n Putere: " + putere + "W" + "\n Tip Cafea permisa: " + tipcafea + "\n Culoare: " + culoare;
    }
}