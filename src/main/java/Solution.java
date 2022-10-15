import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{7,15,14,5,9,18,3,21,23,16,12};

        System.out.println(Arrays.toString(numbers));
    }

    /*
    mergeSort(array, start,end)
        if(start<end)
            middle = (end - start)/2 + start
            mergeSort(array, start, middle)
            mergeSort(array, middle+1, end)
            merge(array, start, middle, end)

    merge(array, start,middle,end)
        i = start
        j = middle + 1
        arrayTemp = initializeArrayofSize(end-start+1)
        for(k = 0 to end - start)
            if(i <= middle && (j < end || array[i] <= array[j])
                arrayTemp[k] = array[i]
                i++
            else
                arrayTemp[k] = array[j]
                j++
        copyArray(arrayTemp,array,array.length)
    * */
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
