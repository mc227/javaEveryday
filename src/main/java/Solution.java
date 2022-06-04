//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        /*Sorting Bytes*/
////        Enter a file name from the console.
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
////                Read all the bytes from the file.
//        Map<Integer,Integer> map = new TreeMap<>();
//        while(fileInputStream.available() > 0) {
//            int data = fileInputStream.read();
//            if(!map.containsKey(data)) {
//                map.put(data,1);
//            }
//        }
//        for(Integer item: map.keySet()) {
//            System.out.print(item+" ");
//        }
////        Ignoring repetitions, sort them by byte-code in ascending order.
////                Display the result on the screen.
////                Close the IO stream.
////
////                Example of bytes in the input file:
////        44 83 44
////
////        Example output:
////        44 83
////
////        Requirements:
////•	The program should read a file name from the console.
////•	Use a FileInputStream to read from the file.
////•	The program should display all the unique bytes in the file in ascending order, separated by spaces.
////•	The screen output should be displayed in one line.
////•	The stream used to read the file must be closed.
//    }
//}
//
//
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Enter a file name from the console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
//        Read all the bytes from the file.
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        while(inputStream.available()>0){
            int temp = inputStream.read();
            list.add(temp);
        }

        inputStream.close();
//        System.out.println(list.toString());
        // Ignoring repetitions, sort them by byte-code in ascending order.
        ArrayList<Integer> newList = removeDuplicates(list);
//        System.out.println(newList.toString());
        Collections.sort(newList);
//        System.out.println(newList.toString());
        for(Integer item: newList) {
            System.out.print(item+" ");
        }


    }
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

}
