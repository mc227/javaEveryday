package javaEveryday.com.DW.week8.project.media.rental.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

/**
 * Menu driven user interface
 * This program lets user
 */
public class MediaRentalSystem extends JFrame {


    /**
     * The main program just opens a window belonging to this MediaRentalSystem class.
     * Then the window takes care of itself until the program is ended with the
     * Quit command or when the user closes the window.
     */
    public static void main(String[] args) {
        JFrame window = new MediaRentalSystem();
        window.setVisible(true);
    }


    private JTextArea text;   // Holds the text that is displayed in the window.

    private JFileChooser fileDialog;  // File dialog for use in doOpen() an doSave().

    private File editFile;  // The file, if any that is currently being edited.


    /**
     * Create a TrivialEdit window, with a JTextArea where the user can
     * edit some text and with a menu bar.
     */
    public MediaRentalSystem() {
        super("Welcome to Media Rental System");  // Specifies title of the window.
        setJMenuBar( makeMenus() );
        text = new JTextArea(25,50);
        text.setMargin( new Insets(3,5,0,0) ); // Some space around the text.
        JScrollPane scroller = new JScrollPane(text);
        setContentPane(scroller);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocation(50,50);
    }


    /**
     * Create and return a menu bar containing a single menu, the
     * File menu.  This menu contains four commands, New, Open, Save,
     * and Quit.
     */
    private JMenuBar makeMenus() {

        ActionListener listener = new ActionListener() {
            // An object that will serve as listener for menu items.
            public void actionPerformed(ActionEvent evt) {
                // This will be called when the user makes a selection
                // from the File menu.  This routine just checks
                // which command was selected and calls another
                // routine to carry out the command.
                String cmd = evt.getActionCommand();
                if (cmd.equals("New"))
                    doNew();
                else if (cmd.equals("Open..."))
                    doOpen();
                else if (cmd.equals("Save..."))
                    doSave();
                else if (cmd.equals("Quit"))
                    doQuit();
                else if (cmd.equals("Load Media objects..."))
                    doLoad();
            }
        };

        JMenu fileMenu = new JMenu("File");

        JMenuItem newCmd = new JMenuItem("New");
        newCmd.addActionListener(listener);
        fileMenu.add(newCmd);

        JMenuItem openCmd = new JMenuItem("Open...");
        openCmd.addActionListener(listener);
        fileMenu.add(openCmd);

        JMenuItem saveCmd = new JMenuItem("Save...");
        saveCmd.addActionListener(listener);
        fileMenu.add(saveCmd);

        JMenuItem loadCmd = new JMenuItem("Load Media objects...");
        loadCmd.addActionListener(listener);
        fileMenu.add(loadCmd);

        fileMenu.addSeparator();

        JMenuItem quitCmd = new JMenuItem("Quit");
        quitCmd.addActionListener(listener);
        fileMenu.add(quitCmd);

        JMenuBar bar = new JMenuBar();
        bar.add(fileMenu);
        return bar;

    } // end makeMenus()

    private void doLoad() {
        if (fileDialog == null)
            fileDialog = new JFileChooser();
        boolean hidingEnabled = fileDialog.isFileHidingEnabled();
        fileDialog.setFileHidingEnabled(false);
        fileDialog.setDialogTitle("Open");
        fileDialog.setSelectedFile(null);  // No file is initially selected.
        fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileDialog.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            File file = fileDialog.getSelectedFile();
            System.out.println(file.getName());
        }
    }


    /**
     * Carry out the "New" command from the File menu by clearing all
     * the text from the JTextArea.  Also sets the title bar of the
     * window to read "TrivialEdit: Untitled".
     */
    private void doNew() {
        text.setText("");
        editFile = null;
        setTitle("TrivialEdit: Untitled");
    }


    /**
     *  Carry out the Save command by letting the user specify an output file
     *  and writing the text from the JTextArea to that file.
     */
    private void doSave() {
        if (fileDialog == null)
            fileDialog = new JFileChooser();
        File selectedFile;  //Initially selected file name in the dialog.
        if (editFile == null)
            selectedFile = new File("filename.txt");
        else
            selectedFile = new File(editFile.getName());
        fileDialog.setSelectedFile(selectedFile);
        fileDialog.setDialogTitle("Select File to be Saved");
        int option = fileDialog.showSaveDialog(this);
        if (option != JFileChooser.APPROVE_OPTION)
            return;  // User canceled or clicked the dialog's close box.
        selectedFile = fileDialog.getSelectedFile();
        if (selectedFile.exists()) {  // Ask the user whether to replace the file.
            int response = JOptionPane.showConfirmDialog( this,
                    "The file \"" + selectedFile.getName()
                            + "\" already exists.\nDo you want to replace it?",
                    "Confirm Save",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE );
            if (response != JOptionPane.YES_OPTION)
                return;  // User does not want to replace the file.
        }
        PrintWriter out;
        try {
            FileWriter stream = new FileWriter(selectedFile);
            out = new PrintWriter( stream );
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Sorry, but an error occurred while trying to open the file:\n" + e);
            return;
        }
        try {
            out.print(text.getText());  // Write text from the TextArea to the file.
            out.close();
            if (out.checkError())   // (need to check for errors in PrintWriter)
                throw new IOException("Error check failed.");
            editFile = selectedFile;
            setTitle("TrivialEdit: " + editFile.getName());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Sorry, but an error occurred while trying to write the text:\n" + e);
        }
    }


    /**
     * Carry out the Open command by letting the user specify a file to be opened
     * and reading up to 10000 characters from that file.  If the file is read
     * successfully and is not too long, then the text from the file replaces the
     * text in the JTextArea.
     */
    public void doOpen() {
        if (fileDialog == null)
            fileDialog = new JFileChooser();
        fileDialog.setDialogTitle("Select File to be Opened");
        fileDialog.setSelectedFile(null);  // No file is initially selected.
        int option = fileDialog.showOpenDialog(this);
        if (option != JFileChooser.APPROVE_OPTION)
            return;  // User canceled or clicked the dialog's close box.
        File selectedFile = fileDialog.getSelectedFile();
        Scanner in;
        try {
            in = new Scanner( selectedFile );
        }
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this,
                    "Sorry, but an error occurred while trying to open the file:\n" + e);
            return;
        }
        try {
            StringBuilder input = new StringBuilder();
            while (in.hasNextLine()) {
                String lineFromFile = in.nextLine();
                if (lineFromFile == null)
                    break;  // End-of-file has been reached.
                input.append(lineFromFile);
                input.append('\n');
                if (input.length() > 10000)
                    throw new IOException("Input file is too large for this program.");
            }
            text.setText(input.toString());
            editFile = selectedFile;
            setTitle("TrivialEdit: " + editFile.getName());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Sorry, but an error occurred while trying to read the data:\n" + e);
        }
        finally {
            in.close();
        }
    }


    /**
     * Carry out the Quit command by exiting the program.
     */
    private void doQuit() {
        System.exit(0);
    }


} // end class TrivialEdit
