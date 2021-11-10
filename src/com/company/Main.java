package com.company;

import java.util.ArrayList;
//import java.util.Vector;
import java.util.List;
import java.util.Vector;

public class Main {
    public static Vector<CuptoareElectrice> vectorCuptoareElectrice(){
        CuptoareElectrice ce1= new CuptoareElectrice("Cuptoare Electrice", 599.99f, true, "CEA-4520DBL", "Star-Light", "5", "Prajire, Grilling, Convectie, Coacere", "Negru", "Oprire automata, Iluminare, Timer, Termostat, Semnal acustic, Indicator luminos, Dezghetare", 2000 , 230 );
        CuptoareElectrice ce2= new CuptoareElectrice("Cuptoare Electrice", 235.03f, true, "Floria-2898", "Floria", "4.3", "Prajire, Coacere, Patiserie, Rumenire", "Negru", "Termostat, Indicator luminos", 1500 , 320 );
        CuptoareElectrice ce3= new CuptoareElectrice("Cuptoare Electrice", 333.20f, true, "ZLN-3130", "ZILAN", "4.3", "Sotare, Coacere, Gratinat, Patiserie, Rumenire", "Gri", "Oprire automata, Termostat, Semnal acustic", 1300 , 300 );
        CuptoareElectrice ce4= new CuptoareElectrice("Cuptoare Electrice", 399.99f, true, "CEA-3016CBL", "Star-Light", "4,8", "Prajire, Grilling, Convectie, Coacere", "Negru", "Oprire automata, Iluminare, Timer, Termostat, Semnal acustic, Indicator luminos", 1600 , 230 );
        CuptoareElectrice ce5= new CuptoareElectrice("Cuptoare Electrice", 234.99f, false, "A28B2", "Albatros", "4.8", "Prajire, Frigere, Coacere", "Negru", "Semnal acustic", 1500 , 230 );
        CuptoareElectrice ce6= new CuptoareElectrice("Cuptoare Electrice", 449.00f, true, "Express Air Fry 26095-56", "Russell Hobbs", "5", "Prajire, Convectie, Coacere", "Argintiu", "Timer, Mentinere la cald", 1500 , 220 );
        CuptoareElectrice ce7= new CuptoareElectrice("Cuptoare Electrice", 338.00f, true, "CS45B2", "Samus", "4.6", "Coacere", "Negru", "Semnal acustic", 2000 , 230 );
        CuptoareElectrice ce8= new CuptoareElectrice("Cuptoare Electrice", 159.90f, true, "MN-1009", "MUHLER", "0", "Frigere", "Negru", "Timer", 650 , 230 );
        CuptoareElectrice ce9= new CuptoareElectrice("Cuptoare Electrice", 249.00f, true, "HarlemÂ® Rustic", "Harlem", "3.8", "Prajire, Coacere, Patiserie", "Visiniu", "Termostat", 1300 , 320 );
        CuptoareElectrice ce10= new CuptoareElectrice("Cuptoare Electrice", 849.01f, true, "42814", "Gastroback", "5", "Grilling, Convectie, Coacere", "Negru/Inox", "Oprire automata, Iluminare, Timer, Termostat", 1500 , 230 );
        
        
        Vector <CuptoareElectrice> CE=new Vector<CuptoareElectrice>(10);
        CE.add(0,ce1);
        CE.add(1,ce2);
        CE.add(2,ce3);
        CE.add(3,ce4);
        CE.add(4,ce5);
        CE.add(5,ce6);
        CE.add(6,ce7);
        CE.add(7,ce8);
        CE.add(8,ce9);
        CE.add(9,ce10);

        return CE;
        }

