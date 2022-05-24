package com.codegym.task.task18.task1824;

/*
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String pathName;

        while(true){
            pathName = reader.readLine();
//            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(pathName);
                int total1 = fileInputStream.available();
                byte[] bytes1 = new byte[total1];
                int read1 = fileInputStream.read(bytes1);
//                System.out.println(read1);
                fileInputStream.close();
            } catch (FileNotFoundException fileNotFoundException){
                System.out.println(pathName);
                break;
            }
        }
    }
}
