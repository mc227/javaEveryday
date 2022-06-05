import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        Read a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
//                Count the number of commas (',') in the file. Display the number.
        int comma = 0;
        while(fileInputStream.available() > 0) {
            int count = fileInputStream.read();
            if (count == 44) {
                comma++;
            }
        }
        System.out.println(comma);
//                Close the streams.
        bufferedReader.close();
        fileInputStream.close();
//
//        Hint:
//        You need to compare with the ASCII code for ','.
//
//                Requirements:
//•	The program should read a file name from the console.
//•	Use a FileInputStream to read from the file.
//•	The program should display the number of commas in the read file.
//•	The stream used to read the file must be closed.
    }
}