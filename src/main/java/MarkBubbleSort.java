

public class MarkBubbleSort {
    /*
        bubbleSort(array)
            n = length(array)
            for (k = 1 until n)
                for (j = 0 until -1)
                    if(array[j] > array[j + 1])
                        swap(array, j, j + 1)
    * */
    public int[] bubbleSort(int[] input) {
        int n = input.length;
        for(int k = 1; k < n; k++){
            for (int j = 0; j < n-1;j++){
                if (input[k] < input[j]){
                    swap(input, k, j);
                }
            }
        }
        return input;
        // [12,24,66,75,22,87]
    }

    private void swap(int[] array, int l, int m) {
        int temp = array[l];
        array[l] = array[m];
        array[m] = temp;

    }

//    public static void main(String[] args) {
//        int[] arrayOfSomeRandomPerson = new int[] {66, 24, 75, 22, 12, 87};
//        MarkBubbleSort markBubbleSort = new MarkBubbleSort();
//        System.out.println(Arrays.toString(markBubbleSort.bubbleSort(arrayOfSomeRandomPerson)));
//    }
}
