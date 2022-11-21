package javaEveryday.com.DW.week5.discussion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/* PasswordDemonstration.java requires MyGui.java . */

public class PasswordDemonstration extends JPanel implements ActionListener {

    private JFrame controllingFixture; //needed for dialogs
    private JPasswordField passwordDomain;

    public PasswordDemonstration(JFrame f) {// constructor's parameter is a JFrame
        //Use the default FlowLayout.
        controllingFixture = f;

        //Create everything.
        passwordDomain = new JPasswordField(12);
        passwordDomain.setActionCommand("ok");
        passwordDomain.addActionListener(this);

        JLabel label = new JLabel("What is the password? ");
        label.setLabelFor(passwordDomain);

        JComponent jcomponent = createButtonGroup();

        //Lay out everything.
        JPanel jpanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        jpanel.add(label);
        jpanel.add(passwordDomain);

        add(jpanel);
        add(jcomponent);
    }

    protected JComponent createButtonGroup() {
        JPanel p = new JPanel(new GridLayout(0,1));
        JButton okButton = new JButton("OK");
        JButton helpButton = new JButton("Help");

        okButton.setActionCommand("ok");
        helpButton.setActionCommand("help");
        okButton.addActionListener(this);
        helpButton.addActionListener(this);

        p.add(okButton);
        p.add(helpButton);

        return p;
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("ok".equals(cmd)) { //Process the password.
            char[] input = passwordDomain.getPassword();
            if (passwordMatches(input)) {
                MyGui myGui = new MyGui();
                myGui.main(null);

            } else {
                JOptionPane.showMessageDialog(controllingFixture,
                        "Invalid password. Try again.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }

            //Zero out the possible password, for security.
            Arrays.fill(input, '0');

            passwordDomain.selectAll();
            resetFocus();
        } else { //The user has asked for help.
            JOptionPane.showMessageDialog(controllingFixture,
                    "The password is \"password\"");
        }
    }

    /**
     * Checks the passed-in array against the correct password.
     * After this method returns, you should invoke eraseArray
     * on the passed-in array.
     */
    private static boolean passwordMatches(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { 'p', 'a', 's', 's', 'w', 'o', 'r', 'd' };

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }

        //Zero out the password.
        Arrays.fill(correctPassword,'0');

        return isCorrect;
    }

    //Must be called from the event dispatch thread.
    protected void resetFocus() {
        passwordDomain.requestFocusInWindow();
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void instantiateAndDisplayGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("PasswordDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        final PasswordDemonstration newContentPane = new PasswordDemonstration(frame);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Make sure the focus goes to the right component
        //whenever the frame is initially given the focus.
        frame.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e) {
                newContentPane.resetFocus();
            }
        });

        //Display the window.
        frame.pack();
        frame.setSize(400,180);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn on metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.TRUE);
                instantiateAndDisplayGUI();
            }
        });
    }
}
