import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    // one-dimensional array of strings is of type String[]
    public static void main(String[] args) {
        // convert one-dimensional array of strings to ArrayList of Strings
        List<String> wordList = Arrays.asList(args);
        for (String e : wordList) {
            System.out.println(e);
        }
        // I want to get rid of -c
        wordList.remove(new String("-c"));
        for (String e : wordList) {
            System.out.println(e);
        }
        // now try splitting them
//        List<String> first = wordList.subList(0,2);
//        List<String> last = wordList.subList(2,4);
//        System.out.println("###");
//        for(String e: first) {
//            System.out.println(e);
//        }
//        System.out.println("###");
//        for(String e: last) {
//            System.out.println(e);
//        }
        // we will use .subList on the
    }
}