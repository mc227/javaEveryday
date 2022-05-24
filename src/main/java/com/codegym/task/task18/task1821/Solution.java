package com.codegym.task.task18.task1821;

/*
Symbol frequency

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.out.println(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        File file = new File(args[0]);
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream in =  new BufferedInputStream(fileInputStream);
        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String strFileContents = "";
        while((bytesRead = in.read(contents)) != -1) {
            strFileContents += new String(contents, 0, bytesRead);
        }
//        System.out.println(strFileContents);
        fileInputStream.close();
        byte[] bytes = strFileContents.getBytes("US-ASCII");
//        System.out.println(Arrays.toString(bytes));
//        System.out.println((char) bytes[0]);
        Map<Byte,Integer>mark = new TreeMap<Byte, Integer>();
        for (byte key : bytes) {
            if(mark.containsKey(key)) {
                mark.put(key, mark.get(key) + 1);
            } else {
                mark.put(key, 1);
            }
        }

        for (Byte keys : mark.keySet()) {
//            System.out.println(keys + " Found " + mark.get(keys) + " Times");
            System.out.println((char) keys.byteValue() + " " + mark.get(keys));
        }

    }
}
