package com.company;//calea 

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class MasinaSpalatRufe extends Electrocasnice {

    private String tip_incastrare;
    private String tip_display;
    private String clasa_energetica;
    private int nrPrograme;
    private List<String> functii;
 

    ///// metode
    MasinaSpalatRufe() {
        super();
        tip_incastrare = "Necunoscut";
        tip_display = "Necunoscut";
        clasa_energetica = "Necunoscut";
        nrPrograme = 0;
        functii = new ArrayList<String>();
        functii.add("Necunoscut");
    
    }

    MasinaSpalatRufe(String tip_electrocasnice,float pret,Boolean disponibilitate,String model,String brand,String rating,Vector<Integer>capacitate,String tip_incastrare, String tip_display, String clasa_energetica, int nrPrograme, List<String> functii) {
        super(tip_electrocasnice,pret,disponibilitate,model,brand,rating,capacitate);
        this.tip_incastrare = tip_incastrare;
        this.tip_display = tip_display;
        this.clasa_energetica = clasa_energetica;
        this.nrPrograme = nrPrograme;
        this.functii = functii;
  
    }

    public MasinaSpalatRufe(MasinaSpalatRufe a,Electrocasnice e) {
        super(e);
        this.tip_incastrare = a.tip_incastrare;
        this.tip_display = a.tip_display;
        this.clasa_energetica = a.clasa_energetica;
        this.nrPrograme = a.nrPrograme;
        this.functii = a.functii;
    
    }
//override
    public String toString() {

        return super.toString()+"\n Tip Încastrare: " + tip_incastrare + "\n Tip Display: " + tip_display
                + "\n Clasa Energetica: " + clasa_energetica + "\n Numar Programe: " + nrPrograme + "\n Functii"+functii;
    }

}
