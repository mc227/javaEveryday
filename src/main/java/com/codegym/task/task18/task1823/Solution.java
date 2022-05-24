//package com.codegym.task.task18.task1823;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
///*
//Threads and bytes
//
//*/
//
//public class Solution {
//    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> arrayList = new ArrayList<>();
//        String line;
//        while (!(line = br.readLine()).equals("exit")) {
//            new ReadThread(line).start();
//        }
//        br.close();
//        /**/
//        System.out.println(resultMap);
//    }
//
//    public static class ReadThread extends Thread {
//        String file;
//        Map<Long, Integer> mark = new TreeMap<>();
//        public ReadThread(String fileName) throws FileNotFoundException {
//            // Implement constructor body
//            this.file = fileName;
//        }
//        // Implement file reading here
//
//        @Override
//        public void run() {
//            try {
//                FileInputStream inputStream = new FileInputStream(file);
//                ArrayList<Long> arrayList = new ArrayList<>();
//
//                while (inputStream.available() > 0) //as long as there are unread bytes
//                {
//                    long data = inputStream.read(); //Read the next byte
//                    arrayList.add(data);
//
//                    for (Long key : arrayList) {
//                        if(mark.containsKey(key)) {
//                            mark.put(key, mark.get(key) + 1);
//                        } else {
//                            mark.put(key, 1);
//                        }
//                    }
//                }
//                /**/
//            System.out.println(mark);
////            The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
//                Integer max = 1;
//                Long maxKey = 0L;
//                for (Map.Entry<Long, Integer> entry : mark.entrySet()){
//                    if(entry.getValue() > max) {
//                        max = entry.getValue();
//                        maxKey = entry.getKey();
//                    }
//                }
////            System.out.println(maxKey);
//
////            where the String parameter is the file name and the Integer parameter is the relevant byte.
////                    Close the streams.
//                resultMap.put(file, Math.toIntExact(maxKey));
//                inputStream.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String pathName;

        while(true){
            pathName = reader.readLine();
            if(pathName.equals("exit")){
                break;
            }

            ReadThread rt = new ReadThread(pathName);
            rt.start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fn;
        public ReadThread(String fileName) throws IOException {
            // Implement constructor body
            this.fn = fileName;
        }
        // Implement file reading here
        public void run(){
            ArrayList<Object> list = new ArrayList<>();
//            HashMap<String,Integer> resultMap = new HashMap<>();

            try {
                FileInputStream fis = new FileInputStream(fn);
                while (fis.available() > 0) {
                    int x = fis.read();
                    list.add(x);
                }

                int highesFreq  = 0;
                Integer mapValue = 0;

                for(Object o : list){
                    int frequency = Collections.frequency(list, o);
                    if (frequency > highesFreq){
                        highesFreq = frequency;
                        mapValue = (Integer) o;
                    }
                }

                resultMap.put(fn, mapValue);
                fis.close();

            }catch(IOException e){}
        }
    }
}
