package com.packt.datastructuresandalg.lesson2.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRecursiveTest {
    @Test
    void first() {
        int[] numbers = new int[]{5, 3, 5, 1, 6, 8, 1, 9, 0, 1, 3, 12};
        BinarySearchRecursive bSR = new BinarySearchRecursive();
        assertEquals(bSR.binarySearch(7, numbers, 0, 11),false);
    }
}