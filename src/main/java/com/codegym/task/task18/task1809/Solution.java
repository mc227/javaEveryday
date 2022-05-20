package com.codegym.task.task18.task1809;

/*
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        FileInputStream inputStream = new FileInputStream(reader.readLine());
//        //Create a stream to write bytes to a file
//        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
//
//        byte[] buffer = new byte[inputStream.available()    ];
//        while (inputStream.available() > 0) //as long as there are unread bytes
//        {
//            //Read the next block of bytes into buffer, and store the actual number of bytes read in count.
//            int count = inputStream.read(buffer);
//            outputStream.write(buffer, 0, count); //Write a block (part of a block) to the second stream
//        }
//
//        inputStream.close(); //Close both streams. We don't need them any more.
//        outputStream.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream in = new FileInputStream(reader.readLine());
        OutputStream out = new FileOutputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int tot = in.available();
        byte[] byte1 = new byte[tot];
        while(in.available()>0){
            int read = in.read(byte1);
            list.add(read);
        }
        in.close();
        System.out.println(list.size());
        Collections.reverse(list);
        for(int i = byte1.length-1; i >= 0; i--)
            out.write(byte1[i]);
        out.close();
    }
}
