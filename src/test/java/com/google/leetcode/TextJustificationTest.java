package com.google.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextJustificationTest {
    @Test
    void first() {
        TextJustification textJustification = new TextJustification();
        String[] array = {"This", "is", "an", "example", "of", "text", "justification."};
        assertEquals(textJustification.fullJustify(array,16), List.of(array));
    }
}

