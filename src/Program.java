/*
Algo expert io Solution 1
* */

public class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum =  array[i];
            for(int j = i + i; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }
}

