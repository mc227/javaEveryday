package com.packt.datastructuresandalg.lesson2.sorting;


public class BinarySearchRecursive {


    public static void main(String args[]) {
        BinarySearchRecursive binarySearch = new BinarySearchRecursive();
        System.out.println(binarySearch.binarySearch(4, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},0,9));
        System.out.println(binarySearch.binarySearch(79, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},0,9));
    }

    public boolean binarySearch(int i, int[] ints, int start, int end) {
        if(start<=end) {
            int mid = (end-start)/2+start;
            if(ints[mid]==i) return true;
            if(ints[mid]> i) return binarySearch(i,ints, start,mid-1);
            return binarySearch(i,ints, mid+1, end);
        }
        return false;
    }

}
