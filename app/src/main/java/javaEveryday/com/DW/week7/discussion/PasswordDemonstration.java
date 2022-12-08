package javaEveryday.com.DW.week7.discussion;

import javaEveryday.com.DW.week5.discussion.MyGui;

import javax.swing.*;
//import javax.swing.JPasswordField;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

/* PasswordDemonstration.java requires MyGui.java . */

/**
 * This class was adapted from Oracle's PasswordDemo.java
 * [ https://docs.oracle.com/javase/tutorial/uiswing/examples/components/PasswordDemoProject/src/components
 * /PasswordDemo.java ] for educational purposes only.
 */
public class PasswordDemonstration extends JPanel implements ActionListener
{
    private JFrame controllingFixture; //needed for dialogs
    private JPasswordField passwordDomain;

    /**
     * constructor's only parameter is a JFrame
     * @param f
     */
    public PasswordDemonstration(JFrame f) {
        //Use the default FlowLayout.
        controllingFixture = f;

        //Create everything.
        passwordDomain = new JPasswordField(12);
        passwordDomain.setActionCommand("ok");
        passwordDomain.addActionListener(this);

        // text in the GUI asking the user a question
        JLabel label = new JLabel("What is the password? ");
        label.setLabelFor(passwordDomain);

        // instantiate buttons with this method
        JComponent jcomponent = createButtonGroup();

        //Lay out everything.
        JPanel jpanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        jpanel.add(label);
        jpanel.add(passwordDomain);

        add(jpanel);
        add(jcomponent);
    }

    /**
     * This component creates the button section of the gui
     * @return JPanel p
     */
    protected JComponent createButtonGroup() {
        JPanel p = new JPanel(new GridLayout(0,1));
        JButton okButton = new JButton("OK"); // these are the texts you see in the gui buttons
        JButton helpButton = new JButton("Help");

        okButton.setActionCommand("ok"); // "ok" action will trigger when OK button is clicked
        helpButton.setActionCommand("help");
        okButton.addActionListener(this);
        helpButton.addActionListener(this);

        p.add(okButton);
        p.add(helpButton);

        return p;
    }

    /**
     * This is where the logic of the OK button happens.
     * If the password is correct we are taken to MyGui.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if ("ok".equals(cmd)) { //Process the password.
            char[] input = passwordDomain.getPassword();

            if (passwordMatches(input)) {
                MyGui myGui = new MyGui();
                myGui.main(null);

            } else {
                /**
                 * here we wrapped the if else statement in a try catch block.
                 * We are accounting for the case where the user submits a blank password.
                 */
                try{
                    if(Arrays.equals(input,new char[0])){
                        Exception e1 = new IllegalPasswordArgumentException(null);
                        JOptionPane.showMessageDialog(controllingFixture,
                                e1.toString(),
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(controllingFixture,
                                "Wrong password!!!\nPlease Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IllegalPasswordArgumentException exception) {
                    exception.printStackTrace();
                }
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

        //Zero out the correct password.
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
