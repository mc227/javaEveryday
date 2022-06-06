
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Bubble sort
compare two numbers;
if the number on the left is larger, then swap them;
move one position to the right.
* */
public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
    public static void main(String[] args) {
        logger.info("Bubble Sort");
        int[] foo = new int[]{6,3,8,2,6,9,4,11,1};
        bubbleSort(foo);
        for(Integer item: foo) {
            System.out.print(item + " ");
        }
    }
    public static void bubbleSort(int[] foo) {
        for(int i = foo.length-1; i>=0; i--){
            for(int j = 0; j < i; j++) {
                if(foo[j] > foo[j+1]) {
                    int temp = foo[j];
                    foo[j] = foo[j+1];
                    foo[j+1] = temp;
                }
            }
        }
    }
}

