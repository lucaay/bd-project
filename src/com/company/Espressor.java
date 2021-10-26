package com.company;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Vector;

public class Espressor extends Electrocasnice {
    /////date membre
    private float pret;
    private String model;
    private String brand;
    private String rating;
    private float putere;
    private Vector<Integer> capacitate;
    /////metode
    Espressor(){
        pret=0;
        model="Necunoscut";
        putere=750.001f;
        brand="Necunoscut";
        rating="⭐";
        //capacitate
        capacitate=new Vector<Integer>();
        for(int i=0;i<4;i++)
            capacitate.add(i,0);
    }

    Espressor(float pret,float putere,String model, String brand, String rating, Vector<Integer> capacitate){
        this.pret=pret;
        this.putere=putere;
        this.model=model;
        this.brand=brand;
        this.rating=rating;
        this.capacitate=new Vector<Integer>();
        for(int i=0;i<capacitate.capacity();i++){
            this.capacitate.add(i,capacitate.get(i));
        }
    }

    public Espressor(Espressor l){
        this.pret=l.pret;
        this.putere=l.putere;
        this.model=l.model;
        this.brand=l.brand;
        this.rating=l.rating;
        this.capacitate=new Vector<Integer>(3);
        for(int i=0;i<l.capacitate.capacity();i++){
            this.capacitate.add(i,l.capacitate.get(i));
        }
    }
    public String toString(){

        return " Pret: "+pret+"\n Putere: "+putere+"\n Model: "+model+
                "\n Brand: "+brand+"\n Rating: "+rating+"\n Capacitate: "+ capacitate;
    }
}