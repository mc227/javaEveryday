//package com.codegym.task.task19.task1910;

/*
Punctuation

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                fileContent.add(inputFileReader.readLine());
            }
        }
        try (BufferedWriter outputFileWriter=new BufferedWriter(new FileWriter(outputFileName))){
            for (String line : fileContent) {
//                System.out.println(line);
                try{
                    line = line.replaceAll("[^a-zA-Z0-9 ]", "");
//                    line = line.replaceAll("\n","");
                    outputFileWriter.write(line);
                }catch (Exception ignore) {

                }
            }
        }


    }
}
