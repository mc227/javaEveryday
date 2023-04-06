package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {
    private JButton button;
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (button.getText().equals("Click me")) {
            button.setText("Clicked");
        } else {
            button.setText("Click me");
        }
    }

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }
}
