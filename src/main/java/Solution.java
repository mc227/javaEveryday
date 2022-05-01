//package com.codegym.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        // Start here
        SimpleDateFormat formatter = new SimpleDateFormat("\"mm dd yyyy\"", Locale.ENGLISH);
        // I read the string with the next two lines
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();

        if (inputString.startsWith("-c")) {
            String gender = inputString.replace("-c ", "").split(" ")[1];
            if (gender.equals("m")) {
                String[] strSplit = inputString.replace("-c ", "").split(" m ");
                ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
                allPeople.add(Person.createMale(strList.get(0), formatter.parse(strList.get(1))));
                for (int i = 0; i < allPeople.size(); i++) {
                    System.out.println(allPeople.get(i).getName());
                }
                System.out.println(allPeople.size()-1);
            } else {
                String[] strSplit = inputString.replace("-c ", "").split(" f ");
                ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
                allPeople.add(Person.createFemale(strList.get(0), formatter.parse(strList.get(1))));


                System.out.println(allPeople.size()-1);
            }
        }
    }
}
