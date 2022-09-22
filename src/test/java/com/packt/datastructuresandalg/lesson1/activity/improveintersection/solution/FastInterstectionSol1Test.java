package com.packt.datastructuresandalg.lesson1.activity.improveintersection.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FastInterstectionSol1Test {
    @Test
    void first() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        FastInterstectionSol1 fastInterstectionSol1 = new FastInterstectionSol1();
        assertEquals(fastInterstectionSol1.intersectionFast(numbers1,numbers2), List.of(66,24));
    }
}