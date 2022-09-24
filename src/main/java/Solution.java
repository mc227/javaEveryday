

public class Solution {
    public static void main(String[] args) {

    }
    public int[] markBubbleSort(int[] input) {
        for(int i = 1; i < input.length; i++) {
            for(int j = 0; j < input.length - 1; j++) {
                if(input[j] > input[j+1]) {
                    swap(input, j, j+1);
                }
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