        public static Vector<CuptoareMicrounde> vectorCuptoareMicrounde(){
            CuptoareMicrounde cm1= new CuptoareMicrounde("Cuptoare cu Microunde", 256.99f, true, "KOR-6S20W", "Daewoo", "4.5", "Standard", "Mecanic", "Microunde", "Alb", "Timer, Pornire intarziata, Interior neaderent");
            CuptoareMicrounde cm2= new CuptoareMicrounde("Cuptoare cu Microunde", 229.99f, true, "AMG17M70VH", "Hansa", "4.5", "Standard", "Mecanic", "Microunde", "Alb", "Timer, Blocare acces copii, Semnal sonor la finalizarea programului");
            CuptoareMicrounde cm3= new CuptoareMicrounde("Cuptoare cu Microunde", 306.99f, true, "MS23K3515AK/OL", "Samsung", "4.6", "Standard", "Digital", "Microunde", "Negru", "Timer, Blocare acces copii, Semnal sonor la finalizarea programului, Elimina mirosuri neplacute, Afisare ceas, Mod Eco, Auto cook");
            CuptoareMicrounde cm4= new CuptoareMicrounde("Cuptoare cu Microunde", 309.00f, true, "20MWS-706M/B", "BBK", "0", "Standard", "Digital", "Microunde", "Negru", "Timer, Semnal sonor la finalizarea programului");              
            CuptoareMicrounde cm5= new CuptoareMicrounde("Cuptoare cu Microunde", 319.99f, true, "HMW-20GRD", "HEINNER", "4.7", "Standard", "Digital", "Microunde, Grill", "Rosu", "Timer, Blocare acces copii, Semnal sonor la finalizarea programului");
            CuptoareMicrounde cm6= new CuptoareMicrounde("Cuptoare cu Microunde", 329.99f, true, "ZFM20100SA", "Zanussi", "4.8", "Standard", "Mecanic", "Microunde", "Argintiu", "Timer, Iluminare interioara, Semnal sonor la finalizarea programului");
            CuptoareMicrounde cm7= new CuptoareMicrounde("Cuptoare cu Microunde", 349.99f, false, "KOR-669RC", "Daewoo", "4.8", "Standard", "Digital", "Microunde", "Crem", "Oprire automata, Timer, Blocare acces copii, Semnal sonor la finalizarea programului, Mod Eco, Auto cook");
            CuptoareMicrounde cm8= new CuptoareMicrounde("Cuptoare cu Microunde", 354.99f, true, "MM2005/RD", "Oursson", "5", "Standard", "Mecanic", "Microunde", "Rosu", "Timer, Functie de decongelare");
            CuptoareMicrounde cm9= new CuptoareMicrounde("Cuptoare cu Microunde", 375.90f, true, "FMO-2073BS", "Finlux", "4.5", "Standard", "Mecanic", "Microunde", "Negru/Argintiu", "Iluminare interioara");
            CuptoareMicrounde cm10= new CuptoareMicrounde("Cuptoare cu Microunde", 379.99f, true, "MO20E1S", "Gorenje", "4.8", "Standard", "Digital", "Microunde", "Argintiu", "Semnal sonor la finalizarea programului, Functia AquaClean");

            Vector <CuptoareMicrounde> CM=new Vector<CuptoareMicrounde>(10);
            CM.add(0,cm1);
            CM.add(1,cm2);
            CM.add(2,cm3);
            CM.add(3,cm4);
            CM.add(4,cm5);
            CM.add(5,cm6);
            CM.add(6,cm7);
            CM.add(7,cm8);
            CM.add(8,cm9);
            CM.add(9,cm10);

            return CM;
            }

    public static Vector<LadaFrigorifica> vectorLF(){
        LadaFrigorifica lf1= new LadaFrigorifica("Frigorifice", 1419.99f, true, "AO47P30", "Arctic", "4.7 stele", "C","Alb");
        LadaFrigorifica lf2= new LadaFrigorifica("Frigorifice", 959.99f, true, "HCF-205NHA+", "Heinner", "3.6 stele", "A+","Alb");
        LadaFrigorifica lf3= new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF-205NHSA+", "Heinner", "3.6 stele", "A+","Silver");
        LadaFrigorifica lf4= new LadaFrigorifica("Frigorifice", 1099.99f, true, "AD60310M30MT", "Arctic", "4.63 stele", "F","Alb");
        LadaFrigorifica lf5= new LadaFrigorifica("Frigorifice", 1079.99f, true, "HCF-205NHBKA+", "Heinner", "4.8 stele", "A+","Negru");
        LadaFrigorifica lf6= new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF-H205A+", "Heinner", "4.63 stele", "A+","Alb");
        LadaFrigorifica lf7= new LadaFrigorifica("Frigorifice", 899.0f, true, "AD60310M30MT", "Arctic", "4.1 stele", "F","Alb");
        LadaFrigorifica lf8= new LadaFrigorifica("Frigorifice",1178.10f, true, " O20+", "Arctic", "3.6 stele", "A+","Alb");
        LadaFrigorifica lf9= new LadaFrigorifica("Frigorifice", 3133.98f, true, "Arktic by Hendi", "Arktic by Hendi", "4.7 stele", "F","Alb");
        LadaFrigorifica lf10=new LadaFrigorifica("Frigorifice", 11909.52f, false,"Paris 210 LED-HI ADT", "AHT", "fara", "F","Alb");
        LadaFrigorifica lf11=new LadaFrigorifica("Frigorifice", 4729.06f, true, "Sao Paulo H 175", "AHT", "fara", "F","Alb");
        LadaFrigorifica lf12=new LadaFrigorifica("Frigorifice", 1289.0f, true, "AO40P30+", "Arctic", "4.63 stele", "F","Alb");
        
        Vector <LadaFrigorifica> LF=new Vector<LadaFrigorifica>(12);
        LF.add(0,lf1);
        LF.add(1,lf2);
        LF.add(2,lf3);
        LF.add(3,lf4);
        LF.add(4,lf5);
        LF.add(5,lf6);
        LF.add(6,lf7);
        LF.add(7,lf8);
        LF.add(8,lf9);
        LF.add(9,lf10);
        LF.add(10,lf11);
        LF.add(11,lf12);
    
        return LF;
        }

