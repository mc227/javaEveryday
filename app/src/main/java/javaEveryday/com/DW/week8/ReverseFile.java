package javaEveryday.com.DW.week8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads numbers from a file named data.dat and writes them to a file
 * named result.dat in reverse order. The input file should contain
 * exactly one real number per line.
 */

public class ReverseFile {

    public static void main(String[] args) {

        Scanner data = null;          // to read data from file
        PrintWriter result = null;     // Character output stream for writing data.
        ArrayList<Double> numbers;     // An ArrayList for holding the data.
        numbers = new ArrayList<Double>();

        try { // Create the output stream.

            result = new PrintWriter(new File("result.dat"));

        } catch (IOException e) {

            System.out.println("Can’t open file result.dat!");
            System.out.println("Error: " + e);
            return; // End the program.
        }

        try { // Create the input stream.

            data = new Scanner(new File("data.dat"));

            // Read numbers from the input file, adding them to the ArrayList.
            while ( data.hasNextDouble() ) { // Read all double values until the end of the file
                double inputNumber = data.nextDouble();
                numbers.add( inputNumber );
            }

            // Output the numbers in reverse order.
            for (int i = numbers.size()-1; i >= 0; i--)
                result.println(numbers.get(i));

            result.flush(); // Make sure data is actually sent to the file.

            if (result.checkError())
                System.out.println("Some error occurred while writing the file.");
            else
                System.out.println("Done!");


            // (Note that PrintWriter doesn’t throw exceptions on output errors.)

            result.close();
            data.close();

        } catch (FileNotFoundException e) {

            System.out.println("Can’t find file data.dat!");
            return; // End the program by returning from main().
        }

    } // end of main()
} // end class ReverseFile