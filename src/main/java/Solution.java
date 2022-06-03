import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Maximum byte*/
//        Enter a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//                Find the maximum byte in the file. Display it on the screen.
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        byte max = 0;
        while(fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            System.out.println(data);
            if(data > max) {
                max = (byte) data;
            }
        }
        System.out.println(max);
//                Close the IO stream.
        fileInputStream.close();
        bufferedReader.close();
//
//                Requirements:
//•	The program should read a file name from the console.
//•	Use a FileInputStream to read from the file.
//•	The program should display the maximum byte read from the file.
//•	The stream used to read the file must be closed.

    }
}