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
        String pattern = "M d y";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.ENGLISH);

        if(args[0].equals("-c")){
            if(args[2].equals("m")){
                allPeople.add(Person.createMale(args[1], formatter.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
            else if(args[2].equals("f")){
                allPeople.add(Person.createFemale(args[1],formatter.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
            /*
//            // delete this
//            for(int i = 0; i < allPeople.size(); i++) {
//                System.out.println(allPeople.get(i).getName());
//            }
//            // delete above
             */
        }
        if(args[0].equals("-u")){
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            if (args[3].equals("m")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(formatter.parse(args[4]));
        }
    }
}
// -c Washington m "04 15 1990"
// -u 0 Mark m "05 01 90"