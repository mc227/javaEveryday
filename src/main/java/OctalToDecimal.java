public class OctalToDecimal {
    public int convertToDecimal(String oct) {
        int result = 0;
        for (int i = 1; i <= oct.length(); i++) {
            int octDigit = Integer.parseInt(oct.charAt(oct.length() - i) + "");
            result += Math.pow(8, i - 1) * octDigit;
        }
        return result;
    }

    public static void main(String args[]) {
        OctalToDecimal octalToDecimal = new OctalToDecimal();
        System.out.println(octalToDecimal.convertToDecimal("17"));
        System.out.println(octalToDecimal.convertToDecimal("72625"));
        System.out.println(octalToDecimal.convertToDecimal("1"));
        System.out.println(octalToDecimal.convertToDecimal("55142"));
    }
}


// my solution below
/*
public class OctalToDecimal {
    public static int convertToDecimal(String octal) {
        int result = 0;
        int conversion = 1;
        for(int i = octal.length()-1; i >= 0; i--) {
            result += (Integer.parseInt(String.valueOf(octal.charAt(i))) * conversion);
            conversion *=8;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToDecimal("5"));
    }
}
*/

//package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal.solution;
