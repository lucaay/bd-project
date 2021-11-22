package com.company;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.*;  


public class GUI extends JFrame implements ActionListener {

    JPanel panel;
    JButton fbuton;
    JButton lbuton;
    JButton meniu;
   
    public GUI(){
    
        panel=new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        ImageIcon meniuu=new  ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\meniu.png");
        Image imeniu=meniuu.getImage();
        Image newmeniu=imeniu.getScaledInstance(90, 55, Image.SCALE_SMOOTH);
        meniuu=new ImageIcon(newmeniu);
        ImageIcon imgFrigider=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\frigider.png");
        Image ifrigider=imgFrigider.getImage();
        Image newfrigider=ifrigider.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgFrigider= new ImageIcon(newfrigider);
        ImageIcon imgLadaFrigorifica=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\lada_frigorifica.png");
        Image ilada=imgLadaFrigorifica.getImage();
        Image newlada=ilada.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgLadaFrigorifica= new ImageIcon(newlada);
//####################buton frigidere##################################
        fbuton=new JButton();
        fbuton.setBounds(60,450,120,120);
        fbuton.setBackground(new Color(0Xcc99ff));
        fbuton.setIcon(imgFrigider);
        fbuton.addActionListener(this);
        panel.add(fbuton);
//####################buton lada frigorifica###########################  
        lbuton=new JButton();
        lbuton.setBounds(50,200,120,120);
        lbuton.setIcon(imgLadaFrigorifica);
        lbuton.setBackground(new Color(0Xcc99ff));
        lbuton.addActionListener(this);
        panel.add(lbuton);
//############################## meniu #################################     
        meniu=new JButton();
        meniu.setIcon(meniuu);
        meniu.addActionListener(this);
        meniu.setBackground(new Color(0Xcc99ff));
        meniu.setBounds(1200,620,90,90);
        panel.add(meniu);
//############################ frame ###################################

        this.setTitle("Electrocasnice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1376,768);
        this.setResizable(false);
        this.setVisible(true);
        this.add(panel);
        ImageIcon image=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\sergiu.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0Xcc99ff));
       
    }
   
  @Override
    public void actionPerformed(ActionEvent e)
    { 
        
        if(e.getSource()==fbuton)
            {
               
               meniuFrigider();
            }
            
        if(e.getSource()==lbuton)
            {
                
                meniuLadaFrigorifica();
                
            }
        if(e.getSource()==meniu)
        {
            Meniu();
        }
    }  
   
    public void meniuFrigider(){
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info=new Info();
        Vector <Frigider> frigidere= new Vector<Frigider>();
        frigidere=info.vectorFrigidere();  
        for(int i=0;i<frigidere.capacity();i++)
            System.out.println(frigidere.get(i)+"\n"+"\n"+"\n" );

           
          
            
    
        
        
    }
    public void meniuLadaFrigorifica(){
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info=new Info();
        Vector <LadaFrigorifica> lf= new Vector<LadaFrigorifica>();
        lf=info.vectorLF();  
        for(int i=0;i<lf.capacity();i++)
            System.out.println(lf.get(i)+"\n"+"\n"+"\n" );
        
        
        
    }
    public void Meniu(){
        panel.repaint();
        panel.add(lbuton);
        panel.add(fbuton);
    }
}
