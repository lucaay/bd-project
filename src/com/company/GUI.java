package com.company;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
//import javax.swing.border.Border;  

public class GUI extends JFrame implements ActionListener {

    JPanel panel;
    JButton fbuton;
    JButton lbuton;
    JButton cbuton;
    JButton ebuton;
    JButton msrButon;
    JButton msvButon;
    JButton meniu;

    public GUI() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        ImageIcon meniuu = new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\meniu.png");
        Image imeniu = meniuu.getImage();
        Image newmeniu = imeniu.getScaledInstance(90, 55, Image.SCALE_SMOOTH);
        meniuu = new ImageIcon(newmeniu);
        ImageIcon imgFrigider = new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\frigider.png");
        Image ifrigider = imgFrigider.getImage();
        Image newfrigider = ifrigider.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgFrigider = new ImageIcon(newfrigider);
        ImageIcon imgLadaFrigorifica = new ImageIcon(
                "proiectpoofacultate2022\\src\\com\\company\\imagini\\lada_frigorifica.png");
        Image ilada = imgLadaFrigorifica.getImage();
        Image newlada = ilada.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgLadaFrigorifica = new ImageIcon(newlada);

        // imagine cafetiera
        ImageIcon cafetiera = new ImageIcon("proiectpoofacultate2022/src/com/company/imagini/Cafetiera.png");
        Image newcaf = cafetiera.getImage();
        Image inewcaf = newcaf.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
        cafetiera = new ImageIcon(inewcaf);

        // imagine espressor
        ImageIcon espressor = new ImageIcon("proiectpoofacultate2022/src/com/company/imagini/Espressor.jpg");
        Image newesp = espressor.getImage();
        Image inewesp = newesp.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        espressor = new ImageIcon(inewesp);

        // ####################buton frigidere##################################
        fbuton = new JButton();
        fbuton.setBounds(60, 450, 120, 120);
        fbuton.setBackground(new Color(0Xcc99ff));
        fbuton.setIcon(imgFrigider);
        fbuton.addActionListener(this);
        panel.add(fbuton);
        // ####################buton lada frigorifica###########################
        lbuton = new JButton();
        lbuton.setBounds(50, 200, 120, 120);
        lbuton.setIcon(imgLadaFrigorifica);
        lbuton.setBackground(new Color(0Xcc99ff));
        lbuton.addActionListener(this);
        panel.add(lbuton);
        // ############################## meniu #################################
        meniu = new JButton();
        meniu.setIcon(meniuu);
        meniu.addActionListener(this);
        meniu.setBackground(new Color(0Xcc99ff));
        meniu.setBounds(1200, 620, 90, 90);
        panel.add(meniu);
        // ########################## Buton cafetiera ###########################
        cbuton = new JButton();
        cbuton.setBounds(300, 450, 120, 120);
        cbuton.setBackground(new Color(0Xcc99ff));
        cbuton.setIcon(cafetiera);
        cbuton.addActionListener(this);
        panel.add(cbuton);
        JLabel labcaf = new JLabel();
        labcaf.setText("Cafetiere");
        labcaf.setBounds(330, 270, 120, 120);
        panel.add(labcaf);
        // ######################## si pt espressor
        ebuton = new JButton();
        ebuton.setBounds(300, 200, 120, 120);
        ebuton.setBackground(new Color(0Xcc99ff));
        ebuton.setIcon(espressor);
        ebuton.addActionListener(this);
        panel.add(ebuton);
        JLabel labesp = new JLabel();
        labesp.setText("Espressoare");
        labesp.setBounds(320, 520, 120, 120);
        panel.add(labesp);

        // ############################ frame ###################################

        this.setTitle("Electrocasnice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1376, 768);
        this.setResizable(false);
        this.setVisible(true);
        this.add(panel);
        ImageIcon image = new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\imagini\\sergiu.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0Xcc99ff));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fbuton) {

            meniuFrigider();
        }

        if (e.getSource() == lbuton) {

            meniuLadaFrigorifica();

        }
        if (e.getSource() == meniu) {
            Meniu();
        }
    }

    public void meniuFrigider() {
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info = new Info();
        Vector<Frigider> f = new Vector<Frigider>();
        f = info.vectorFrigidere();
        // Border border= BorderFactory.createLineBorder(Color.green,3);
        int x = 5, y = 20, c = 0;
        for (int i = 0; i < f.capacity(); i++) {
            c++;
            JLabel label = new JLabel();
            label.setText("<html>  Brand: " + f.get(i).getBrand() + "<html> <br/> Model: " + f.get(i).getModel()
                    + "<html> <br/> Pret: " + f.get(i).getPret());
            // label.setBorder(border);
            ImageIcon meniuu = new ImageIcon(
                    "proiectpoofacultate2022\\src\\com\\company\\imagini\\" + f.get(i).getModel() + ".png");
            Image imeniu = meniuu.getImage();
            Image newmeniu = imeniu.getScaledInstance(200, 160, Image.SCALE_SMOOTH);
            meniuu = new ImageIcon(newmeniu);
            label.setIcon(meniuu);
            label.setFont(new Font("MV Boli", Font.PLAIN, 9));
            // label.setBackground(Color.black);
            // label.setOpaque(true);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setBounds(x, y, 150, 300);
            if (x < 1276 && c < 6)
                x += 235;
            else {
                y += 310;
                c = 0;
                x = 5;
            }
            panel.add(label);
        }

    }

    public void meniuLadaFrigorifica() {
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info = new Info();
        Vector<LadaFrigorifica> lf = new Vector<LadaFrigorifica>();
        lf = info.vectorLF();

        // Border border= BorderFactory.createLineBorder(Color.green,3);
        int x = 5, y = 20, c = 0;
        for (int i = 0; i < lf.capacity(); i++) {
            c++;
            JLabel label = new JLabel();
            label.setText("<html>  Brand: " + lf.get(i).getBrand() + "<html> <br/> Model: " + lf.get(i).getModel()
                    + "<html> <br/> Pret: " + lf.get(i).getPret());
            // label.setBorder(border);
            ImageIcon meniuu = new ImageIcon(
                    "proiectpoofacultate2022\\src\\com\\company\\imagini\\" + lf.get(i).getModel() + ".png");
            Image imeniu = meniuu.getImage();
            Image newmeniu = imeniu.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            meniuu = new ImageIcon(newmeniu);
            label.setIcon(meniuu);
            label.setFont(new Font("MV Boli", Font.PLAIN, 9));
            // label.setBackground(Color.black);
            // label.setOpaque(true);
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setBounds(x, y, 150, 300);
            if (x < 1276 && c < 6)
                x += 235;
            else {
                y += 310;
                c = 0;
                x = 5;
            }
            panel.add(label);
        }

    }

    public void Meniu() {
        panel.removeAll();
        panel.repaint();
        panel.add(lbuton);
        panel.add(fbuton);
        panel.add(cbuton);
        panel.add(ebuton);

    }
}
