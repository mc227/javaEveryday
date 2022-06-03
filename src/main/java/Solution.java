import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Minimum byte */
//        Enter a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//                Find the minimum byte in the file. Display it on the screen.
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        int min = Integer.MAX_VALUE;
        while(fileInputStream.available() > 0) {
            int foo = fileInputStream.read();
            if (foo < min) {
                min = foo;
            }
        }
        System.out.println(min);
//                Close the IO stream.
//
//                Requirements:
//•	The program should read a file name from the console.
//•	Use a FileInputStream to read from the file.
//•	The program should display minimum byte read from the file.
//•	The stream used to read the file must be closed.

    }
}