import java.io.*;
import java.util.Arrays;
// 3.49 3.50 3.51 -3.49 -3.50 -3.51
// 3 4 4 -3 -3 -4
public class Solution {
    // Rounding numbers
    // Read 2 file names from the console.
    // The first file contains real (fractional) numbers, separated by spaces. For example, 3.1415.
    // Round the numbers to integers and write them, separated by spaces, to the second file.
    // Close the streams.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();

        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(filename1));
            PrintWriter printWriter = new PrintWriter(new FileWriter(filename2))){
            while (bufferedFileReader.ready()) {
                String[] splittedFile = bufferedFileReader.readLine().split(" ");
                for (String item: splittedFile) {
                    Double parsedDouble = Double.parseDouble(item);
                    int a = (int) Math.round(parsedDouble);
                    printWriter.print(a+" ");
                }
            }
        }
    }
}