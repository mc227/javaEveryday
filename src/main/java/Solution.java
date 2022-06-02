import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class Solution {
    public static void main(String[] args) throws Exception {
    /*
    Symbol frequency




    3. You need to calculate the frequency of each symbol in the file and display the results.
    4. The displayed results should be sorted by ascending ASCII code.
    5. The stream used to read the file must be closed.
    * */
        // sympbol frequency from scratch
        // The program is started with one argument: the name of a file that contains text.
//        System.out.println(args[0]);
        // Calculate how often each symbol is encountered.
        // there are three symbols in file1.txt
        // i recreated the 'example' given
        // Sort the results by increasing ASCII code (read about it online).
        //    Example:
        //    ','=44, 's'=115, 't'=116.
        //    Display the sorted results:
        //    [symbol1] frequency1
        //    [symbol2] frequency2
        //    Close the streams.
        //
        //    Example output:
        //    , 19
        //    - 7
        //    f 361
        // Requirements:
        //    1. You don't need to read anything from the console.
        // 2. Create a stream to read from the file passed as the first argument of the main method.
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] byteArray = new byte[bufferedInputStream.available()];
        PrintStream console =  System.out;

    }
}