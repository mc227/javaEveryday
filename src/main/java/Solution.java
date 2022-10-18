import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[] {3,2,1};
        solution.mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private void mergeSort(int[] array) {
        mergeSort(array,0,array.length-1);
    }

    // pseudo code
    /*
    mergeSort(array, start, end)
        if(start < end)
            middle = (end - start)/2 + start
            mergeSort(array, start, middle)
            mergeSort(array, middle+1, end)
            merge(array, start, middle, end)
    * */
    private void mergeSort(int[] array, int start, int end) {
        if(start < end){
            int middle = (end - start) / 2 + start;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1,end);
            merge(array, start,middle,end);
        }
    }

    /* pseudocode
    merge(array, start, middle, end)
        i = start
        j = middle + 1
        arrayTemp = initArrayOfSize(end - start + 1)
        for(k = 0 until end - start)
            if(i <= middle && (j > end || array[i] <= array[j])
                arrayTemp[k] = array[i]
                i++
            else
                arrayTemp[k] = array[j]
                j++
        copyArray(arrayTemp,0,array,start,array.length)
    * */
    private void merge(int[] array, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for(int k = 0; k < arrayTemp.length; k++) {
            if(i <= middle && (j > end || array[i] <= array[j])){
                arrayTemp[k] = array[i];
                i++;
            } else {
                arrayTemp[k] = array[j];
                j++;
            }
        }
        System.arraycopy(arrayTemp,0,array,start,arrayTemp.length);
    }


}
