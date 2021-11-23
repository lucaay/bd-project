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
    JButton mrButton;
    JButton mvButton;
    JButton meniu;
    JLabel labcaf;
    JLabel labesp;
    JLabel labmr;
    JLabel labmv;
    JLabel labFrigider;
    JLabel labLadaFrigorifica;

    public GUI() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);

        // imagine meniu
        ImageIcon meniuu = new ImageIcon("./src/com/company/imagini/meniu.png");
        Image imeniu = meniuu.getImage();
        Image newmeniu = imeniu.getScaledInstance(90, 55, Image.SCALE_SMOOTH);
        meniuu = new ImageIcon(newmeniu);

        // imagine frigider
        ImageIcon imgFrigider = new ImageIcon("./src/com/company/imagini/frigider.png");
        Image ifrigider = imgFrigider.getImage();
        Image newfrigider = ifrigider.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgFrigider = new ImageIcon(newfrigider);

        // imagine lada frigorifica
        ImageIcon imgLadaFrigorifica = new ImageIcon("./src/com/company/imagini/lada_frigorifica.png");
        Image ilada = imgLadaFrigorifica.getImage();
        Image newlada = ilada.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgLadaFrigorifica = new ImageIcon(newlada);

        // imagine cafetiera
        ImageIcon cafetiera = new ImageIcon("./src/com/company/imagini/Cafetiera.png");
        Image newcaf = cafetiera.getImage();
        Image inewcaf = newcaf.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
        cafetiera = new ImageIcon(inewcaf);

        // imagine espressor
        ImageIcon espressor = new ImageIcon("./src/com/company/imagini/Espressor.jpg");
        Image newesp = espressor.getImage();
        Image inewesp = newesp.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        espressor = new ImageIcon(inewesp);

        // imagine masina de spalat vase
        ImageIcon masina_vase = new ImageIcon("./src/com/company/imagini/masini_de_spalat_vase/masina_spalat_vase.png");
        Image newvase = masina_vase.getImage();
        Image inevase = newvase.getScaledInstance(90, 150, Image.SCALE_SMOOTH);
        masina_vase = new ImageIcon(inevase);

        // imagine masina de spalat rufe
        ImageIcon masina_rufe = new ImageIcon("./src/com/company/imagini/masini_de_spalat_rufe/masina_spalat_rufe.png");
        Image newruse = masina_rufe.getImage();
        Image inewrufe = newruse.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        masina_rufe = new ImageIcon(inewrufe);

        // ####################buton frigidere##################################
        fbuton = new JButton();
        fbuton.setBounds(60, 450, 120, 120);
        fbuton.setBackground(new Color(0Xcc99ff));
        fbuton.setIcon(imgFrigider);
        fbuton.setOpaque(false);
        fbuton.addActionListener(this);
        panel.add(fbuton);
        labFrigider = new JLabel();
        labFrigider.setText("Frigidere");
        labFrigider.setBounds(100, 520, 120, 120);
        panel.add(labFrigider);
        // ####################buton lada frigorifica###########################
        lbuton = new JButton();
        lbuton.setOpaque(false);
        lbuton.setBounds(50, 200, 120, 120);
        lbuton.setIcon(imgLadaFrigorifica);
        lbuton.setBackground(new Color(0Xcc99ff));
        lbuton.addActionListener(this);
        panel.add(lbuton);
        labLadaFrigorifica = new JLabel();
        labLadaFrigorifica.setText("Lada Frigorifica");
        labLadaFrigorifica.setBounds(70, 270, 120, 120);
        panel.add(labLadaFrigorifica);
        // ############################## meniu #################################
        meniu = new JButton();
        meniu.setIcon(meniuu);
        meniu.setOpaque(false);
        meniu.addActionListener(this);
        meniu.setBackground(new Color(0Xcc99ff));
        meniu.setBounds(1200, 620, 90, 90);
        panel.add(meniu);
        // ########################## Buton cafetiera ###########################
        cbuton = new JButton();
        cbuton.setOpaque(false);
        cbuton.setBounds(300, 450, 120, 120);
        cbuton.setBackground(new Color(0Xcc99ff));
        cbuton.setIcon(cafetiera);
        cbuton.addActionListener(this);
        panel.add(cbuton);
        labesp = new JLabel();
        labesp.setText("Cafetiere");
        labesp.setBounds(330, 520, 120, 120);
        panel.add(labesp);
        // ######################## si pt espressoare
        ebuton = new JButton();
        ebuton.setOpaque(false);
        ebuton.setBounds(300, 200, 120, 120);
        ebuton.setBackground(new Color(0Xcc99ff));
        ebuton.setIcon(espressor);
        ebuton.addActionListener(this);
        panel.add(ebuton);
        labcaf = new JLabel();
        labcaf.setText("Espressoare");
        labcaf.setBounds(325, 270, 120, 120);
        panel.add(labcaf);

        // ########################## Buton masina spalat rufe
        // ###########################
        mrButton = new JButton();
        mrButton.setBounds(550, 450, 120, 120);
        mrButton.setBackground(new Color(0Xcc99ff));
        mrButton.setIcon(masina_rufe);
        mrButton.setOpaque(false);
        mrButton.addActionListener(this);
        panel.add(mrButton);
        labmr = new JLabel();
        labmr.setText("Masini de spalat rufe");
        labmr.setBounds(550, 520, 130, 120);
        panel.add(labmr);
        // ######################## buton masina spalat vase
        // ##################################
        mvButton = new JButton();
        mvButton.setOpaque(false);
        mvButton.setBounds(550, 200, 120, 120);
        mvButton.setBackground(new Color(0Xcc99ff));
        mvButton.setIcon(masina_vase);
        mvButton.addActionListener(this);
        panel.add(mvButton);
        labmv = new JLabel();
        labmv.setText("Masini de spalat vase");
        labmv.setBounds(550, 270, 130, 120);
        panel.add(labmv);

        // ############################ frame ###################################

        this.setTitle("Electrocasnice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1376, 768);
        this.setResizable(false);
        this.setVisible(true);
        this.add(panel);
        ImageIcon image = new ImageIcon("./src/com/company/imagini/sergiu.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(223, 230, 233));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == fbuton) {

            meniuFrigider();
        }

        if (e.getSource() == lbuton) {

            meniuLadaFrigorifica();

        }
        if (e.getSource() == cbuton) {
            MeniuCafetiera();
        }

        if (e.getSource() == mrButton) {
            meniuMasinaSpalatRufe();

        }

        if (e.getSource() == mvButton) {
            meniuMasinaSpalatVase();
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

    public void MeniuCafetiera() {
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info = new Info();
        Vector<CafetieraFiltru> cf = new Vector<CafetieraFiltru>();
        cf = info.vectorCafetiere();

        // Border border= BorderFactory.createLineBorder(Color.green,3);
        int x = 5, y = 20, c = 0;
        for (int i = 0; i < cf.capacity(); i++) {
            c++;
            JLabel label = new JLabel();
            label.setText("<html>  Brand: " + cf.get(i).getBrand() + "<html> <br/> Model: " + cf.get(i).getModel()
                    + "<html> <br/> Pret: " + cf.get(i).getPret());
            // label.setBorder(border);
            ImageIcon meniuu = new ImageIcon(
                    "proiectpoofacultate2022\\src\\com\\company\\imagini\\" + cf.get(i).getModel() + ".png");
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

    public void meniuMasinaSpalatRufe() {
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info = new Info();
        Vector<MasinaSpalatRufe> mr = new Vector<MasinaSpalatRufe>();
        mr = info.vectorMasinaSpalatRufe();
        // Border border= BorderFactory.createLineBorder(Color.green,3);
        int x = 5, y = 20, c = 0;
        for (int i = 0; i < mr.capacity(); i++) {
            c++;
            JLabel label = new JLabel();
            label.setText("<html>  Brand: " + mr.get(i).getBrand() + "<html> <br/> Model: " + mr.get(i).getModel()
                    + "<html> <br/> Pret: " + mr.get(i).getPret());
            // label.setBorder(border);
            ImageIcon meniuu = new ImageIcon(
                    "./src/com/company/imagini/masini_de_spalat_rufe/" + mr.get(i).getModel() + ".png");
            Image imeniu = meniuu.getImage();
            Image newmeniu = imeniu.getScaledInstance(150, 160, Image.SCALE_SMOOTH);
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

    public void meniuMasinaSpalatVase() {
        panel.removeAll();
        panel.add(meniu);
        panel.repaint();
        Info info = new Info();
        Vector<MasinaSpalatVase> mv = new Vector<MasinaSpalatVase>();
        mv = info.vectorMasinaSpalatVase();
        // Border border= BorderFactory.createLineBorder(Color.green,3);
        int x = 5, y = 20, c = 0;
        for (int i = 0; i < mv.capacity(); i++) {
            c++;
            JLabel label = new JLabel();
            label.setText("<html>  Brand: " + mv.get(i).getBrand() + "<html> <br/> Model: " + mv.get(i).getModel()
                    + "<html> <br/> Pret: " + mv.get(i).getPret());
            // label.setBorder(border);
            ImageIcon meniuu = new ImageIcon(
                    "./src/com/company/imagini/masini_de_spalat_vase/" + mv.get(i).getModel() + ".png");
            Image imeniu = meniuu.getImage();
            Image newmeniu = imeniu.getScaledInstance(150, 160, Image.SCALE_SMOOTH);
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
        panel.add(mrButton);
        panel.add(mvButton);
        panel.add(labcaf);
        panel.add(labesp);
        panel.add(labmr);
        panel.add(labmv);
        panel.add(meniu);

    }
}
