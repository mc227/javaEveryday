package com.codegym.task.task19.task1920;

/*
The richest
my solution
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;

/*
Calculating salaries

*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> salary = new TreeMap<>();

        String fileName = args[0];

        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String[] splitedLine;
            String line;
            Double currentValue;

            while ((line = rd.readLine()) != null) {
                splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);

                if (salary.containsKey(name)) {
                    currentValue = salary.get(name);
                    salary.put(name, value + currentValue);
                } else {
                    salary.put(name, value);
                }
            }
        } catch (IOException ignore) {
            /*NOP */
        }

        Double maxValueInMap = (Collections.max(salary.values()));
        for (String key : salary.keySet()) {
            if(salary.get(key).equals(maxValueInMap)){
                System.out.println(key);
            }
        }


    }
}
