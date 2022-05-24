package com.codegym.task.task18.task1822;

/*
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //The program should read a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        // Create an input stream for the file.
        FileInputStream fileInputStream = new FileInputStream(string1);
//        3. The program should search the file and display
//        information related to the specified id passed as the first argument.

        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String strFileContents = "";
        while((bytesRead = fileInputStream.read(contents)) != -1) {
            strFileContents += new String(contents, 0, bytesRead);
        }
        String[] foo = strFileContents.split(System.lineSeparator());
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(foo));
        for(String item:list){

            if(item.split(" ")[0].equals(args[0])){
                System.out.println(item);
            }
        }
//        4. The stream used to read the file must be closed
        fileInputStream.close();
    }
}
