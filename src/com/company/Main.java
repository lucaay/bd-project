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
        System.out.println(f);
        //testare vcs nicu

    }
  }