        public static Vector<Frigider> vectorFrigidere(){
            Frigider f1=new  Frigider("Frigorifice", 1149.99f, true, "AD60310M30MT", "Arctic", "4.63 stele", "Standard", "Fara", "F");
            Frigider f2=new  Frigider("Frigorifice", 899.99f, true, "FDDV-213F", "Star-Light", "4.82 stele", "Standard", "Fara", "F");
            Frigider f3=new  Frigider("Frigorifice", 1799.99f, true, "RT38K5530S9/EO", "Samsung", "4.38 stele", "Incorporabil", "amoled", "F");
            Frigider f4=new  Frigider("Frigorifice", 599.99f, true, "MDRD142FGF42", "MIDEA", "4.7 stele", "Standard", "Fara", "F");
            Frigider f5=new  Frigider("Frigorifice", 2209.99f, false, "RDNE505E30DZMN", "Beko", "4.7 stele", "Standard", "Touchscreen", "E");
            Frigider f6=new  Frigider("Frigorifice", 1679.99f, true, "RDNT401I30WBN", "Beko", "4.7 stele", "Incorporabil", "Touchcreen", "F");
            Frigider f7=new  Frigider("Frigorifice", 5099.99f, true, "K 28202SD", "Miele", "3.1 stele", "Standard", "Touchscreen", "F");
            Frigider f8=new  Frigider("Frigorifice", 1828.99f, true, "FBM260L", "CHiQ", "4.6 stele", "Incorporabil", "Fara", "F");
            Frigider f9=new  Frigider("Frigorifice", 1091.99f, true, "AK54305M30MT", "Arctic", "4.8 stele", "Standard", "Fara", "F");
            Frigider f10=new Frigider("Frigorifice", 1449.99f, true, "AK60366M40NF", "Arctic", "4.7 stele", "Standard", "Fara", "F");
            Frigider f11=new Frigider("Frigorifice", 2089.99f, true, "RN-308RDQM", "Daewoo", "4.63 stele", "Standard", "vise", "H");
            Frigider f12=new Frigider("Frigorifice", 3899.99f, true, "KFN 28132 ws", "Miele", "4.63 stele", "Incorporabil", "Touchscreen", "F");
        
                Vector <Frigider> F=new Vector<Frigider>(12);
                F.add(0,f1);
                F.add(1,f2);
                F.add(2,f3);
                F.add(3,f4);
                F.add(4,f5);
                F.add(5,f6);
                F.add(6,f7);
                F.add(7,f8);
                F.add(8,f9);
                F.add(9,f10);
                F.add(10,f11);
                F.add(11,f12);
        
                return F;
        
        }

    


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


        //teastare + vector Antonie 6+7 cred

        Frigider f1=new Frigider();
        Frigider f2=new Frigider("Frigorifice", 1091.99f, true, "AK54305M30MT", "Arctic", "4.8 stele", "Standard", "Fara", "F");
        Frigider f3=new Frigider(f2);
        LadaFrigorifica lf1=new LadaFrigorifica();
        LadaFrigorifica lf2=new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF-H205A+", "Heinner", "4.63 stele", "A+","Alb");
        LadaFrigorifica lf3=new LadaFrigorifica(lf2);
        System.out.println(f1+"\n"+f1+"\n"+f3+"\n"+lf1+"\n"+lf1+"\n"+lf3+"\n"+"\n"+"\n");

        Vector<Frigider> f=  vectorFrigidere();
        for(int i=0;i<f.capacity();i++)
         System.out.println(f.get(i)+"\n"+"\n"+"\n");
         Vector<LadaFrigorifica> lf= vectorLF();
        for(int i=0;i<lf.capacity();i++)
         System.out.println(lf.get(i)+"\n"+"\n"+"\n");
         //gata cu ale lui Antonie cam ez




         ///vintila andrei testare+ vector
         //Cuptoare Microunde si Cuptoare Electrice testare
         CuptoareMicrounde d= new CuptoareMicrounde("Cuptoare cu Microunde", 256.99f, true, "KOR-6S20W", "Daewoo", "4.5", "Standard", "Mecanic", "Microunde", "Alb", "Timer, Pornire intarziata, Interior neaderent");
         System.out.println(d + "\n");
         CuptoareElectrice p= new CuptoareElectrice("Cuptoare Electrice", 599.99f, true, "CEA-4520DBL", "Star-Light", "5", "Prajire, Grilling, Convectie, Coacere", "Negru", "Oprire automata, Iluminare, Timer, Termostat, Semnal acustic, Indicator luminos, Dezghetare", 2000 , 230 );
         System.out.println( p+ "\n");

         Vector<CuptoareMicrounde> cm= vectorCuptoareMicrounde(); 
         for(int i=0;i<cm.capacity();i++)
         System.out.println(cm.get(i)+"\n"+"\n"+"\n");
         Vector<CuptoareElectrice> ce= vectorCuptoareElectrice(); 
         for(int i=0;i<ce.capacity();i++)
         System.out.println(ce.get(i)+"\n"+"\n"+"\n");
    }
}