package gui;

import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FallingWords extends JFrame implements Runnable, KeyListener{
    
    //create an initial list of words
    ArrayList<String> words = new ArrayList<>();
    String[] list = {"Subunit", "Cherish", "Rush", "Swamp"};
    Thread runner;
    
    int score = 0;
    
    JPanel panel = new JPanel();
    JTextField tfWord = new JTextField(20);
    JLabel lblScore = new JLabel("Score: "+score);
    
    
    int[] xVal = {80, 200, 140, 300};
    //int[] yVal = {30, 10, 20, 50};
    int y = 30;
    
    
    public FallingWords(){
        this.setSize(800, 600);
        this.setLayout(null);
        this.setTitle("Type the falling words");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tfWord.setFocusable(true);
        tfWord.addKeyListener(this);
        
        panel.add(tfWord);
        panel.add(lblScore);
        panel.setBounds(420, 500, 200, 100);
        add(panel);
        
        words.addAll(Arrays.asList(list));
        runner = new Thread(this);
        runner.start();
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        for (int i=0; i < words.size(); i++){
            g.drawString(words.get(i), xVal[i], y);
        }
    }
    
    public static void main(String[] args) {
        new FallingWords();
    }
    //create a Jframe then set its size, layout, closeOperation
    //create an instance of the Thread class
    //override paint() method
    //implement main method
    // add textfield and listeners
    // add score
    
    @Override
    public void run(){
        while(true){
            if(words.size() == 0){
                JOptionPane.showMessageDialog(null, "Game Over");
                break;
            }
            if(y > 750){
                y = 30;
            }
            if(y != 750){
                y += 10;
                }
            try{
                runner.sleep(500);
            } 
            catch (InterruptedException ex) {
                ex.getMessage();
            }
            repaint ();
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        boolean correct = false;
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            for (int i = 0; i < words.size(); i++){
                if(tfWord.getText().equalsIgnoreCase(words.get(i))){
                    correct = true;
                    words.remove(i);
                    break;
                }
            }
            if(correct){
                lblScore.setText("Score: "+ ++score);
                tfWord.setText("");
            }
            else{
                lblScore.setText("Score: "+ --score);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
