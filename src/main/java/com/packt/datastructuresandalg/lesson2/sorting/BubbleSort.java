package com.packt.datastructuresandalg.lesson2.sorting;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public void sortImprovement1(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }
    public void sortImprovement2(int[] numbers) {
        int i = 0;
        boolean swapOccured = true;
        while (swapOccured) {
            swapOccured = false;
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                System.out.println(Arrays.toString(numbers));
                System.out.printf("i = %s, j = %s%n",i,j);
                System.out.printf("numbers[j] = %s%n",numbers[j]);
                System.out.printf("numbers[j+1] = %s%n",numbers[j+1]);
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapOccured = true;
                }
                System.out.printf("swapOccured: %s%n", swapOccured);
                System.out.println(Arrays.toString(numbers));
                System.out.println("******************");
            }
        }
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,5,6,2,7};
        int[] result = {2,3,5,6,7};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortImprovement2(array);
//        System.out.println(Arrays.toString(array));
    }
}
