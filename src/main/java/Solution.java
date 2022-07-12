/*
Threads and bytes
Read file names from the console until
the word "exit" is entered. Pass the file
name to the ReadThread thread. The ReadThread
thread should find the byte that occurs
most frequently in the file, and add
it to resultMap, where the String parameter
is the file name and the Integer parameter is the resultMap
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String,Integer> resultMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while(!(filename = reader.readLine()).equals("exit")){
            new ReadThread(filename).start();
        }
    }

    private static class ReadThread extends Thread{
        public String filename;
        public ReadThread(String filename) {
            this.filename = filename;
        }

        @Override
        public void run() {
            byte[] bytesCount = new byte[256];
            try(FileInputStream fileInputStream = new FileInputStream(filename)){
                while(fileInputStream.available() > 0) {
                    bytesCount[fileInputStream.read()]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for(int i = 0; i < bytesCount.length; i++) {
                if(bytesCount[i] > maxCount) {
                    maxCount = bytesCount[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(filename,maxCountByte);
            System.out.println(resultMap);
        }
    }
}
