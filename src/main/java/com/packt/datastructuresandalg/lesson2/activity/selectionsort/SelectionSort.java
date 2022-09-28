package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

public class SelectionSort {

    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minPointer = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] < array[minPointer]) {
                    minPointer = j;
                }
            }
            swap(array,minPointer,i);
        }
    }
    public static void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }
}
