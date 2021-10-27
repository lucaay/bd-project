package com.company;
import java.util.ArrayList;
import java.util.List;

public class CuptoareElectrice extends Electrocasnice {
    /////date membre

    private String tip_incastrare;
    private String tip_produs;
    private String tip_culoare;
    private List<String> functii;
    private float putere;
    private float temperatura_maxima;
    /////metode
    CuptoareElectrice() {
        
        tip_incastrare = "Necunoscut";
        tip_produs = "Necunoscut";
        tip_culoare = "Necunoscut";
        functii = new ArrayList<String>();
        functii.add("Necunoscut");
        putere=0.01f; 
        temperatura_maxima = 0.01f;
    
    }

    CuptoareElectrice(String tip_incastrare,String tip_produs, String tip_culoare,List<String> functii, float putere,
     float temperatura_maxima) {
        this.tip_incastrare = tip_incastrare;
        this.tip_produs=tip_produs;
        this.tip_culoare = tip_culoare;
        this.putere = putere;
        this.temperatura_maxima = temperatura_maxima;
        
    }

    public CuptoareElectrice(CuptoareElectrice f) {
    
        this.tip_incastrare = f.tip_incastrare;
        this.tip_produs = f.tip_produs;
        this.tip_culoare=f.tip_culoare;
        this.functii = f.functii;
        this.putere = f.putere;
        this.temperatura_maxima = f.temperatura_maxima;
    }
    public String toString(){

        return super.toString()+"\n Tip Încastrare: "+tip_incastrare+"\n Tip Produs: "+tip_produs+"\n Tip Culoare: "+tip_culoare
        +"\n Functii"+functii+"\n Putere:"+putere+"\n Temperatura Maxima:"+temperatura_maxima;
    }

}