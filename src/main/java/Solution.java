import java.util.Arrays;

public class Solution {

    public int[] markBubbleSort(int[] input) {
        for(int i = 1; i < input.length; i++) {
            for(int j = 0; j < input.length - 1; j++) {
                if(input[j] > input[j+1]) {
                    swap(input, j, j+1);
                }
                System.out.printf("i = %s, j = %s%n", i,j);
                System.out.println(Arrays.toString(input));
            }
        }
        return input;
    }

    private void swap(int[] array, int j, int k) {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }
}