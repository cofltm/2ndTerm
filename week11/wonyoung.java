package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class wonyoung {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("ive-jang-wonyoung-vogue.jpg");
    JButton btn = new JButton("Login");
    
    public wonyoung(){
        Image img = bg.getImage();
        bg = new ImageIcon(img.getScaledInstance(1600, 767, Image.SCALE_SMOOTH)); 
        frame.setSize(1600, 767);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JLabel lblBack = new JLabel(bg);
        lblBack.setLayout(new FlowLayout());
        lblBack.setBounds(0, 0, 1600, 767);
        
        btn.setBounds(100, 100, 100, 100);
        lblBack.add(btn);
        
        frame.add(lblBack); 
                
        frame.setVisible(true);
        
    }
    public static void main(String [] args){
        new wonyoung();
        
    }
}

