package javaEveryday.com.DW.week5.discussion;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui {
    public static int COUNTER = 0;

    private static class MessageButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Hello World!!!");
        }
    }
    private static class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private static class CounterButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,"Counter clicked = "+ (++COUNTER));
        }
    }

    public static void main(String[] args) {

        JButton messageButton =  new JButton("MESSAGE");
        MessageButtonHandler messageListener = new MessageButtonHandler();
        messageButton.addActionListener(messageListener);

        JButton exitButton = new JButton("EXIT");
        ExitButtonHandler exitListener = new ExitButtonHandler();
        exitButton.addActionListener(exitListener);

        JButton counterButton = new JButton("COUNTER");
        CounterButtonHandler counterListener = new CounterButtonHandler();
        counterButton.addActionListener(counterListener);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(messageButton,BorderLayout.WEST);
        content.add(exitButton,BorderLayout.CENTER);
        content.add(counterButton,BorderLayout.EAST);

        JFrame window = new JFrame("Welcome");
        window.setContentPane(content);
        window.setSize(400,180); //good
        window.setLocation(100,100); // good
        window.setVisible(true); //good
    }
}
