package com.company;


public class Electrocasnice {
    private String tip_electrocasnice;
    private float pret;
    private Boolean disponibilitate;
    private String model;
    private String brand;
    private String rating;

    Electrocasnice() {
        this.tip_electrocasnice = "1/2/3/4/5/6";
        this.disponibilitate = false;
        this.pret = 0.0f;
        this.model = "UNK";
        this.brand = "UNK";
        this.rating = "🌟";
    }

    Electrocasnice(Electrocasnice e) {
        this.tip_electrocasnice = e.tip_electrocasnice;
        this.pret = e.pret;
        this.disponibilitate = e.disponibilitate;
        this.model = e.model;
        this.brand = e.brand;
        this.rating = e.rating;
    }

    Electrocasnice(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating) {
        this.tip_electrocasnice = tip_electrocasnice;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
        this.model = model;
        this.brand = brand;
        this.rating = rating;
    }

    public String toString() {
        return " Tip: " + tip_electrocasnice + "\n Pret: " + pret + "\n Disponibilitate: " + disponibilitate
                + "\n Model: " + model + "\n Brand: " + brand + "\n Rating: " + rating;
    }

    /// setteri & getteri
    public Boolean getDisponibilitate() {
        return disponibilitate;
    }

    public void setDisponibilitate(Boolean disponibilitate) {
        this.disponibilitate = disponibilitate;
    }

    public String getTip_electrocasnice() {
        return tip_electrocasnice;
    }

    public void setTip_electrocasnice(String tip_electrocasnice) {
        this.tip_electrocasnice = tip_electrocasnice;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
