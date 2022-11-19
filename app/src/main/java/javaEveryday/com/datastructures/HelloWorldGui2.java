package javaEveryday.com.datastructures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldGui2 {
    private static class HelloWorldDisplay extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawString("Hello World", 20, 25);
            g.setColor(Color.PINK);
            g.drawString("Oh Hi Mark", 39, 39);
        }
    }

    private static class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        HelloWorldDisplay displayPanel = new HelloWorldDisplay();
        JButton okButton =  new JButton("OK");
        ButtonHandler listener = new ButtonHandler();
        okButton.addActionListener(listener);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(displayPanel,BorderLayout.CENTER);
        content.add(okButton,BorderLayout.SOUTH);

        JFrame window = new JFrame("Mark Costales Brand"); //good
        window.setContentPane(content);
        window.setSize(450,450); //good
        window.setLocation(100,100); // good
        window.setVisible(true); //good
    }
}

