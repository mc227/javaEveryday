package com.codegym.task.task18.task1819;

/*
Combining files

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
////        Read 2 file names from the console.
//        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
//        StringBuilder stringBuilder = new StringBuilder();
//        String line1 = null;
//        String ls = System.getProperty("line.separator");
//        while ((line1 = reader.readLine()) != null) {
//            stringBuilder.append(line1);
//            stringBuilder.append(ls);
//        }
//// delete the last new line separator
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        reader.close();
//
//        String content1 = stringBuilder.toString();
////        System.out.println(content1);
//        BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
//        String line2 = null;
//        //
//        while ((line2 = reader2.readLine()) != null) {
//            stringBuilder.append(line2);
//            stringBuilder.append(ls);
//        }
//// delete the last new line separator
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//
//
//        String content2 = stringBuilder.toString();
////        System.out.println(content2);
//
//        reader.close();
//        reader2.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();

//        Write the contents of the second file to the beginning of the first file so that the files are combined.
        FileInputStream inputStream1 = new FileInputStream(string1);
        //Create a stream to write bytes to a file
        FileOutputStream outputStream1 = new FileOutputStream(string1);
        FileInputStream inputStream2 = new FileInputStream(string2);

        int total1 = inputStream1.available();
        byte[] bytes1 = new byte[total1];
        int read1 = inputStream1.read(bytes1);
        int total2 = inputStream2.available();
        byte[] bytes2 = new byte[total2];
        int read2 = inputStream2.read(bytes2);
        outputStream1.write(bytes2, 0, read2);
        outputStream1.write(bytes1, 0,read1);

        inputStream1.close();
        inputStream2.close();
        outputStream1.close();

    }
}
