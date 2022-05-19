package com.codegym.task.task18.task1807;

/*
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Read a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Create a FileInputStream object bound to «c:/data.txt».
        String string = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(string);
        ArrayList<Long> arrayList = new ArrayList<>();
        while (inputStream.available() > 0) //as long as there are unread bytes
        {
            long data = inputStream.read(); //Read the next byte
//            System.out.println(data);
            arrayList.add(data);
        }
        inputStream.close(); // Close the stream
        int count = 0;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if(arrayList.get(i)==44){
                count++;
            }
        }
        System.out.println(count);
    }
}
