import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        solution.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    /*SelectionSort PseudoCode

    selectionSort(array)
        minPtr = 0;
        while(minPtr < array.length)
            for(i = minPtr to array.length - 1)
            if(array[minPtr] > array[i])
                minPtr = i
            swap(array,minPtr,i)
            minPtr++;
    * */
    public void selectionSort(int[] array) {
        int start = 0;
        while(start < array.length) {
            int smallestPtr = start;
            for(int i = start; i < array.length; i++) {
                if(array[smallestPtr] > array[i]){
                    smallestPtr = i;
                }
            }
            swap(array,start,smallestPtr);
            start++;
        }
    }
}
