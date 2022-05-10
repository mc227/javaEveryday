package com.codegym.task.task17.task1711;

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

    public static void main(String[] args) {
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
            System.out.println("Here");
            // then here I remove the tag
            wordList.remove("-c");
            // create an arraylist of arraylist of strings in chunks of 3
            int targetSize = 3;
            List<String> largeListString = wordList;
            List<List<String>> output = Solution.partition(largeListString, targetSize);

        }
    }

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
