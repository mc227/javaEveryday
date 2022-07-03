//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
////    Read file names from the console until the word "exit" is entered.
////Pass the file name to the ReadThread thread.
////The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
////where the String parameter is the file name and the Integer parameter is the relevant byte.
////Close the streams.
////
////Requirements:
////•	The program must read file names from the console until the word "exit" is entered.
////•	For each file, create and start a ReadThread thread.
////•	After each thread is start, ReadThread should create its own file input stream.
////•	Then each thread must find the most frequently occurring byte in its file and add it to resultMap.
////•	The file input stream in each thread must be closed.
//    public static Map<String,Integer> resultMap = new HashMap<>();
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        while(!(str = bufferedReader.readLine()).equals("exit")){
//            new ReadThread(str).start();
//        }
//    }
//
//
//    private static class ReadThread extends Thread{
//        private String filename;
//
//        public ReadThread(String filename) {
//            this.filename = filename;
//        }
//
//        @Override
//        public void run() {
//            byte[] aByte = new byte[256];
//            try(FileInputStream fileInputStream = new FileInputStream(filename)){
//                while(fileInputStream.available()>0){
//                    aByte[fileInputStream.read()]++;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            int maxCount = 0;
//            int maxCountByte = 0;
//            for(int i = 0; i < aByte.length; i++) {
//                if(aByte[i] > maxCount) {
//                    maxCount = aByte[i];
//                    maxCountByte = i;
//                }
//            }
//            resultMap.put(filename,maxCountByte);
//            System.out.println(resultMap);
//        }
//
//    }
//}
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Finding data inside a file
Read a file name from the console.
Search the file for information
related to the specified id.
Display it in the format used in the file.
The program is started with one argument:
id (an int). Close the streams.
The file data is separated
by spaces and stored in the following order: id productName
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        try(BufferedReader bufferedFileReader = new BufferedReader(new FileReader(filename))){
            while(bufferedFileReader.ready()){
                String str;
                while((str = bufferedFileReader.readLine())!=null){
                    if(str.startsWith(args[1] + " ")){
                        System.out.println(str);
                        break;
                    }
                }
            }
        }
    }
}
