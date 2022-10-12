import com.packt.datastructuresandalg.lesson1.binarysearch.BinarySearch;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
//        System.out.println(Arrays.toString(numbers));
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(binarySearch.binarySearch(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

    }
    public boolean binarySearch(int[] array, int start,int end, int value) {
        /*
        binarySearch(array, start, end, value){
            middle = (end - start) / 2 + start
            if(start<end)
                if(array[value]==middle) return true
                if(array[value] > middle) return binarySearch(array, value, middle+1,end)
                return binarySearch(array,value,start, middle-1)
        }
        * */
        return true;
    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
