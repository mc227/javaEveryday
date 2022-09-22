package com.packt.datastructuresandalg.lesson1.activity.improveintersection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class IntersectionTest {
    @Test
    void foo1() {
        Intersection intersection = new Intersection();
        List<Integer> list = List.of(4,2,3);
        assertEquals(intersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}), list);
    }
}