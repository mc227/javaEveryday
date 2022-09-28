package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

public class SelectionSort {

    public void sort(int[] array) {
        int left = 0;
        int right = array.length;
        while(left < right) {
            for(int i = 0; i < right; i++) {
                if(array[i] > array[right-1]){
                    int temp = array[i];
                    array[i] = array[right-1];
                    array[right-1] = temp;
                }
            }
            right--;
        }
    }
}
