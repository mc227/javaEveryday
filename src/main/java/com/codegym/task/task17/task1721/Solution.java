package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader;
        BufferedReader reader2;

        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        try {
            while (i<2)
            {
                arrayList.add(br.readLine());
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader = new BufferedReader(new FileReader(
                    arrayList.get(0)));
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                allLines.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
//            System.out.println(allLines.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            reader2 = new BufferedReader(new FileReader(
//                    arrayList.get(1)));
//            String line = reader2.readLine();
//            while (line != null) {
////                System.out.println(line);
//                linesForRemoval.add(line);
//                // read next line
//                line = reader2.readLine();
//            }
//            reader2.close();
////            System.out.println(allLines.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            reader = new BufferedReader(new FileReader(
                    arrayList.get(1)));
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                linesForRemoval.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
//            System.out.println(allLines.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {
        //
        if (allLines.containsAll(linesForRemoval)) {
            for(String item:linesForRemoval){
                allLines.remove(item);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
