


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
*
Symbol frequency
The program is started with one argument:
* the name of a file that contains text.
* Calculate how often each symbol is encountered.
* Sort the results by increasing ASCII code (read about it online).
* Example: ','=44, 's'=115, 't'=116. Display the sorted results: [symbol1] frequency1 [symbol2] frequency2
* Example output:
, 19
- 7
f 361
* */
public class Solution {
    public static void main(String[] args) throws IOException {

        try(FileReader fileReader = new FileReader(args[0])){
            int[] aSCII = new int[128];

            while(fileReader.ready()){
                aSCII[fileReader.read()]++;
            }
            for(int i = 0; i < aSCII.length; i++) {
                if(aSCII[i]!=0){
                    System.out.println((char) i + " " + aSCII[i]);
                }
            }
        }

    }
}
