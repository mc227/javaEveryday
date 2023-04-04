package HFJ3e.Chapter14;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click me");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);
        jFrame.setSize(300,300);
    }
}
