package javaEveryday.com.DW.week8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DriveManager {

    public static void main(String[] args) {

        // create a default manager
        Manager mgt = new Manager();

        // create some pet objects
        Snake snake = new Snake("Joe", 1236, 6);
        Dog dog1 = new Dog("Buz", 1234, "ABC123");
        Dog dog2 = new Dog("Snow", 1235, "ZBC234");

        // add Pet objects to manager's list
        mgt.addPet(snake);
        mgt.addPet(dog1);
        mgt.addPet(dog2);

        // display pets data to the console (in xml tag format)
        System.out.println("Pet objects add to the manager after startup:");
        mgt.displayAllPets();

        try {
            // create pet files in directory "C:/tmp-umuc"
            mgt.createPetFiles("tmp-umuc");
        } catch (IOException e) {
            e.printStackTrace();  // just print trace if there are issues
        }

        try {
            // create new manager object loading the files
            Manager mgt2 = new Manager("tmp-umuc");

            // // display pets data to the console (in xml tag format)
            System.out.println("\nPet objects loaded by manager2 at startup:");
            mgt2.displayAllPets();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}