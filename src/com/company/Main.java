package com.company;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<String>functii=new ArrayList<>();
        functii.add("f1");
        functii.add("f2");
        functii.add("f3");
        Vector<Integer>capacitate=new Vector<>(3);
        capacitate.add(10);
        capacitate.add(24);
        capacitate.add(46);
        Frigider f=new Frigider(null, 20034f,null, "da","nu","poate",capacitate, "ce","wow",null, null, null, functii);
        System.out.println(f+"\n");
      
    }
  }