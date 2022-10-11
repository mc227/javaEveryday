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
        start = 0;
        while(start < array.length)
            smallestPtr = start;
            for(i = start to array.length)
                if(array[smallestPtr] > array[i])
                    smallestPtr = i
            swap(array,smallestPtr,i)
            start++;
    * */
    public void selectionSort(int[] array) {
        for(int m = 0; m < array.length;m++){
            int smallestPtr = m;
            for(int i = m; i < array.length; i++) {
                if(array[smallestPtr] > array[i]){
                    smallestPtr = i;
                }
            }
            swap(array,m,smallestPtr);
        }
    }
}
