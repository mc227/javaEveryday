package javaEveryday.com.DW.week8.discussion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program reads data from "twoDimArray.dat"
 * and reads all the lines as a string builder.
 * Then converts the string builder into a one dimensional array.
 * Then stores the one dimensional array in a two-dimensional
 * array.
 * Finally, a nested for-loop is used
 * to print the values in a table format.
 *
 */
public class Solution
{
    public static void main(String[] args) throws IOException {
        // added exception to method signature instead of
        // using a try catch
        StringBuilder sb = new StringBuilder(); // initialze the string builder
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader("twoDimArray.dat")))
        { // read file
            int rows = 0; // initialze rows
            while (inputFileReader.ready()) {// while loop is true as long as there are bytes to read
                sb.append(inputFileReader.readLine() + " ");
                rows++;
            }
            String stringContent = sb.toString(); // turn Stringbuilder to string
            String[] array = stringContent.split(" "); // turn string to String array

            int columns = array.length/rows; // calculate the number of columns
            int A[][] = new int[rows][columns];
            int mark = 0;
            for(int i=0; i < rows;i++)
            { // populate the 2d array
                for(int j = 0;j < columns;j++)
                {
                    A[i][j] = Integer.parseInt(array[mark++]);
                }
            }

            // double for loop to print the values
            for(int row = 0; row < rows; row++)
            {
                for(int col = 0; col < columns;col++)
                {
                    System.out.printf("%14d", A[row][col]);
                }
                System.out.println();
            }
        }

    } // end of main
} // end of solution
