package com.company;
import java.util.ArrayList;

import java.util.List;
public class LadaFrigorifica extends Electrocasnice {
    /////date membre
    private String clasa_energetica;
    private List<String> functii;
    /////metode
    LadaFrigorifica(){
  
        clasa_energetica="Necunoscut";
        functii=new ArrayList<String>();
        functii.add("Necunoscut");
     
    }

    LadaFrigorifica(String tip_incastrare,String tip_display, String clasa_energetica, String sistem_dezghetare,
     String sistem_racire,List<String> functii){
     
        this.clasa_energetica=clasa_energetica;
        this.functii=functii;
    
    }

    public LadaFrigorifica(LadaFrigorifica l){
        this.clasa_energetica=l.clasa_energetica;
        this.functii=l.functii;
  
    }
    public String toString(){

        return super.toString()+"\n Clasa energetica: "+clasa_energetica+"\n Functii: "+functii;
                
    }
}
