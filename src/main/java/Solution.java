


import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Combining files
* Read 2 file names from the console.
* Write the contents of the second
* file to the beginning of the first file so that
* the files are combined.
* Close the streams.
* */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try(FileInputStream fileInputStream1 = new FileInputStream(filename1);
            FileInputStream fileInputStream2 = new FileInputStream(filename2)) {
            while(fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while(fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
