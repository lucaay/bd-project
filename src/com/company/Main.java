package com.company;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
public class Main {

    public static void main(String[] args) {
      Frigider e=new Frigider();
        System.out.println(e+"\n");
        List<String>functii=new ArrayList<>();
        functii.add("f1");
        functii.add("f2");
        functii.add("f3");
        Vector<Integer>capacitate=new Vector<>(3);
        capacitate.add(10);
        capacitate.add(24);
        capacitate.add(46);
        Frigider f=new Frigider(2.3f,"Hsf sfs23","Valabil","Arctic","⭐⭐⭐⭐⭐","In perete","Amoled","A+++","Fara","Fara",functii,capacitate);
        System.out.println(f+"\n");

      Lada_Frigorifica lf = new Lada_Frigorifica();
        System.out.println(lf+"\n");

      Cafetiera_cu_filtru n=new Cafetiera_cu_filtru();
        System.out.println(n+"\n");

      Espressor es=new Espressor();
        System.out.println(es + "\n");

      Cuptoare_Electrice cup=new Cuptoare_Electrice();
        System.out.println(cup + "\n");

      Cuptoare_Microunde cupm= new Cuptoare_Microunde();
        System.out.println(cupm + "\n");

      Masina_de_Spalat_Rufe ms= new Masina_de_Spalat_Rufe();
        System.out.println(ms + "\n");

      Masina_de_Spalat_Vase msv = new Masina_de_Spalat_Vase();
        System.out.println(msv + "\n");
    }
  }