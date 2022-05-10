import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.commons.collections4.ListUtils;

public class Solution {
    // one-dimensional array of strings is of type String[]
    public static void main(String[] args) {


        // convert one-dimensional array of strings to ArrayList of Strings
        // added them one by one because adding them at the same time using ... causes errors
        ArrayList<String> wordList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            wordList.add(args[i]);
        }

        // then here I remove the tag
        wordList.remove("-c");
//        for (String e : wordList) {
//            System.out.println(e);
//        }


        int targetSize = 3;
        List<String> largeListString = wordList;
        List<List<String>> output = ListUtils.partition(largeListString, targetSize);

        System.out.println(output.get(0).get(0));

    }
}