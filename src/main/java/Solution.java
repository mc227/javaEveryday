import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();
        solution.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /*
    bubbleSortImprovement(array)
    n = length(array)
    for (i = 1 to n)
        for(j = 0 to n - i)
            if(array[j]>array[j+1])
                swap(array,j,j+1)
     * */


    public void sortImprovement(int[] numbers){
        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - i; j++) {
                if(numbers[j] > numbers[j+1]) {
                    swap(numbers, j, j+1);
                }
            }
        }
    }

    /*
    bubbleSort(array)
    n = length(array)
    for (i = 1 to n)
        for(j = 0 to n - 1)
            if(array[j]>array[j+1])
                swap(array,j,j+1)
     * */
    public void sort(int[] input) {
        int n = input.length;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - 1;j++) {
                if(input[j] > input[j+1]){
                    swap(input, j, j+1);
                }
            }
        }
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
