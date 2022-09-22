package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        String fileName = args[0];
        SimpleDateFormat ft = new SimpleDateFormat("MM dd yyyy");
//        Person person = new Person("Mark Costales", ft.parse("9 22 2000"));

        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String[] splitedLine;
            String line;

            // MC Hammer 12 12 2022
            while ((line = rd.readLine()) != null) {
                splitedLine = line.split(" ");
                ArrayList<String> nameList = new ArrayList<String>();
                // add elements of array to arraylist
                nameList.addAll(Arrays.asList(splitedLine));
                String year = nameList.get(nameList.size()-1);
                String day = nameList.get(nameList.size()-2);
                String month = nameList.get(nameList.size()-3);
                String date = month+" "+day+" "+year;
                nameList.remove(year);
                nameList.remove(day);
                nameList.remove(month);
                String fullName =  nameList.stream().collect(Collectors.joining(" "));
//                System.out.println(fullName);
//                System.out.println(date);
                PEOPLE.add(new Person(fullName,ft.parse(date)));
            }
        } catch (IOException ignore) {
            /*NOP */
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        for(Person p: PEOPLE) {
//            System.out.println(p.getBirthDate());
//        }
    }
}
