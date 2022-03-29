import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] myIntArray = {3, 5, 9};
        System.out.println(Arrays.toString(twoNumberSum(new int[] {3, 5, -4, 8, 4, 1, -1, 6},11)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + i; j < array.length; j++) {
                int secondNum = array[j];
                if(firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }
}
