

import java.io.*;

/* 
Rounding numbers

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();

        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(filename1));
            PrintWriter printWriter = new PrintWriter(new FileWriter(filename2))) {

            while(bufferedFileReader.ready()) {
                String[] splittedLine = bufferedFileReader.readLine().split(" ");
                for(String item: splittedLine) {
                    double parsedDouble = Double.parseDouble(item);
                    long roundedItem = Math.round(parsedDouble);
                    printWriter.print(roundedItem + " ");
                }
            }
        }
    }
}
