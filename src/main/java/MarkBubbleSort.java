import java.util.Arrays;

public class MarkBubbleSort {
    public void sort(int[] numbers){
        for(int i = 1; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length-1; j++) {
                System.out.printf("j = %s, j+1 = %s%n", j, j+1);
                System.out.printf("numbers[j] = %s, numbers[j+1] = %s%n", numbers[j], numbers[j+1]);
                System.out.println("***********");
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] mark = {2,4,3,7,1,6};
        MarkBubbleSort markBubbleSort = new MarkBubbleSort();
        markBubbleSort.sort(mark);
        System.out.println(Arrays.toString(mark));
    }
}
