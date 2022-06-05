//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//
///*
//DownloadException
//1 Read file names from the console.
//2 If the file is less than 1000 bytes, then:
//2.1 Close the file stream.
//2.2. Throw a DownloadException.
//
//Requirements:
//•	The program should read file names from the console.
//•	Use a FileInputStream to read from the files.
//•	The program should work until the entered file is less than 1000 bytes.
//•	The program should terminate with a DownloadException.
//•	The FileInputStream must be closed.
//* */
//public class Solution {
//    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
//    public static void main(String[] args) throws IOException, DownloadException {
//        logger.info("oh hi Mark");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while(true) {
//            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
//            if(fileInputStream.available() < 1000) {
//                fileInputStream.close();
//                throw new DownloadException();
//            }
//        }
//
//    }
//    public static class DownloadException extends Exception {
//
//    }
//}

/*
DownloadException

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            FileInputStream inputStream = new FileInputStream(reader.readLine());
            if(inputStream.available()<1000) {
                inputStream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
