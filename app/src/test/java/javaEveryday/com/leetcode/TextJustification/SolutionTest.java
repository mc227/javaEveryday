package javaEveryday.com.leetcode.TextJustification;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void first() {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        assertEquals(solution.fullJustify(arr,16),
                new ArrayList<>(
                        Arrays.asList("This    is    an", "example  of text", "justification.  ")));

    }

    @Test
    void second() {
        String[] arr = new String[]{"What", "must", "be", "acknowledgement", "shall", "be"};
        assertEquals(solution.fullJustify(arr,15),
                new ArrayList<>(
                        Arrays.asList("What   must  be", "acknowledgement", "shall be       ")));
    }

    @Test
    void third() {
        String[] arr = new String[]{"Science","is","what","we","understand","well","enough",
                "to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        assertEquals(solution.fullJustify(arr,20),
                new ArrayList<>(
                        Arrays.asList( "Science  is  what we",
                                "understand      well",
                                "enough to explain to",
                                "a  computer.  Art is",
                                "everything  else  we",
                                "do                  ")));
    }
}