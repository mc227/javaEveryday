package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Create a FileInputStream object bound to «c:/data.txt».
        String string = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(string);
        // store each byte in an arraylist
        ArrayList<Long> arrayList = new ArrayList<>();

        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            long data = inputStream.read(); //Read the next byte
//            System.out.println(data);
            arrayList.add(data);
        }
        inputStream.close(); // Close the stream

        long min = arrayList.get(0);
        // loop to find minimum from ArrayList
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        System.out.println(min);
    }
}
