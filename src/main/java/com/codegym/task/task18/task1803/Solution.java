package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }

        inputStream.close();
        int count=0;
        int max = 1;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                }
            }
            map.put(list.get(i),count);
            if (count > max) {
//                System.out.println(count);
                max = count;
            }
            count=0;
        }
//        System.out.println(map.toString());
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
