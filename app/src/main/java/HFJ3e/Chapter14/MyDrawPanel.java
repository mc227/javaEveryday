package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//
//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//        int blue = random.nextInt(256);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);
//        Image image = new ImageIcon("C:\\Users\\Mark Costales\\Pictures\\Saved Pictures\\images.png").getImage();
//        g.drawImage(image, 3, 4, this);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70,70, Color.blue,150,150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyDrawPanel());
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}