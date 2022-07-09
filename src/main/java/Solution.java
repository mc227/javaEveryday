import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Threads and bytes
Read file names from the console until the word "exit" is entered.
Pass the file name to the ReadThread thread.
The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
where the String parameter is the file name and the Integer parameter is the relevant byte.
Close the streams.

Requirements:

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Read file names from the console until the word "exit" is entered.
        String filename;
        while(!(filename = bufferedReader.readLine()).equals("exit")){

        }
    }
}
