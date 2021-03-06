package com.codegym.task.task17.task1711;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        // Start here
        // here are things the others will be using
        String pattern = "M d y";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.ENGLISH);
        StringBuffer stringBuffer = new StringBuffer();

        // here I put all of the contents of args in an arraylist
        ArrayList<String> wordList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            wordList.add(args[i]);
        }

        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    // then here I remove the tag
                    wordList.remove("-c");
                    // create an arraylist of arraylist of strings in chunks of 3
                    int targetSize = 3;
                    List<String> largeListString = wordList;
                    List<List<String>> output = Solution.partition(largeListString, targetSize);
                    // now loop through the arraylist of array list and populate allPeople
                    for (List<String> item: output) {
                        // determine bender
                        if(item.get(1).equals("m")){
                            try {
                                allPeople.add(Person.createMale(item.get(0), formatter.parse(item.get(2))));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.println(allPeople.size()-1);
                        }
                        if(item.get(1).equals("f")){
                            try {
                                allPeople.add(Person.createFemale(item.get(0),formatter.parse(item.get(2))));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.println(allPeople.size()-1);
                        }
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    wordList.remove("-u");

                    List<String> largeListString2 = wordList;
                    List<List<String>> output2 = Solution.partition(largeListString2, 4);
                    for (List<String> item: output2) {
                        allPeople.get(Integer.parseInt(item.get(0))).setName(item.get(1));
                        if (item.get(2).equals("m")) {
                            allPeople.get(Integer.parseInt(item.get(0))).setSex(com.codegym.task.task17.task1711.Sex.MALE);
                        } else {
                            allPeople.get(Integer.parseInt(item.get(0))).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(item.get(0))).setBirthDate(formatter.parse(item.get(3)));
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    wordList.remove("-d");
                    for(String item: wordList){

                        allPeople.get(Integer.parseInt(item)).setName(null);
                        allPeople.get(Integer.parseInt(item)).setBirthDate(null);
                        allPeople.get(Integer.parseInt(item)).setSex(null);
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    wordList.remove("-i");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy");
                    Date date = Calendar.getInstance().getTime();
                    DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");

                    for(String item: wordList){
                        Person person = allPeople.get(Integer.parseInt(item));
                        String strDate = dateFormat.format(person.getBirthDate());
                        String stringGender = ((person.getSex() == Sex.MALE) ? "m" : "f");
                        System.out.printf("%s %s %s \n", person.getName(), stringGender,strDate);
                    }
                    break;
                }
        }
    }

    public static <T> List<List<T>> partition(List<T> list, int size) {
        if (list == null) {
            throw new NullPointerException("List must not be null");
        } else if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        } else {
            return new Solution.Partition(list, size);
        }
    }

    private static class Partition<T> extends AbstractList<List<T>> {
        private final List<T> list;
        private final int size;

        private Partition(List<T> list, int size) {
            this.list = list;
            this.size = size;
        }

        public List<T> get(int index) {
            int listSize = this.size();
            if (index < 0) {
                throw new IndexOutOfBoundsException("Index " + index + " must not be negative");
            } else if (index >= listSize) {
                throw new IndexOutOfBoundsException("Index " + index + " must be less than size " + listSize);
            } else {
                int start = index * this.size;
                int end = Math.min(start + this.size, this.list.size());
                return this.list.subList(start, end);
            }
        }

        public int size() {
            return (int)Math.ceil((double)this.list.size() / (double)this.size);
        }

        public boolean isEmpty() {
            return this.list.isEmpty();
        }
    }
}
