package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
//        g.fillRect(70,70,100,100);
        g.fillOval(70,70,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyDrawPanel());
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
