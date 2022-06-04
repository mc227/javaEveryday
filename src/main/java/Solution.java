
/*
Bubble Sort

*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] foo = new int[]{10,9,8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.toString(foo)); // nice
        bubbleSort(foo);
        System.out.println(Arrays.toString(foo));
    }

    private static void bubbleSort(int[] foo) {
        for(int i = foo.length-1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if(foo[j] > foo[j+1]){
                    int temp = foo[j];
                    foo[j] = foo[j+1];
                    foo[j+1] = temp;
                }
            }
        }
    }

}
