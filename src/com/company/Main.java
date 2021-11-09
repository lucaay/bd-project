package com.company;

import java.util.ArrayList;
//import java.util.Vector;
import java.util.List;

public class Main {


    //Testare Frigider.
    public static void main(String[] args) {
        List<String> functii = new ArrayList<>();
        functii.add("f1");
        functii.add("f2");
        functii.add("f3");
      
    


        //Cafetiera cu Filtru si Espressor testare.
        CafetieraFiltru c = new CafetieraFiltru("Cafetiera cu Filtru", 709.90f, true, "Grind&Brew HD7769", "PHILIPS", "5 stele", "Negru", "Macinata/Boabe");
        System.out.println(c + "\n");

        Espressor e = new Espressor("Espressor" , 1499.99f, true, "Magnifica S", "DE LONGHI" , "4.5 stele", "Negru", 1480, "Boabe/Macinata");
        System.out.println(e + "\n");


        //Masina de Spalat rufe si Masina de spalat Vase testare.
        MasinaSpalatRufe r = new MasinaSpalatRufe("Masini de spalat", 5500, true, "ghfs56", "Arctic", "4.5",
                "incorporat", "LED", "A+", 12, "Spalare la 30grade, Spalare la 800 rpm");
        System.out.println(r + "\n");

        MasinaSpalatVase v = new MasinaSpalatVase("Masini de spalat", 3500, false, "ajdh49871", "Acer", "3",
                "incorporat", "LCD", "A+", 4, "Spalare rapida, Spalare  cu temperatura scazuta");
        System.out.println(v + "\n");


    }
}