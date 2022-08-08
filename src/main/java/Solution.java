class Solution {
    public static int evalRPN(String[] tokens) {
        int arithmeticResult;
        int firstNum = Integer.parseInt(tokens[0]);
        int secondNum = Integer.parseInt(tokens[1]);

        if (tokens[2].trim().equals("+"))
            arithmeticResult = firstNum + secondNum;
        else if (tokens[2].trim().equals("-"))
            arithmeticResult = firstNum - secondNum;
        else if (tokens[2].trim().equals("*"))
            arithmeticResult = firstNum * secondNum;
        else {
            arithmeticResult = firstNum / secondNum;
        }

        int fourthNum = Integer.parseInt(tokens[3]);
        if (tokens[4].trim().equals("+"))
            arithmeticResult = arithmeticResult + fourthNum;
        else if (tokens[4].trim().equals("-"))
            arithmeticResult = arithmeticResult - fourthNum;
        else if (tokens[4].trim().equals("*"))
            arithmeticResult = arithmeticResult * fourthNum;
        else {
            arithmeticResult = arithmeticResult / fourthNum;
        }
        return arithmeticResult;
    }

    public static void main(String[] args) {
        String[] arr = new String[] { "2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }
}