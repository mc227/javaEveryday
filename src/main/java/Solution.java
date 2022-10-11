import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        solution.sortImprovement(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    // pseudo code for bubble sort
    // bubbleSort(array)
    //  n = length(array)
    //  for(i = 1 to n )
    //      for(j = 0 to n - 1)
    //          if(array[j] > array[j+1])
    //              swap(array, j, j+1)
    public void sort(int[] numbers){
        for(int i = 1; i < numbers.length; i++) {
            for(int  j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j+1]){
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public void sortImprovement(int[] numbers){
        for(int i = 1; i < numbers.length; i++) {
            for(int  j = 0; j < numbers.length - i; j++){
                if(numbers[j] > numbers[j+1]){
                    swap(numbers,j,j+1);
                }
            }
        }
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
