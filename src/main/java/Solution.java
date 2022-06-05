
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
/*
Read 3 file names from the console: file1, file2, file3.
Split file1 as follows:
Write the first half of its bytes to file2,and write the second half of its bytes to file3.
If the number of bytes in file1 is odd, then file2 should contain the larger half.
Close the streams.

Requirements:
•	The program should read a file name three times from the console.
•	Use FileInputStream to read from a file, and use FileOutputStream to write to files.
•	The first half of the bytes in the first file must be written to the second file.
•	The second half of the bytes in the first file must be written to the third file.
•	The FileInputStream and FileOutputStream must be closed.
* */
public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(bufferedReader.readLine());

        logger.info(String.valueOf(fileInputStream.available()));

        if (fileInputStream.available()%2==0) {
            byte[] buffer = new byte[fileInputStream.available()/2];
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0, count);
            byte[] buffer2 = new byte[fileInputStream.available()];
            int count2 = fileInputStream.read(buffer2);
            fileOutputStream2.write(buffer2,0, count2);
        } else{
            byte[] buffer = new byte[fileInputStream.available()/2+1];
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer,0, count);
            byte[] buffer2 = new byte[fileInputStream.available()];
            int count2 = fileInputStream.read(buffer2);
            fileOutputStream2.write(buffer2,0, count2);
        }
        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream2.close();
    }
}