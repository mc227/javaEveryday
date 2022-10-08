package com.packt.datastructuresandalg.lesson2.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{7,15,14,5,9,18,3,21,23,16,12};
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] array) {
        if(0<array.length){
            int p = partition(array,0,array.length-1);
            sort(array,0,p-1);
            sort(array,p+1,array.length-1);
        }
    }

    public void sort(int[] array, int start, int end) {
        if(start<end){
            int p = partition(array,start,end);
            sort(array,start,p-1);
            sort(array,p+1,end);
        }
    }

    public int partition(int[] array, int start, int end){
        int pivot = array[end];
        int x = start - 1;
        if(start<end) {
            for(int i = start; i < end; i++) {
                if (pivot > array[i]) {
                    x++;
                    swap(array, x, i);
                }
            }
        }
        swap(array, x+1, end);
        return x+1;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
