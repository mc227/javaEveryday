//package com.codegym.task.task19.task1914;

/*
Problem solving

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String[] result = byteArrayOutputStream.toString().split(" ");
        for(int i = 0; i < result.length; i++) {
            result[i] = result[i].trim();
        }
        List<String> list = new ArrayList<String>(Arrays.asList(result));
        list.remove("");
        list.remove("=");
        System.out.println(String.format("%s %s %s = %s", list.get(0),list.get(1), list.get(2),
                operate(list.get(0),list.get(1), list.get(2))));
    }

    public static String operate(String first, String operand, String second){
        if(operand.equals("+")){
            int sum = Integer.parseInt(first)+Integer.parseInt(second);
            if (sum >= 0) return String.valueOf(sum);
        } else if (operand.equals("-")) {
            int diff = Integer.parseInt(first) - Integer.parseInt(second);
            if (diff >=0) return String.valueOf(diff);
        } else if (operand.equals("*")){
            int product = Integer.parseInt(first) * Integer.parseInt(second);
            if (product >=0) return String.valueOf(product);
        } else {

        }
        return null;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

