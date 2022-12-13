package javaEveryday.com.DW.week8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    // attribute
    private ArrayList<Pet> pets;

    // default constructor
    public Manager() {

        // initialize empty pets list
        pets = new ArrayList<Pet>();
    }

    // load all pet files from directory; assumes file name convention starts with pet type Dog or Snake followed by id
    // If directory is not found, it will throw exception
    public Manager(String directory) throws FileNotFoundException {

        // initialize empty pets list
        pets = new ArrayList<Pet>();

        // Create a File object for directory
        File directoryPath = new File(directory);

        // Get list of all files and directories
        File fileslist[] = directoryPath.listFiles();

        if (fileslist == null)
            throw new FileNotFoundException("Could not load, no such directory");

        // declare local variables
        Pet pet = null;
        String line = null;
        Scanner scan = null;

        // Process each Pet file
        for (File file : fileslist) {

            // parse files whose filename starts with "Dog" or "Snake"
            if (file.getName().contains("Dog") || file.getName().contains("Snake")) {

                // open and read line (assumes whole object is stored on single line)
                scan = new Scanner(file);
                line = scan.nextLine();   // assumes the file is not empty

                // if Dog object than call Dog constructor
                if (file.getName().contains("Dog"))
                    pet = new Dog(line);

                // if Snake object than call Dog constructor
                if (file.getName().contains("Snake"))
                    pet = new Snake(line);

                // add Pet object to pets attribute
                pets.add(pet);
            }
        }
    }

    // creates (or overwrites) a file for each Pet object in pets attribute in the given directory
    public void createPetFiles(String directory) throws IOException {

        PrintWriter out = null;

        // for all Pet objects create files using Pet type and id value as filename
        for (int i=0; i < pets.size(); i++) {
            String filename = directory + "/" + pets.get(i).getClass().getSimpleName() + "-" + pets.get(i).getID() + ".txt";
            out = new PrintWriter(new FileWriter(filename));  // create/overwrite file
            out.println(pets.get(i).toString());  // write the pet's data
            out.flush();      // flush all the data to the file
            out.close();    // close the stream
        }
    }

    // display all stored pets on console
    public void displayAllPets() {

        // for all Pet objects display the xml tag data
        for (int i=0; i < pets.size(); i++) {
            System.out.println(pets.get(i).toString());
        }
    }

    // add Pet object
    public void addPet(Pet pet) {
        pets.add(pet);
    }
}