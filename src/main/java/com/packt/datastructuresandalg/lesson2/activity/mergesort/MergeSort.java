package com.packt.datastructuresandalg.lesson2.activity.mergesort;

public class MergeSort {

    /*
    merge(array, start, middle, end)
        i = start
        j = middle + 1
        arrayTemp = initArrayOfSize(end - start + 1)
        for(k = 0 to end - start)
            if(i <= middle && (j < end || (array[i] <= array[j])
                arrayTemp[k] = array[i]
                i++
            else
                arrayTemp[k] = array[j]
                j++
        copyArray(arrayTemp,array,start)
    * */
    private void merge(int[] array, int start, int middle, int end) {

    }

    /*
    mergeSort(array,start,end)
    if(start < end)
        middle = (end - start) / 2 + start
        mergeSort(array,start,middle)
        mergeSort(array,middle+1,end)
        merge(array,start,middle,end)
    * */
    private void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int middle = (end - start)/2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array,start,middle,end);
        }
    }

    public void mergeSort(int[] array) {
        mergeSort(array,0, array.length - 1);
    }
}
