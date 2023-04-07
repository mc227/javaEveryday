package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {
    private JButton button;
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Oh Hi Mark");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(button.getText().equals("Oh Hi Mark")) {
            button.setText("Oh Hi Danny");
        } else {
            button.setText("Oh Hi Mark");
        }
    }

    public static void main(String[] args) {
        new SimpleGui2().go();
    }
}
