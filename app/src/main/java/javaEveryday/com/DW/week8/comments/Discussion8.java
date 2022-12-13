package javaEveryday.com.DW.week8.comments;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Discussion8 {
    public static void main(String[] args) throws FileNotFoundException {
        final int NUM_CLASSES = 3;
        int numStudents = 4;
        String [][] nums = new String [numStudents][NUM_CLASSES]; //2D array
        int row = 0; //current row for 2D array
        int col = 0; //current column for 2D array
        Scanner info; //used to read data from file

//        try { //create input stream
        info = new Scanner(new FileReader("grades.txt"));
        while (info.hasNextLine()) {
            String line = info.nextLine(); //save the entire line into the "line" variable
            String [] numLine = new String [NUM_CLASSES]; //create array with same size as number of columns in 2D array
            numLine = line.split(","); //split "line" variable by commas (returns an array) and input data into 1D array numLine
            nums[row] = numLine; //input numLine data into nums 2D array, it will automatically fill the column data
            //this is taking a student's name and all their grades and inputting it all into a row at once

            row += 1;

        } //end while

        info.close();

        //nested for loop print
        for (int i = 0; i < numStudents; i++) { //row
            for (int j = 0; j < NUM_CLASSES; j++) { //column
                System.out.printf("%-20s", nums[i][j]);
            }
            System.out.println();
        }

//        } catch (FileNotFoundException e) {
//            System.out.println("File does not exist");
//        } //end catch
    }

}
