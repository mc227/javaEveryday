package com.codegym.task.task18.task1818;

/*
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Read 3 file names from the console.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();
        String string3 = bufferedReader.readLine();

        FileOutputStream outputStream1 = new FileOutputStream(string1);
        //Create a stream to write bytes to a file
        FileInputStream inputStream2 = new FileInputStream(string2);
        FileInputStream inputStream3 = new FileInputStream(string3);
        // Write the contents of the second
        // file to the first file,
        // and then append the
        // contents of the third file to the first file.
        while (inputStream2.available() > 0) {
            // Read the entire file in one batch
            byte[] buffer = new byte[1000];
            int count = inputStream2.read(buffer);
            outputStream1.write(buffer, 0, count);
        }

        while (inputStream3.available() > 0) {
            // Read the entire file in one batch
            byte[] buffer = new byte[1000];
            int count = inputStream3.read(buffer);
            outputStream1.write(buffer, 0, count);
        }

        inputStream2.close();
        outputStream1.close();
        inputStream3.close();

        // Close the streams.

    }
}
