//package com.codegym.task.task17.task1706;

/*
Synchronized president

*/

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }
}
