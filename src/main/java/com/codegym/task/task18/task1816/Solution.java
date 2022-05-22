package com.codegym.task.task18.task1816;

/*
ABCs

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // The first parameter of the main method is a file name.
        // Count the letters of the English alphabet in the file.
        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }
        int count=0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > 63 && list.get(i) < 91) {
                count++;
            }
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > 96 && list.get(i) < 123) {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
