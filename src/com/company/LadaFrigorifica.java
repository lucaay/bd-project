package com.company;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
public class LadaFrigorifica extends Electrocasnice {
    /////date membre
    private float pret;
    private String model;
    private String disponibilitate;
    private String brand;
    private String rating;
    private String clasa_energetica;
    private List<String> functii;
    private Vector<Integer> capacitate;
    /////metode
    LadaFrigorifica(){
        pret=0;
        model="Necunoscut";
        disponibilitate="Necunoscut";
        brand="Necunoscut";
        rating="⭐";
        clasa_energetica="Necunoscut";
        functii=new ArrayList<String>();
        functii.add("Necunoscut");
        //capacitate
        capacitate=new Vector<Integer>();
        for(int i=0;i<4;i++)
            capacitate.add(i,0);
    }

    LadaFrigorifica(float pret,String model, String disponibilitate, String brand, String rating, String tip_incastrare,
             String tip_display, String clasa_energetica, String sistem_dezghetare, String sistem_racire,
             List<String> functii,Vector<Integer> capacitate){
        this.pret=pret;
        this.model=model;
        this.disponibilitate=disponibilitate;
        this.brand=brand;
        this.rating=rating;
        this.clasa_energetica=clasa_energetica;
        this.functii=functii;
        this.capacitate=new Vector<Integer>();
        for(int i=0;i<capacitate.capacity();i++){
            this.capacitate.add(i,capacitate.get(i));
        }
    }

    public LadaFrigorifica(LadaFrigorifica l){
        this.pret=l.pret;
        this.model=l.model;
        this.disponibilitate=l.disponibilitate;
        this.brand=l.brand;
        this.rating=l.rating;
        this.clasa_energetica=l.clasa_energetica;
        this.functii=l.functii;
        this.capacitate=new Vector<Integer>(3);
        for(int i=0;i<l.capacitate.capacity();i++){
            this.capacitate.add(i,l.capacitate.get(i));
        }
    }
    public String toString(){

        return " Pret: "+pret+"\n Model: "+model+"\n Disponibilitate: "+disponibilitate+
                "\n Brand: "+brand+"\n Rating: "+rating+"\n Clasa energetica: "+clasa_energetica+"\n Functii: "+functii+
                "\n Capacitate: "+ capacitate;
    }
}
