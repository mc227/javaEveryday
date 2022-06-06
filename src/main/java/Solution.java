
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
        int[] foo = new int[]{3,2,1};
        System.out.println(Arrays.toString(foo));
    }
}

