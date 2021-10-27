package com.company;

public class Espressor extends Electrocasnice {
    /////date membre
    private float putere;
    /////metode
    Espressor(){
       this.putere=0.01f;
    }

    Espressor(float putere){
        
        this.putere=putere;
        
    }

    public Espressor(Espressor l){
 
       this.putere=l.putere;
    }
    public String toString(){

        return super.toString()+"\n Putere: "+putere;
    }
    //setteri & getteri
    public float getPutere(){return putere;}
    public void setPutere(float putere){this.putere=putere;}
}