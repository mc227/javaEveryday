package javaEveryday.com.DW.week8.project.media.rental.system;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DriverManager {
    public static void main(String[] args) {
        // create a default manager
        Manager mgt = new Manager();

        // create some media objects
        EBook ebook = new EBook(123, "Forever Young", 2018, true, 20);
        MovieDVD movieDVD = new MovieDVD(126, "Forever Young", 2020, false, 140.0);
        // add cd here

        // add Media objects to manager's list
        mgt.addMedia(ebook);
        mgt.addMedia(movieDVD);

        // display media data to the console
        System.out.println("Media objects add to the manager after startup");
        mgt.displayAllMedia();

        try {
            // create media files in directory "tmp-umuc"
            mgt.createMediaFiles("C:\\Users\\Mark Costales\\Documents\\tmp-umuc");
        } catch (IOException e) {
            e.printStackTrace();  // just print trace if there are issues
        }

        try {
            // create new manager object loading the files
            Manager mgt2 = new Manager("C:\\Users\\Mark Costales\\Documents\\tmp-umuc");

            // // display Media data to the console
            System.out.println("\nMedia objects loaded by manager2 at startup:");
            mgt2.displayAllMedia();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
