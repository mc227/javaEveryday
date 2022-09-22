package com.packt.datastructuresandalg.lesson1.activity.improveintersection.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FastInterstectionSol2Test {
    @Test
    void first() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};
        FastInterstectionSol2 fastInterstectionSol2 = new FastInterstectionSol2();
        assertEquals(fastInterstectionSol2.intersectionFast(numbers1,numbers2), List.of(24,66));
    }
}