package javaEveryday.com.my.random;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {
    TextJustification textJustification = new TextJustification();

    @Test
    void example1() {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        assertEquals(textJustification.fullJustify(arr,16),
                new ArrayList<>(
                        Arrays.asList("This    is    an", "example  of text", "justification.  ")));
    }

    @Test
    void example2() {
        String[] arr = new String[]{"What", "must", "be", "acknowledgement", "shall", "be"};
        assertEquals(textJustification.fullJustify(arr,15),
                new ArrayList<>(
                        Arrays.asList("What   must  be", "acknowledgement", "shall be       ")));
    }
    @Test
    void example3() {
        String[] arr = new String[]{"Science","is","what","we","understand","well","enough",
                "to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        assertEquals(textJustification.fullJustify(arr,20),
                new ArrayList<>(
                        Arrays.asList( "Science  is  what we",
                                "understand      well",
                                "enough to explain to",
                                "a  computer.  Art is",
                                "everything  else  we",
                                "do                  ")));
    }
}