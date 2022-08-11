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
            if(array_list.get(j).equals("/")||array_list.get(j).equals("+")||array_list.get(j).equals("-")||
                    array_list.get(j).equals("*")) {
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

//        String[] arr = new String[] {"2","1","+","3","*"};
//        String[] arr = new String[] { "4", "13", "5", "/", "+" };
        // System.out.println(evalRPN(arr));
        String[] arr = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int result = 0;
        ArrayList<String> arrayList = turnToArrayList(arr);
        int locationOfFirstOperator = locateOperatorIndex(arrayList);
        int first = Integer.parseInt(arrayList.get(locationOfFirstOperator-2));
        int second = Integer.parseInt(arrayList.get(locationOfFirstOperator-1));
        String operator = arrayList.get(locationOfFirstOperator);
        result = operate(first,second,operator);
        System.out.println(arrayList);
        arrayList.set(locationOfFirstOperator, String.valueOf(result));
        System.out.println(arrayList);
        arrayList.remove(locationOfFirstOperator-1);
        System.out.println(arrayList);
        arrayList.remove(locationOfFirstOperator-2);
        System.out.println(arrayList);

        int locationOfFirstOperator1 = locateOperatorIndex(arrayList);
        int first1 = Integer.parseInt(arrayList.get(locationOfFirstOperator1-2));
        int second1 = Integer.parseInt(arrayList.get(locationOfFirstOperator1-1));
        String operator1 = arrayList.get(locationOfFirstOperator1);
        result = operate(first1,second1,operator1);
        arrayList.set(locationOfFirstOperator, String.valueOf(result));
        arrayList.remove(locationOfFirstOperator1-1);
        arrayList.remove(locationOfFirstOperator1-2);

        int locationOfFirstOperator2 = locateOperatorIndex(arrayList);
        int first2 = Integer.parseInt(arrayList.get(locationOfFirstOperator2-2));
        int second2 = Integer.parseInt(arrayList.get(locationOfFirstOperator2-1));
        String operator2 = arrayList.get(locationOfFirstOperator2);
        result = operate(first2,second2,operator2);
        arrayList.set(locationOfFirstOperator2, String.valueOf(result));
        arrayList.remove(locationOfFirstOperator2-1);
        arrayList.remove(locationOfFirstOperator2-2);
        System.out.println(arrayList);

        int locationOfFirstOperator3 = locateOperatorIndex(arrayList);
        int first3 = Integer.parseInt(arrayList.get(locationOfFirstOperator3-2));
        int second3 = Integer.parseInt(arrayList.get(locationOfFirstOperator3-1));
        String operator3 = arrayList.get(locationOfFirstOperator3);
        result = operate(first3,second3,operator3);
        arrayList.set(locationOfFirstOperator3, String.valueOf(result));
        arrayList.remove(locationOfFirstOperator3-1);
        arrayList.remove(locationOfFirstOperator3-2);
        System.out.println(arrayList);

        int locationOfFirstOperator4 = locateOperatorIndex(arrayList);
        int first4 = Integer.parseInt(arrayList.get(locationOfFirstOperator4-2));
        int second4 = Integer.parseInt(arrayList.get(locationOfFirstOperator4-1));
        String operator4 = arrayList.get(locationOfFirstOperator4);
        result = operate(first4,second4,operator4);
        arrayList.set(locationOfFirstOperator4, String.valueOf(result));
        arrayList.remove(locationOfFirstOperator4-1);
        arrayList.remove(locationOfFirstOperator4-2);
        System.out.println(arrayList);

    }
}