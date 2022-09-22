package com.packt.datastructuresandalg.lesson1.activity.improveintersection.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FastInterstectionSol2 {

    public List<Integer> intersectionFast(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        mergeSort(a);
        mergeSort(b);
        int pointerA = 0,pointerB = 0;
        while(pointerA < a.length && pointerB < b.length) {
            if(a[pointerA] == b[pointerB]) {
                result.add(a[pointerA]);
                pointerA++;
                pointerB++;
            } else if(a[pointerA] > b[pointerB]) pointerB++;
            else pointerA++;
        }
        return result;
    }

    private void mergeSort(int[] input) {
        Arrays.sort(input);
    }
}
