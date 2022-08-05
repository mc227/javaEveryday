//package com.codegym.task.task19.task1911;

/*
Reader wrapper

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //Save the current PrintStream in a special variable
        PrintStream consoleStream = System.out;

        //Create a dynamic array
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //Create an adapter for the PrintStream class
        PrintStream stream = new PrintStream(outputStream);
        //Set it as the current System.out
        System.setOut(stream);

        //Call a function that knows nothing about our changes
        testString.printSomething();

        //Convert the data written to our ByteArray into a string
        String result = outputStream.toString();

        //Put everything back to the way it was
        System.setOut(consoleStream);

        //all caps the string
        StringBuilder stringBuilder = new StringBuilder(result);
        toUpperCase(stringBuilder);
        String reverseString = stringBuilder.toString();

        //Output it to the console
        System.out.println(reverseString);
    }

    public static void toUpperCase(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLowerCase(builder.charAt(i))) {
                builder.setCharAt(i,
                        Character.toUpperCase(builder.charAt(i)));
            }
        }
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
