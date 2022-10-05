package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] array) {

        for(int i = 0; i < array.length; i++){
            int pointer = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] < array[pointer]){
                    pointer = j;
                }
            }
            swap(array,pointer,i);
        }
    }
     public void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
     }


    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
