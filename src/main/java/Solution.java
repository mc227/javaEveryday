
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Read 2 file names from the console: file1, file2.
Write all the bytes in file1 to file2, but in the reverse order.
Close the streams.

Requirements:
•	The program should read a file name twice from the console.
•	Use FileInputStream to read from a file, and use FileOutputStream to write to a file.
•	In the second file, you need to write all the bytes from the first file in the reverse order.
•	The FileInputStream and FileOutputStream must be closed.
* */
public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
    public static void main(String[] args) throws IOException {
        logger.info("oh hi Mark");
        FileInputStream fileInputStream =  new FileInputStream("data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("result.txt");
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(fileInputStream.available() > 0) {
            int count = fileInputStream.read();
            arrayList.add(count);
        }

        Collections.reverse(arrayList);

        for(int i = 0; i < arrayList.size(); i++) {
            fileOutputStream.write(arrayList.get(i));
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}