package com.codegym.task.task17.task1711;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // Start here
        /*-c (adds all people with the specified
        arguments to the end of allPeople;
        displays their ids in the appropriate order)
        * */
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
