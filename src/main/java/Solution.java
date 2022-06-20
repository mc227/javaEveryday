

import java.io.*;
import java.util.Arrays;

/*
Symbol frequency

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // The program is started with one argument: the name of a file that contains text.
        // Calculate how often each symbol is encountered.
        // Sort the results by increasing ASCII code (read about it online).
        int[] aSCII = new int[128];
        FileReader fileReader = new FileReader(args[0]);
        while(fileReader.ready()) {
            int data = fileReader.read();
            aSCII[data]++;
        }

        for(int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println( (char)i + " " + aSCII[i] );
            }
        }
    }
}
