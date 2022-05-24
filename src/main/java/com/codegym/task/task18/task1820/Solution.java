package com.codegym.task.task18.task1820;

/*
Rounding numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Read 2 file names from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();
//        Create an input stream for the first file.
        File file = new File(string1);
        FileInputStream fileInputStream = new FileInputStream(string1);
        FileOutputStream fileOutputStream = new FileOutputStream(string2);
        BufferedInputStream in =  new BufferedInputStream(fileInputStream);
        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String strFileContents = "";
        while((bytesRead = in.read(contents)) != -1) {
            strFileContents += new String(contents, 0, bytesRead);
        }

        String str[] = strFileContents.split(" ");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        List<Float> alFloat = new ArrayList<Float>();
        for(String item: al) {
            alFloat.add(Float.parseFloat(item));
        }

        List<Integer> alInt = new ArrayList<>();
        for(float item: alFloat) {
            alInt.add(Math.round(item));
        }

        List<String> alIntString = new ArrayList<>();
        for(Integer item: alInt) {
            alIntString.add(Integer.toString(item));
        }
//        System.out.println(alIntString);
        String finalString = String.join(" ", alIntString);
//        System.out.println(finalString);
        fileOutputStream.write(finalString.getBytes());
        fileInputStream.close();
        fileOutputStream.close();



//        FileInputStream inputStream = new FileInputStream(string1);
//        Create an output stream for the second file.
//        FileOutputStream outputStream = new FileOutputStream(string2);
        // Read the numbers from the first file,
//        int total = inputStream.available();
//        byte[] bytes = new byte[total];
//        int read = inputStream.read(bytes);
//        System.out.println(Arrays.toString(bytes));
//        outputStream.write(bytes, 0,read);
        // round them, and write them to the second file, separated by spaces.
    }
}
