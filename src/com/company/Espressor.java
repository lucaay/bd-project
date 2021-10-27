package com.company;

import java.util.Vector;

public class Espressor extends Electrocasnice {
    /////date membre
    private float putere;
    /////metode
    Espressor(){
       super();
       this.putere=0.01f;
    }

    Espressor(String tip_electrocasnice,float pret,Boolean disponibilitate,String model,String brand,String rating,Vector<Integer>capacitate,float putere){
        super(tip_electrocasnice,pret,disponibilitate,model,brand,rating,capacitate);
        this.putere=putere;
        
    }

    public Espressor(Espressor l,Electrocasnice e){
       super(e);
       this.putere=l.putere;
    }
    public String toString(){

        return super.toString()+"\n Putere: "+putere;
    }
    //setteri & getteri
    public float getPutere(){return putere;}
    public void setPutere(float putere){this.putere=putere;}
}