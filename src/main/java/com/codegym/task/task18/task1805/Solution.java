package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Enter a file name from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
//        Read all the bytes from the file.
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }

        inputStream.close();
//        System.out.println(list.toString());
        // Ignoring repetitions, sort them by byte-code in ascending order.
        ArrayList<Integer> newList = removeDuplicates(list);
//        System.out.println(newList.toString());
        Collections.sort(newList);
//        System.out.println(newList.toString());
        for(Integer item: newList) {
            System.out.print(item+" ");
        }


    }
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

}
