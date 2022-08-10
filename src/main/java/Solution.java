import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int evalRPN(String[] tokens) {
        ArrayList<String> array_list = turnToArrayList(tokens);
        List<String> arraylist = new ArrayList<>();
        //here
        do {
            arraylist = solve(array_list);
        } while(array_list.size() > 1);
        return Integer.parseInt(arraylist.get(0));
    }
    public static int operate(int first, int second, String operator){
        int answer;
        if (operator.trim().equals("+"))
            answer = first + second;
        else if (operator.trim().equals("-"))
            answer = first - second;
        else if (operator.trim().equals("*"))
            answer = first * second;
        else
            answer = first / second;
        return answer;
    }
    public static ArrayList<String> turnToArrayList(String[] args) {
        ArrayList<String> array_list = new ArrayList<String>();
        for (int i = 0; i < args.length; i++)
            array_list.add(args[i]);
        return array_list;
    }

    public static int locateOperatorIndex(ArrayList<String> array_list){
        int locOfOperand = 0;
        for (int j = 0; j < array_list.size(); j++){
            if(array_list.get(j).contains("/")||array_list.get(j).contains("+")||array_list.get(j).contains("-")||
                    array_list.get(j).contains("*")) {
                locOfOperand = j;
                break;
            }
        }
        return locOfOperand;
    }
    public static List<String> solve(ArrayList<String> array_list){
        // locate operator index
        int locOfOperand = locateOperatorIndex(array_list);
        int result = 0;
        int first = Integer.parseInt(array_list.get(locOfOperand-2));
        int second = Integer.parseInt(array_list.get(locOfOperand-1));
        String operator = array_list.get(locOfOperand);
        result = operate(first,second, operator);
        array_list.set(locOfOperand, String.valueOf(result));
        array_list.remove(locOfOperand-1);
        array_list.remove(locOfOperand-2);
        return array_list;
    }

    public static void main(String[] args) {

        String[] arr = new String[] {"2","1","+","3","*"};
//        String[] arr = new String[] { "4", "13", "5", "/", "+" };
//        String[] arr = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(arr));
    }
}