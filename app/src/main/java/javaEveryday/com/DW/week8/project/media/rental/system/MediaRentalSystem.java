package javaEveryday.com.DW.week8.project.media.rental.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu driven user interface
 * This program lets user load, find and rent media files.
 */
public class MediaRentalSystem extends JFrame {
    public static  Manager mgt = new Manager();
    public static  ArrayList<Media> mediaObjects = new ArrayList<Media>();
    /**
     * This  directory is temporarily hard coded.
     */
    public static File directoryPath = new File("C:\\Users\\Mark Costales\\Documents\\tmp-umuc");
    // Get list of all files and directories
    public static File fileslist[] = directoryPath.listFiles();
    public static  Media media = null;
    public static  String line = null;
    public static  Scanner scan = null;
    private JTextArea text;   // Holds the text that is displayed in the window.
    private JFileChooser fileDialog;  // File dialog for use in doOpen() an doSave().


    /**
     * The main program just opens a window belonging to this MediaRentalSystem class.
     * Then the window takes care of itself until the program is ended with the
     * Quit command or when the user closes the window.
     */
    public static void main(String[] args) throws IOException {
        JFrame window = new MediaRentalSystem();
        window.setVisible(true);

        // create some media objects
        EBook ebook = new EBook(123, "Forever Young", 2018, true, 20);
        MovieDVD movieDVD = new MovieDVD(126, "Forever Young", 2020, false, 140.0);
        MusicCD musicCD = new MusicCD(127, "Song", 2022, true, 100);
        // add Media objects to manager's list
        mgt.addMedia(ebook);
        mgt.addMedia(movieDVD);
        mgt.addMedia(musicCD);
        mgt.createMediaFiles(directoryPath.getAbsolutePath());


        // Process each Media file
        for(File file: fileslist) {
            // parse files whose filename starts with "Ebook" , "MusicCD" or "MovieDVD"
            if (file.getName().contains("EBook") || file.getName().contains("MusicCD") || file.getName().contains(
                    "MovieDVD")) {

                // open and read line (assumes whole object is stored on single line)
                scan = new Scanner(file);
                line = scan.nextLine();   // assumes the file is not empty

                // if Ebook object than call Ebook constructor
                if (file.getName().contains("EBook"))
                    media = new EBook(line);

                // if MusicCD object than call MusicCD constructor
                if (file.getName().contains("MusicCD"))
                    media = new MusicCD(line);

                // if MovieDVD object than call MovieDVD constructor
                if (file.getName().contains("MovieDVD"))
                    media = new MovieDVD(line);

                // add Pet object to pets attribute
                mediaObjects.add(media);
            }
        }//end of for loop
    }

    /**
     * Create a MediaRental window, with a JTextArea where the user can
     * edit some text and with a menu bar.
     */
    public MediaRentalSystem() {
        super("Welcome to Media Rental System");  // Specifies title of the window.
        setJMenuBar( makeMenus() );
        text = new JTextArea(25,50);
        text.setMargin( new Insets(3,5,0,0) ); // Some space around the text.
        text.setEditable(false);
        text.setBackground(new Color(238,238,238,255));// customize the color
        JScrollPane scroller = new JScrollPane(text);
        setContentPane(scroller);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocation(50,50);
    }

    /**
     * Create and return a menu bar containing a single menu, the
     * File menu.  This menu contains commands Load, Find, Rent
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
                if (cmd.equals("Load Media objects...")) {
                    try {
                        doLoad();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else if(cmd.equals("Find Media object...")) {
                    try {
                        doFind();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                } else if(cmd.equals("Rent Media object...")) {
                    try {
                        doRent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        JMenu fileMenu = new JMenu("Menu");

        JMenuItem loadCmd = new JMenuItem("Load Media objects...");
        loadCmd.addActionListener(listener);
        fileMenu.add(loadCmd);

        JMenuItem findCmd = new JMenuItem("Find Media object...");
        findCmd.addActionListener(listener);
        fileMenu.add(findCmd);

        JMenuItem rentCmd = new JMenuItem("Rent Media object...");
        rentCmd.addActionListener(listener);
        fileMenu.add(rentCmd);

        fileMenu.addSeparator();

        JMenuItem quitCmd = new JMenuItem("Quit");
        quitCmd.addActionListener(listener);
        fileMenu.add(quitCmd);

        JMenuBar bar = new JMenuBar();
        bar.add(fileMenu);
        return bar;

    } // end makeMenus()

    /**
     * Method for renting media
     * @throws IOException
     */
    private void doRent() throws IOException {
        mgt.displayAllMedia();
        String idEntry = JOptionPane.showInputDialog(null,"Enter the id");
        for(Media item: mediaObjects) {
            if(item.getId()==Integer.parseInt(idEntry)) {
                if(item.calculateRentalFee()==2.0){
                    JOptionPane.showMessageDialog(this,
                            "Media was successfully rented. Rental fee = $2.00");
                    item.setAvailable(false);
                } else if(item.calculateRentalFee()==3.5){
                    JOptionPane.showMessageDialog(this,
                            "Media was successfully rented. Rental fee = $3.50");
                    item.setAvailable(false);
                } else if(item.calculateRentalFee()==3.0) {
                    JOptionPane.showMessageDialog(this,
                            "Media was successfully rented. Rental fee = $3.00");
                    item.setAvailable(false);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "The media object id="+idEntry+" is not found");
            }
        }
        mgt.createMediaFiles(directoryPath.getAbsolutePath());
    }

    /**
     * Uses the instatiated manager object to load the files to the directory
     * @throws FileNotFoundException
     */
    private void doLoad() throws FileNotFoundException {
        if (fileDialog == null)
            fileDialog = new JFileChooser();
        fileDialog.setFileHidingEnabled(false);
        fileDialog.setMultiSelectionEnabled(false);
        fileDialog.setDialogTitle("Open");
        fileDialog.setSelectedFile(null);  // No file is initially selected.
        fileDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileDialog.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            File file = new File(fileDialog.getSelectedFile().getAbsolutePath());
            System.out.println(file.getAbsolutePath());
            mgt = new Manager(file.getAbsolutePath());
            // // display Media data to the console
            System.out.println("\nMedia objects loaded by manager:");
            mgt.displayAllMedia();
        } else {
            // will work on this case in the future
        }
    }

    /**
     * Method to Search for media file
     */
    private void doFind() throws FileNotFoundException {

        String title = JOptionPane.showInputDialog(this,"Enter the title");
        StringBuilder sb = new StringBuilder();
        ArrayList<String> found = new ArrayList<>();
        for(Media item: mediaObjects) {
            if(item.getTitle().equals(title)) {
                found.add(item.toString());
            }
        }
        if (found.size() > 0) {
            String result = "";
            for(int i = 0; i < found.size();i++) {
                result += found.get(i) +"\n";
            }
            JOptionPane.showMessageDialog(this, result);
             // display Strings that were found
        } else {
            JOptionPane.showMessageDialog(this, "There is no media with this title: "+title);
        }
    }

    /**
     * Carry out the Quit command by exiting the program.
     */
    private void doQuit() {
        System.exit(0);
    }


} // end class MediaRentalSystem
