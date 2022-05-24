package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/*
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add file name to list
        ArrayList<String> fileList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while(!(line = bufferedReader.readLine()).equals("end"))
            fileList.add(line);

        //create new file
        String newFileName = fileList.get(0).substring(0, fileList.get(0).lastIndexOf("."));
        //sort file order
        Collections.sort(fileList);
        /**/
        System.out.println(fileList);
        /**/

        //read each file content then write into new file
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName));
        for (String fName : fileList) {
            BufferedReader br = new BufferedReader(new FileReader(fName));
            while(br.ready())
                bw.write(br.read());

            br.close();
        }
        bw.close();

    }
}
