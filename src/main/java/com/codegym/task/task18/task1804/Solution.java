package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        //Create a FileInputStream object bound to «c:/data.txt».
//        String string = bufferedReader.readLine();
//        FileInputStream inputStream = new FileInputStream(string);
//        // store each byte in an arraylist
//
//        Map<Long, Integer> map = new HashMap<>();
//
//        while (inputStream.available() > 0) //as long as there are unread bytes
//        {
//            long data = inputStream.read(); //Read the next byte
//
//            if(map.containsKey(data)){
//                map.put(data, map.get(data)+1);
//            } else {
//                map.put(data,1);
//            }
//
//        }
//        inputStream.close(); // Close the stream
//        // iterating through key/value mappings
////        System.out.print("Entries: ");
////        for(Map.Entry<Long, Integer> entry: map.entrySet()) {
////            System.out.print(entry);
////            System.out.print(", ");
////        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        String space = "";
//        for(Map.Entry<Long, Integer> entry: map.entrySet()) {
//            if(entry.getValue().equals(1)){
//                System.out.print(space+entry.getKey());
//                space =" ";
//            }
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }
        //
//        System.out.println(list.toString());
        inputStream.close();
        int count=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                }
            }
            map.put(list.get(i),count);
            if (count < min) {
                System.out.println(count);
                min = count;
            }
            count=0;
        }
//        System.out.println(map.toString());
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
/*
112 83 68 116 72 105 121 110
112 83 68 116 72 105 121 110
* */