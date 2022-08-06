//package com.codegym.task.task19.task1915;

/*
Duplicate text

*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
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
        fileOutputStream.write(outputStream.toByteArray());
        //Put everything back to the way it was
        System.setOut(consoleStream);

        //Reverse the string
        StringBuilder stringBuilder = new StringBuilder(result);
//        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();

        //Output it to the console
        System.out.println(reverseString);
        reader.close();
        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}

