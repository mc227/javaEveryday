import java.util.*;
import java.util.function.BiFunction;
// 2 1 + 3 *
// 4 13 5 / +
// 10 6 9 3 + -11 * / * 17 + 5 +
public class Solution {
    public static Map<String, BiFunction<Integer, Integer,Integer>> OPERATORS = new HashMap<>();
    static {
        OPERATORS.put("+",(x1,x2) -> x1+x2);
        OPERATORS.put("-",(x1,x2) -> x1-x2);
        OPERATORS.put("*",(x1,x2) -> x1*x2);
        OPERATORS.put("/",(x1,x2) -> x1/x2);
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < args.length; i++) {
            if(!OPERATORS.containsKey(args[i])){
                stack.push(args[i]);
            } else {
                int number_2 = Integer.parseInt(stack.pop());
                int number_1 = Integer.parseInt(stack.pop());
                BiFunction<Integer,Integer,Integer> operand = OPERATORS.get(args[i]);
                int result = operand.apply(number_1,number_2);
                stack.push(String.valueOf(result));
            }
        }
        System.out.println(stack.pop());
    }
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < tokens.length; i++) {
            if(!OPERATORS.containsKey(tokens[i])){
                stack.push(tokens[i]);
            } else {
                int number_2 = Integer.parseInt(stack.pop());
                int number_1 = Integer.parseInt(stack.pop());
                BiFunction<Integer,Integer,Integer> operand = OPERATORS.get(tokens[i]);
                int result = operand.apply(number_1,number_2);
                stack.push(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}