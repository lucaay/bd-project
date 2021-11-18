package com.company;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
    
   
    public GUI(){
        JLabel frigider = new JLabel();
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        JLabel ladaFrigorifica = new JLabel();
        ImageIcon imgFrigider=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\frigider.png");
        Image ifrigider=imgFrigider.getImage();
        Image newfrigider=ifrigider.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgFrigider= new ImageIcon(newfrigider);
        ImageIcon imgLadaFrigorifica=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\lada_frigorifica.png");
        Image ilada=imgLadaFrigorifica.getImage();
        Image newlada=ilada.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imgLadaFrigorifica= new ImageIcon(newlada);

        if(true){frigider.setText("Frigider");
        frigider.setIcon(imgFrigider);
        frigider.setHorizontalTextPosition(JLabel.CENTER);
        frigider.setVerticalTextPosition(JLabel.TOP);
        frigider.setForeground(new Color(0xffffff));
        frigider.setFont(new Font("MV Boli",Font.PLAIN,20));
        frigider.setBounds(60,200,500,500);
        JButton fbuton=new JButton();
        fbuton.setBounds(50,540,140,20);
        fbuton.setText("frigidere");
        panel.add(frigider);
        panel.add(fbuton);
        
    }

        if(true){ladaFrigorifica.setText("Lada Frigorifica");
            ladaFrigorifica.setIcon(imgLadaFrigorifica);
            ladaFrigorifica.setHorizontalTextPosition(JLabel.CENTER);
            ladaFrigorifica.setVerticalTextPosition(JLabel.TOP);
            ladaFrigorifica.setForeground(new Color(0xffffff));
            ladaFrigorifica.setFont(new Font("MV Boli",Font.PLAIN,20));
            ladaFrigorifica.setBounds(50,-200,500,800);
            JButton lbuton=new JButton();
            lbuton.setBounds(36,280,160,20);
            lbuton.setText("lazi frigorifice");
            panel.add(ladaFrigorifica);
            panel.add(lbuton);
            }
       






        this.setTitle("Electrocasnice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1376,768);
        this.setResizable(false);
        this.setVisible(true);
        this.add(panel);
        ImageIcon image=new ImageIcon("proiectpoofacultate2022\\src\\com\\company\\sergiu.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0Xcc99ff));
       
    }
    
   
    
}
