package HFJ3e.Chapter14;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("OK");
        frame.getContentPane().add(button);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
