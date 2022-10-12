

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
//        System.out.println(Arrays.toString(numbers));


        System.out.println(solution.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution.binarySearch(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

    }
    public boolean binarySearch(int value, int[] array,int start,int end) {
        /*
        binarySearch(value,array, start, end){
            if(start<=end)
                middle = (end - start) / 2 + start
                if(array[value]==middle) return true
                if(array[value] > middle) return binarySearch(array, value, middle+1,end)
                return binarySearch(array,value,start, middle-1)
            return false
        }
        * */

        if(start <= end) {
            int middle = (end - start) / 2 + start;
            if(array[middle] == value) return true;
            if(array[middle] > value) return binarySearch(value,array,start, middle-1);
            return binarySearch(value, array, middle+1,end);
        }
        return false;
    }

    public boolean binarySearch(int value, int[] array){
        return binarySearch(value,array,0,array.length-1);
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
