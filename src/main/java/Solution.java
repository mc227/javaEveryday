import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();
        solution.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /*
    If we give a sorted list to our bubble sort algorithm,
    we will still make multiple passes on it without modifying it.
    We can further improve the algorithm by cutting short the outer
    loop when the list inside the array is fully sorted.
    We can check that the array is sorted by checking if any
    swaps were done during our last pass.
    In this manner, if we give our method an already sorted list,
    we just need to do one pass on the array and leave it untouched.
    This means that the best case is now O(n), although the worst case stays the same.

    * */
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
