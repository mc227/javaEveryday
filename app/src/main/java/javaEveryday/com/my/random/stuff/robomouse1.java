package javaEveryday.com.my.random.stuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class robomouse1 extends Frame implements ActionListener {
    // Frame
    static JFrame f;

    // textField
    static TextField x, y, x1, y1;

    // default constructor
    robomouse1()
    {
    }

    // main function
    public static void main(String args[])
    {
        // object of class
        robomouse1 rm = new robomouse1();

        // create a frame
        f = new JFrame("robomouse");

        // set the frame to close on exit
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create textfield
        x = new TextField(7);
        y = new TextField(7);

        x1 = new TextField(7);
        y1 = new TextField(7);

        // create a button
        Button b = new Button("OK");

        // add actionListener
        b.addActionListener(rm);

        // create a panel
        Panel p = new Panel();

        // create labels
        Label l, l1;

        l = new Label("from");
        l1 = new Label("to");

        // add items to panel
        p.add(l);
        p.add(x);
        p.add(y);
        p.add(l1);
        p.add(x1);
        p.add(y1);
        p.add(b);

        f.add(p);

        // setsize of frame
        f.setSize(600, 300);

        f.show();
    }

    // if button is pressed
    public void actionPerformed(ActionEvent e)
    {
        try {
            Robot r = new Robot();
            int xi, yi, xi1, yi1;

            // get x and y points
            xi = Integer.parseInt(x.getText());
            yi = Integer.parseInt(y.getText());
            xi1 = Integer.parseInt(x1.getText());
            yi1 = Integer.parseInt(y1.getText());

            // move the mouse to that point
            r.mouseMove(xi, yi);

            // press the mouse
            r.mousePress(InputEvent.BUTTON1_MASK);

            int i = xi, j = yi;

            // slowly drag the mouse to defined location
            while (i < xi1 || j < yi1) {
                // move the mouse to the other point
                r.mouseMove(i, j);

                if (i < xi1)
                    i++;
                if (j < yi1)
                    j++;

                // wait
                Thread.sleep(30);
            }

            // wait
            Thread.sleep(4000);

            // press the mouse
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        }
        catch (Exception evt) {
            System.err.println(evt.getMessage());
        }
    }
}
