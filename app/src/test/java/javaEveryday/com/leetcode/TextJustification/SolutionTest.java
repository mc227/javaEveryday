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
//        System.out.println(solution.fullJustify(arr,16).getClass());
        assertEquals(solution.fullJustify(arr,16),
                new ArrayList<>(
                        Arrays.asList("This    is    an", "example  of text", "justification.  ")));

    }
}