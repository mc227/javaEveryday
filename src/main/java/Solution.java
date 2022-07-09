

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Threads and bytes
Read file names from the console until the word "exit" is entered.
Pass the file name to the ReadThread thread.
The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
where the String parameter is the file name and the Integer parameter is the relevant byte.
Close the streams.

Requirements:

*/

public class Solution {
    public static Map<String,Integer> resultMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filename;
        // Read file names from the console until the word "exit" is entered.
        while(!(filename = bufferedReader.readLine()).equals("exit")){
            // Pass the file name to the ReadThread thread.
            new ReadThread(filename).start();
        }
    }

    private static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String filename) {
            this.filename = filename;
        }
        //The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
        //where the String parameter is the file name and the Integer parameter is the relevant byte.
        @Override
        public void run() {
            byte[] bytesCount = new byte[256];
            try(FileInputStream fileInputStream = new FileInputStream(filename)){
                while(fileInputStream.available() > 0) {
                    bytesCount[fileInputStream.read()]++;
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for(int i = 0; i < bytesCount.length; i++) {
                if(bytesCount[i] > maxCount){
                    maxCount = bytesCount[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(filename, maxCountByte);
            System.out.println(resultMap);
        }
    }
}
