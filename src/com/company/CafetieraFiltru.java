package com.company;

import java.util.Vector;

public class CafetieraFiltru extends Electrocasnice {
    /////date membre
    private float pret;
    private String model;
    private String brand;
    private String rating;
    private String culoare;
    private String tip_cafea;
    private Vector<Integer> capacitate;
    /////metode
    CafetieraFiltru(){
        pret=0;
        model="Necunoscut";
        brand="Necunoscut";
        rating="⭐";
        culoare="Necunoscut";
        tip_cafea="Macinata";
        //capacitate
        capacitate=new Vector<Integer>();
        for(int i=0;i<4;i++)
            capacitate.add(i,0);
    }

    CafetieraFiltru(float pret,String model, String brand, String rating,String culoare,String tip_cafea, Vector<Integer> capacitate){
        this.pret=pret;
        this.model=model;
        this.brand=brand;
        this.rating=rating;
        this.culoare=culoare;
        this.tip_cafea=tip_cafea;
        this.capacitate=new Vector<Integer>();
        for(int i=0;i<capacitate.capacity();i++){
            this.capacitate.add(i,capacitate.get(i));
        }
    }

    public CafetieraFiltru(CafetieraFiltru l){
        this.pret=l.pret;
        this.model=l.model;
        this.brand=l.brand;
        this.rating=l.rating;
        this.culoare=l.culoare;
        this.tip_cafea=l.tip_cafea;
        this.capacitate=new Vector<Integer>(3);
        for(int i=0;i<l.capacitate.capacity();i++){
            this.capacitate.add(i,l.capacitate.get(i));
        }
    }
    public String toString(){

        return super.toString()+"\n Pret: "+pret+"\n Model: "+model+"\n Brand: "+brand+"\n Rating: "+rating+
        "\n Culoare: "+culoare+"\n Tip cafea(Macinata/boabe/capsule)"+tip_cafea+"\n Capacitate: "+ capacitate;
    }
}