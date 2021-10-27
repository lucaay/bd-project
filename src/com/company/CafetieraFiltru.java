package com.company;

public class CafetieraFiltru extends Electrocasnice {
    /////date membre
    
    private String culoare;
    private String tip_cafea;
    /////metode
    CafetieraFiltru(){
       
        culoare="Necunoscut";
        tip_cafea="Macinata";
        //capacitate
        
    }

    CafetieraFiltru(String culoare,String tip_cafea){
     
        this.culoare=culoare;
        this.tip_cafea=tip_cafea;
        
    }

    public CafetieraFiltru(CafetieraFiltru l){
        
        this.culoare=l.culoare;
        this.tip_cafea=l.tip_cafea;
        
        }
    
    public String toString(){

        return super.toString()+"\n Culoare: "+culoare+"\n Tip cafea(Macinata/boabe/capsule)"+tip_cafea;
    }
}