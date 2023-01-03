package javaEveryday.com.DW.Assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui {
    /**
     * Action Listener for Distance Converter
     */
    public static class distanceButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame f = new JFrame();
            String miles = JOptionPane.showInputDialog(null,"Input miles distance to convert");
            DistanceConverter distanceConverter = new DistanceConverter(Double.parseDouble(miles));
            JOptionPane.showMessageDialog(f, distanceConverter.toString());
        }
    }

    /**
     * Action Listener for Exit button
     */
    private static class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    /**
     * Action Listener for Temperature Coverter
     */
    private static class tempButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JFrame f = new JFrame();
            String fahr = JOptionPane.showInputDialog(null,"Input fahrenheit temperature to convert");
            TemperatureConverter temperatureConverter = new TemperatureConverter(Double.parseDouble(fahr));
            JOptionPane.showMessageDialog(f, temperatureConverter.toString());
        }
    }

    public static void main(String[] args) {
        /**
         * Distance Converter button initialization
         */
        JButton distanceButton =  new JButton("Distance Coverter");
        distanceButtonHandler distanceListener = new distanceButtonHandler();
        distanceButton.addActionListener(distanceListener);

        /**
         * Exit button initialization
         */
        JButton exitButton = new JButton("EXIT");
        ExitButtonHandler exitListener = new ExitButtonHandler();
        exitButton.addActionListener(exitListener);

        /**
         * Temperature Converter button initialization
         */
        JButton tempButton = new JButton("Temperature Converter");
        tempButtonHandler tempListener = new tempButtonHandler();
        tempButton.addActionListener(tempListener);

        /**
         * Layout of buttons
         */
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(distanceButton,BorderLayout.CENTER);
        content.add(exitButton,BorderLayout.SOUTH);
        content.add(tempButton,BorderLayout.EAST);


        JFrame window = new JFrame("Welcome to Converter");
        window.setContentPane(content);
        window.setSize(400,180);
        window.setLocation(550,350);
        window.setVisible(true);
    }
}