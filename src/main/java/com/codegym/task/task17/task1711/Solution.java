package com.codegym.task.task17.task1711;

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

        // first I find out what they start out with; c, u, i or d
        if(args[0].equals("-c")){
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
        }
        if(args[0].equals("-u")){
            wordList.remove("-u");
            int targetSize = 4;
            List<String> largeListString = wordList;
            List<List<String>> output = Solution.partition(largeListString, targetSize);
            for (List<String> item: output) {
                allPeople.get(Integer.parseInt(item.get(0))).setName(item.get(1));
                if (item.get(2).equals("m")) {
                    allPeople.get(Integer.parseInt(item.get(0))).setSex(com.codegym.task.task17.task1711.Sex.MALE);
                } else {
                    allPeople.get(Integer.parseInt(item.get(0))).setSex(Sex.FEMALE);
                }
                allPeople.get(Integer.parseInt(item.get(0))).setBirthDate(formatter.parse(item.get(3)));
            }
        }
        if(args[0].equals("-d")){
            wordList.remove("-d");
            for(String item: wordList){
//                System.out.println(item);
                allPeople.get(Integer.parseInt(item)).setName(null);
                allPeople.get(Integer.parseInt(item)).setBirthDate(null);
                allPeople.get(Integer.parseInt(item)).setSex(null);
            }
        }

        if(args[0].equals("-i")){
            wordList.remove("-i");
            for(String item: wordList){
                Person mark = allPeople.get(Integer.parseInt(item));
                String stringGender = ((mark.getSex() == Sex.MALE) ? "m" : "f");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy");
                System.out.printf("%s %s %s", mark.getName(), stringGender,simpleDateFormat.format(mark.getBirthDate(), stringBuffer, new FieldPosition(0)));
                System.out.println();
            }

        }
    }
    //
    // I feel like that this is really long
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
