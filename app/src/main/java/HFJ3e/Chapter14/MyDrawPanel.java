package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        g.setColor(Color.orange);
//        g.fillRect(20,50,100,100);
//        Image image = new ImageIcon("images.png").getImage();
//        g.drawImage(image,3,4,this);
//        g.fillRect(0,0,this.getWidth(),this.getHeight());
//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//        int blue = random.nextInt(256);
//
//        Color color = new Color(red,green,blue);
//        g.setColor(color);
//        g.fillOval(70,70,100,100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyDrawPanel());
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
