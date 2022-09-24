package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Searching for the right lines
Mark Costales Solution
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
//        words.add("A");
//        words.add("B");
//        words.add("C");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
//        try (BufferedReader rd = new BufferedReader(new FileReader("abc.txt"))) {

            String line;
            while ((line = rd.readLine()) != null) {
                int count = 0;
                // file
                for(int i = 0; i < words.size(); i++) {
                    Pattern p = Pattern.compile(words.get(i));
                    Matcher m = p.matcher(line);
                    while (m.find()){
                        count +=1;
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
            }
        }
    }
}
