package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new TreeMap<Integer, String>();
    static {
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
    }
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            List<String> list = new ArrayList<>();
            while ((str = bufferedFileReader.readLine()) != null) {
                list.add(str);
            }

            for(Map.Entry<Integer,String> entry: map.entrySet()){
                for(int i = 0; i < list.size(); i++){
                    Pattern pattern = Pattern.compile("\\b"+entry.getKey()+"\\b");
                    Matcher matcher = pattern.matcher(list.get(i));
                    list.set(i,matcher.replaceAll(entry.getValue()));
                }
            }
            for(String l:list) {
                System.out.println(l);
            }
        }
        reader.close();
    }
}
