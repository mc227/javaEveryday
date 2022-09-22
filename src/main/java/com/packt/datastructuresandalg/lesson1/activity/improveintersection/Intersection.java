package com.packt.datastructuresandalg.lesson1.activity.improveintersection;

import com.packt.datastructuresandalg.lesson1.binarysearch.BinarySearch;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Intersection {

    private BinarySearch search = new BinarySearch();

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public List<Integer> intersectionFast(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            if(IntStream.of(b).anyMatch(y->y == x )) {
                result.add(x);
            }
        }
        return result;
    }
}
