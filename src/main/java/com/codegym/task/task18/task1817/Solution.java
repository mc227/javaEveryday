package com.codegym.task.task18.task1817;

/*
Spaces

Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count all the characters (n1).
2. Count the spaces (n2).
3. Display n2/n1*100, rounding to 2 decimal places.
4. Close the streams.


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. Calculate and display the ratio of the spaces to all characters in the file.
4. The displayed value must be rounded to 2 decimal places.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Solution {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) throws IOException {

//        The first parameter of the main method is a file name.
        // 1. Count all the characters (n1).

        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }
        int n1=0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > 32 && list.get(i) < 127) {
                n1++;
            }
        }
//        2. Count the spaces (n2).
        int n2 = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 32) {
                n2++;
            }
        }
//        System.out.println(n1);
//        System.out.println(n2);
        float value = (float) n2/(n2+n1)*100;
        System.out.println(df.format(value));
        inputStream.close();
    }
}
