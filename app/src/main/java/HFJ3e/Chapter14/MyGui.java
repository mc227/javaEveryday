package HFJ3e.Chapter14;

import javax.swing.*;
import java.awt.event.*;

class MyGui implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JButton colorButton;
    private JButton labelButton;

    void gui() {
        // code to instantiate the two listeners and register one
        // with the color button and the other with the label button
    }

    public void go() {
        colorButton = new JButton();
        labelButton = new JButton();
        colorButton.addActionListener(this);
        labelButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() ==  colorButton) {
            frame.repaint();
        } else {
            label.setText("That hurt!");
        }
    }
}

class ColorButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
//    frame.repaint();
    }
}


class LabelButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
//    label.setText("That hurt!");
    }
}

