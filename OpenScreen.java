package testingcpt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpenScreen extends JPanel implements ActionListener {

    public static void main(String[] args) throws InterruptedException {

        
        OpenScreen grid2 = new OpenScreen();
        JFrame jf = new JFrame("Practice");

        jf.setSize(800, 700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JButton gMode = new JButton("G Mode");
        gMode.setText("G MODE");
        gMode.setBounds(300, 50, 200, 60);
        gMode.setVisible(true);
        jf.add(gMode);

        JButton easy = new JButton("Easy");
        easy.setText("EASY");
        easy.setBounds(300, 150, 200, 60);
        easy.setVisible(true);
        jf.add(easy);

        JButton medium = new JButton("Medium");
        medium.setText("MEDIUM");
        medium.setBounds(300, 250, 200, 60);
        medium.setVisible(true);
        jf.add(medium);

        JButton hard = new JButton("Hard");
        hard.setText("HARD");
        hard.setBounds(300, 350, 200, 60);
        hard.setVisible(true);
        jf.add(hard);

        JButton carlos = new JButton("Carlos");
        carlos.setText("CARLOS");
        carlos.setBounds(300, 450, 200, 60);
        carlos.setVisible(true);
        jf.add(carlos);
       

        jf.add(gMode);
        jf.add(easy);
        jf.add(medium);
        jf.add(hard);
        jf.add(carlos);
        jf.add(grid2);

        jf.setVisible(true);

        gMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option chosen: G Mode \n");
                gMode.setVisible(false);
                jf.remove(gMode);
                easy.setVisible(false);
                jf.remove(easy);
                medium.setVisible(false);
                jf.remove(medium);
                hard.setVisible(false);
                jf.remove(hard);
                carlos.setVisible(false);
                jf.remove(carlos);
            }
        });

        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option chosen: Easy \n");
                gMode.setVisible(false);
                jf.remove(gMode);
                easy.setVisible(false);
                jf.remove(easy);
                medium.setVisible(false);
                jf.remove(medium);
                hard.setVisible(false);
                jf.remove(hard);
                carlos.setVisible(false);
                jf.remove(carlos);
            }
        });
        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option chosen: Medium \n");
                gMode.setVisible(false);
                jf.remove(gMode);
                easy.setVisible(false);
                jf.remove(easy);
                medium.setVisible(false);
                jf.remove(medium);
                hard.setVisible(false);
                jf.remove(hard);
                carlos.setVisible(false);
                jf.remove(carlos);
            }
        });
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option chosen: Hard \n");
                gMode.setVisible(false);
                jf.remove(gMode);
                easy.setVisible(false);
                jf.remove(easy);
                medium.setVisible(false);
                jf.remove(medium);
                hard.setVisible(false);
                jf.remove(hard);
                carlos.setVisible(false);
                jf.remove(carlos);
            }
        });

        carlos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option chosen: Carlos \n");
                gMode.setVisible(false);
                jf.remove(gMode);
                easy.setVisible(false);
                jf.remove(easy);
                medium.setVisible(false);
                jf.remove(medium);
                hard.setVisible(false);
                jf.remove(hard);
                carlos.setVisible(false);
                jf.remove(carlos);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void paintComponent(Graphics g2) {
        int w = 0;
        int x = 0, y = 0;
        super.paintComponent(g2);

        Graphics g = (Graphics) g2;

        for (int i = 5; i < 25; i++, w++) {
            for (int j = 0; j < 10; j++) {
                g.setColor(new Color(192, 192, 192));
                x = j * 30 + 240;
                g.fillRect(x, y, 30, 30);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, 30, 30);

            }
            y = w * 30;

        }
    }

}
