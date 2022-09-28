package com.packt.datastructuresandalg.lesson2.activity.selectionsort.solution;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPtr = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minPtr]) {
                    minPtr = j;
                }
            }
            swap(array, minPtr, i);
        }
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] numbers = new int[]{5, 3, 5, 1, 6, 8, 1, 9, 0, 1, 3, 12};
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
