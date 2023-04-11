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
//        Color color = new Color(red,green,blue);
//        g.setColor(color);
//        g.fillOval(70,70,100,100);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        Graphics2D g2d = (Graphics2D) g;
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color first = new Color(red,green,blue);
        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color second = new Color(red,green,blue);
        GradientPaint gradient = new GradientPaint(70,70,first, 150,150,second);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Change Color");
        frame.getContentPane().add(new MyDrawPanel());
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
    }
}
