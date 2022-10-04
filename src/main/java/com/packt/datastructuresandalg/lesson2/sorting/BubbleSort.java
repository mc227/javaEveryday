package com.packt.datastructuresandalg.lesson2.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] numbers) {

    }

    public void sortImprovement1(int[] numbers) {

    }

    public void sortImprovement2(int[] numbers) {

    }

    private void swap(int[] numbers, int j, int k) {

    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
        int[] numbers1 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
        int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
        bubbleSort.sort(numbers);
        bubbleSort.sortImprovement1(numbers1);
        bubbleSort.sortImprovement2(numbers2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
    }
}
