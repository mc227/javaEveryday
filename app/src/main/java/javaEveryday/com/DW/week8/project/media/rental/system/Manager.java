package javaEveryday.com.DW.week8.project.media.rental.system;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Manager stores a list of Media objects using ArrayList.
 * It has a default constructor which just initializes this
 * list to an empty list and another overloading
 * constructor with gets a directory as parameter
 * and loads all the Media object files from that directory.
 * It identifies the Media files based on naming convention of
 * starting with string "Ebook", "MusicCD" or "MovieDVD".
 */
public class Manager {
    // attribute
    private ArrayList<Media> mediaObjects;

    public Manager() {
        mediaObjects = new ArrayList<Media>();
    }

    // load all media files from directory;
    // assumes file name convention starts with
    // Media type Ebook,
    // MusicCD or MovieDVD
    // If directory is not found, it will throw exception
    public Manager(String directory) throws FileNotFoundException {
        // initialize empty media objects
        mediaObjects = new ArrayList<Media>();

        // Create a File object for directory
        File directoryPath = new File(directory);

        // Get list of all files and directories
        File fileslist[] = directoryPath.listFiles();

        if (fileslist == null)
            throw new FileNotFoundException("Could not load, no such directory");

        // declare local variables
        Media media = null;
        String line = null;
        Scanner scan = null;

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
    } // end of constructor

    // creates (or overwrites) a file for each Media object in medias attribute in the given directory
    public void createMediaFiles(String directory) throws IOException {

        PrintWriter out = null;

        // for all Pet objects create files using Pet type and id value as filename
        for (int i=0; i < mediaObjects.size(); i++) {
            String filename =
                    directory + "/" + mediaObjects.get(i).getClass().getSimpleName() + "-" + mediaObjects.get(i).getId() +
                    ".txt";
            out = new PrintWriter(new FileWriter(filename));  // create/overwrite file
            out.println(mediaObjects.get(i).toString());  // write the pet's data
            out.flush();      // flush all the data to the file
            out.close();    // close the stream
        }
    }
    // display all stored media on console
    public void displayAllMedia() {
        // for all media objects display the data
        for(int i = 0; i < mediaObjects.size(); i++) {
            System.out.println(mediaObjects.get(i).toString());
        }
    }

    // add media object
    public void addMedia(Media media) {
        mediaObjects.add(media);
    }
}
