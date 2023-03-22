package HFJ3e.Chapter15;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

    JButton east = new JButton("East");
    JButton west = new JButton("West");
    JButton north = new JButton("North");
    JButton south = new JButton("South");
    JButton center = new JButton("Center");

    frame.getContentPane().add(BorderLayout.EAST, east);
    frame.getContentPane().add(BorderLayout.WEST, west);
    frame.getContentPane().add(BorderLayout.NORTH, north);
    frame.getContentPane().add(BorderLayout.SOUTH, south);
    frame.getContentPane().add(BorderLayout.CENTER, center);

//        JButton button = new JButton("click like you mean it");
//        JButton button = new JButton("There is no spoon...");
//        JButton button = new JButton("Click This!");
//        Font bigFont = new Font("serif",Font.BOLD, 28);
//        button.setFont(bigFont);
//        frame.getContentPane().add(BorderLayout.NORTH,button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
