import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*Rarest bytes*/
        //        Enter a file name from the console.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
//                Find the byte or bytes with the minimum number of repetitions.
        Map<Integer,Integer> map = new TreeMap<>();
        while(fileInputStream.available()>0) {
            int data = fileInputStream.read();
            if(map.containsKey(data)){
                map.put(data, map.get(data)+1);
            } else {
                map.put(data,1);
            }
        }
//        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue() == 1){
                System.out.print(entry.getKey()+" ");
            }
        }
//                Display them on the screen, separated by spaces.
//        Close the IO stream.
//
//        Requirements:
//•	The program should read a file name from the console.
//•	Use a FileInputStream to read from the file.
//•	All of the least frequently repeated bytes from the file should be displayed, separated by spaces.
//•	The screen output should be displayed in one line.
//•	The stream used to read the file must be closed.
    }
}


//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;

/*
Rarest bytes

*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        //Create a FileInputStream object bound to «c:/data.txt».
////        String string = bufferedReader.readLine();
////        FileInputStream inputStream = new FileInputStream(string);
////        // store each byte in an arraylist
////
////        Map<Long, Integer> map = new HashMap<>();
////
////        while (inputStream.available() > 0) //as long as there are unread bytes
////        {
////            long data = inputStream.read(); //Read the next byte
////
////            if(map.containsKey(data)){
////                map.put(data, map.get(data)+1);
////            } else {
////                map.put(data,1);
////            }
////
////        }
////        inputStream.close(); // Close the stream
////        // iterating through key/value mappings
//////        System.out.print("Entries: ");
//////        for(Map.Entry<Long, Integer> entry: map.entrySet()) {
//////            System.out.print(entry);
//////            System.out.print(", ");
//////        }
////        ArrayList<Integer> arrayList = new ArrayList<>();
////        String space = "";
////        for(Map.Entry<Long, Integer> entry: map.entrySet()) {
////            if(entry.getValue().equals(1)){
////                System.out.print(space+entry.getKey());
////                space =" ";
////            }
////        }
////        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
////        FileInputStream fis = new FileInputStream( br.readLine() );
////        br.close();
////        HashMap<Integer, Integer> map = new HashMap<>();
////
////
////        while ( fis.available() > 0 ) {
////            int input = fis.read();
////
////            if ( !map.containsKey( input ) ) {
////                map.put(input, 1);
////            }
////
////            else {
////                map.replace( input, map.get(input) + 1 );
////            }
////        }
////
////        fis.close();
////        int min = map.entrySet().iterator().next().getValue();
////        System.out.println(min);
////        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
////            if (pair.getValue() < min){
////                min = pair.getKey();
////            }
////        }
////        System.out.println(map.toString());
////        for ( Map.Entry<Integer, Integer> pair : map.entrySet() ) {
////            if ( pair.getValue() <= min ) {
////                System.out.print( pair.getKey() + " " );
////            }
////        }
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s= reader.readLine();
//        FileInputStream inputStream = new FileInputStream(s);
//        ArrayList<Integer> list = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        while(inputStream.available()>0){
//            int temp = inputStream.read();
//            list.add(temp);
//        }
//        //
////        System.out.println(list.toString());
//        inputStream.close();
//        int count=0;
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<list.size();i++){
//            for(int j=0;j<list.size();j++){
//                if(list.get(i)==list.get(j)){
//                    count++;
//                }
//            }
//            map.put(list.get(i),count);
//            if (count < min) {
//                min = count;
//            }
//            count=0;
//        }
////        System.out.println(map.toString());
//        int max = 0;
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//            if (entry.getValue() == min) {
//                System.out.print(entry.getKey() + "\t");
//            }
//        }
//    }
//}
