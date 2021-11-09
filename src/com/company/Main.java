package com.company;

import java.util.ArrayList;
//import java.util.Vector;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> functii = new ArrayList<>();
        functii.add("f1");
        functii.add("f2");
        functii.add("f3");
        Frigider f = new Frigider(null, 20034f, null, "da", "nu", "poate", "ce", "wow", null, null, null, functii);
        System.out.println(f + "\n");

        CafetieraFiltru c = new CafetieraFiltru("cafetiera", 500, true, "cf5", "heinner", "5 Stars", "black", "filtru");

        System.out.println(c + "\n");

        Espressor e = new Espressor("espressor", 320, false, "g5", "acer", "5 stelle", 5000);
        System.out.println(e + "\n");

        MasinaSpalatRufe r = new MasinaSpalatRufe("Masini de spalat", 5500, true, "ghfs56", "Arctic", "4.5",
                "incorporat", "LED", "A+", 12, "Spalare la 30grade, Spalare la 800 rpm");

        System.out.println(r + "\n");

        MasinaSpalatVase v = new MasinaSpalatVase("Masini de spalat", 3500, false, "ajdh49871", "Acer", "3",
                "incorporat", "LCD", "A+", 4, "Spalare rapida, Spalare  cu temperatura scazuta");

    }
}