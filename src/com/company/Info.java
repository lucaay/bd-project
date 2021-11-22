package com.company;

import java.util.Vector;

public class Info {

    public  Vector<LadaFrigorifica> vectorLF() {
        LadaFrigorifica lf1 = new LadaFrigorifica("Frigorifice", 1419.99f, true, "AO47P30", "Arctic", "4.7 stele", "C",
                "Alb");
        LadaFrigorifica lf2 = new LadaFrigorifica("Frigorifice", 959.99f, true, "HCF-205NHA+", "Heinner", "3.6 stele",
                "A+", "Alb");
        LadaFrigorifica lf3 = new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF-205NHSA+", "Heinner", "3.6 stele",
                "A+", "Silver");
        LadaFrigorifica lf4 = new LadaFrigorifica("Frigorifice", 1099.99f, true, "AD60310M30MT", "Arctic", "4.63 stele",
                "F", "Alb");
        LadaFrigorifica lf5 = new LadaFrigorifica("Frigorifice", 1079.99f, true, "HCF-205NHBKA+", "Heinner",
                "4.8 stele", "A+", "Negru");
        LadaFrigorifica lf6 = new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF-H205A+", "Heinner", "4.63 stele",
                "A+", "Alb");
        LadaFrigorifica lf7 = new LadaFrigorifica("Frigorifice", 899.0f, true, "AD60310M30MT", "Arctic", "4.1 stele",
                "F", "Alb");
        LadaFrigorifica lf8 = new LadaFrigorifica("Frigorifice", 1178.10f, true, " O20+", "Arctic", "3.6 stele", "A+",
                "Alb");
        LadaFrigorifica lf9 = new LadaFrigorifica("Frigorifice", 3133.98f, true, "Arktic by Hendi", "Arktic by Hendi",
                "4.7 stele", "F", "Alb");
        LadaFrigorifica lf10 = new LadaFrigorifica("Frigorifice", 11909.52f, false, "Paris 210 LED-HI ADT", "AHT",
                "fara", "F", "Alb");
        LadaFrigorifica lf11 = new LadaFrigorifica("Frigorifice", 4729.06f, true, "Sao Paulo H 175", "AHT", "fara", "F",
                "Alb");
        LadaFrigorifica lf12 = new LadaFrigorifica("Frigorifice", 1289.0f, true, "AO40P30+", "Arctic", "4.63 stele",
                "F", "Alb");

        Vector<LadaFrigorifica> LF = new Vector<LadaFrigorifica>(12);
        LF.add(0, lf1);
        LF.add(1, lf2);
        LF.add(2, lf3);
        LF.add(3, lf4);
        LF.add(4, lf5);
        LF.add(5, lf6);
        LF.add(6, lf7);
        LF.add(7, lf8);
        LF.add(8, lf9);
        LF.add(9, lf10);
        LF.add(10, lf11);
        LF.add(11, lf12);

        return LF;
    }
   
    public  Vector<Frigider> vectorFrigidere() {
        Frigider f1 = new Frigider("Frigorifice", 1149.99f, true, "AD60310M30MT", "Arctic", "4.63", "Standard",
                "Fara", "F");
        Frigider f2 = new Frigider("Frigorifice", 899.99f, true, "FDDV-213F", "Star-Light", "4.82", "Standard",
                "Fara", "F");
        Frigider f3 = new Frigider("Frigorifice", 1799.99f, true, "RT38K5530S9/EO", "Samsung", "4.38",
                "Incorporabil", "amoled", "F");
        Frigider f4 = new Frigider("Frigorifice", 599.99f, true, "MDRD142FGF42", "MIDEA", "4.7", "Standard",
                "Fara", "F");
        Frigider f5 = new Frigider("Frigorifice", 2209.99f, false, "RDNE505E30DZMN", "Beko", "4.7", "Standard",
                "Touchscreen", "E");
        Frigider f6 = new Frigider("Frigorifice", 1679.99f, true, "RDNT401I30WBN", "Beko", "4.7", "Incorporabil",
                "Touchcreen", "F");
        Frigider f7 = new Frigider("Frigorifice", 5099.99f, true, "K 28202SD", "Miele", "3.1", "Standard",
                "Touchscreen", "F");
        Frigider f8 = new Frigider("Frigorifice", 1828.99f, true, "FBM260L", "CHiQ", "4.6", "Incorporabil",
                "Fara", "F");
        Frigider f9 = new Frigider("Frigorifice", 1091.99f, true, "AK54305M30MT", "Arctic", "4.8", "Standard",
                "Fara", "F");
        Frigider f10 = new Frigider("Frigorifice", 1449.99f, true, "AK60366M40NF", "Arctic", "4.7", "Standard",
                "Fara", "F");
        Frigider f11 = new Frigider("Frigorifice", 2089.99f, true, "RN-308RDQM", "Daewoo", "4.63", "Standard",
                "vise", "H");
        Frigider f12 = new Frigider("Frigorifice", 3899.99f, true, "KFN 28132 ws", "Miele", "4.63",
                "Incorporabil", "Touchscreen", "F");

        Vector<Frigider> F = new Vector<Frigider>(12);
        F.add(0, f1);
        F.add(1, f2);
        F.add(2, f3);
        F.add(3, f4);
        F.add(4, f5);
        F.add(5, f6);
        F.add(6, f7);
        F.add(7, f8);
        F.add(8, f9);
        F.add(9, f10);
        F.add(10, f11);
        F.add(11, f12);

        return F;

    }
    
    
}
