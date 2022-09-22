package com.packt.datastructuresandalg.lesson1.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void FalseTest() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(binarySearch.binarySearch(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),false);
    }

    @Test
    void TrueExample() {
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(binarySearch.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),true);
    }
}

