package com.codegym.task.task18.task1808;

/*
Splitting a file

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Read 3 file names from the console: file1, file2, file3.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();
        String string3 = bufferedReader.readLine();

        FileInputStream inputStream1 = new FileInputStream(string1);
        //Create a stream to write bytes to a file
        FileOutputStream outputStream2 = new FileOutputStream(string2);
        FileOutputStream outputStream3 = new FileOutputStream(string3);


        if(inputStream1.available() % 2==0) {
            int length = inputStream1.available()/2;
            for(int i = 0; i < length; i++) {
                int data = inputStream1.read(); // Read the next byte into the data variable
                outputStream2.write(data);
            }
            for(int i = 0; i < length; i++) {
                int data = inputStream1.read(); // Read the next byte into the data variable
                outputStream3.write(data);
            }

        } else {
            int length = inputStream1.available()/2+1;
            for(int i = 0; i < length; i++) {
                int data = inputStream1.read(); // Read the next byte into the data variable
                outputStream2.write(data);
            }
            int length2 = inputStream1.available();
            for(int i = 0; i < length2; i++) {
                int data = inputStream1.read(); // Read the next byte into the data variable
                outputStream3.write(data);
            }
        }

        inputStream1.close(); //Close both streams. We don't need them any more.
        outputStream2.close();
        outputStream3.close();

    }

}
/*
file1.txt
file2.txt
file3.txt
* */