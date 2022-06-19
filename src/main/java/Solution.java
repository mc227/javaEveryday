import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Solution {
/*
Spaces

The first parameter of the main method is a file name.
Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count all the characters (n1).
2. Count the spaces (n2).
3. Display n2/n1*100, rounding to 2 decimal places.
4. Close the streams.

Requirements:
•	You don't need to read anything from the console.
•	Create a stream to read from the file passed as the first argument of the main method.
•	Calculate and display the ratio of the spaces to all characters in the file.
•	The displayed value must be rounded to 2 decimal places.
•	The stream used to read the file must be closed.
* */
    public static void main(String[] args) throws IOException {
        /*The first parameter of the main method is a file name.*/
        //System.out.println(args[0]);
        /*Display the ratio of the number of spaces to the number of all characters. For example, 10.45.*/
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int characters = 0;
        int spaces = 0;

        while(fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            arrayList.add(data);
        }
//        System.out.println(arrayList);
        for(Integer item: arrayList) {
            if((item >=65 && item <=90)||(item >=97 && item <=122)) {
                characters++;
            }
            if(item.equals(32)) {
                spaces++;
            }
        }

//        System.out.println(characters);
        System.out.printf("%.2f",((float) spaces/characters)*100);
        fileInputStream.close();
    }

    /*compared below to above. below was the one i did a few weeks ago*/
//    private static final DecimalFormat df = new DecimalFormat("0.00");
//    public static void main(String[] args) throws IOException {
//
////        The first parameter of the main method is a file name.
//        // 1. Count all the characters (n1).
//
//        FileInputStream inputStream = new FileInputStream(args[0]);
//        ArrayList<Integer> list = new ArrayList<>();
//        while(inputStream.available()>0){
//            int temp = inputStream.read();
//            list.add(temp);
//        }
//        int n1=0;
//
//        for(int i = 0; i < list.size(); i++) {
//            if(list.get(i) > 32 && list.get(i) < 127) {
//                n1++;
//            }
//        }
////        2. Count the spaces (n2).
//        int n2 = 0;
//        for(int i = 0; i < list.size(); i++) {
//            if(list.get(i) == 32) {
//                n2++;
//            }
//        }
////        System.out.println(n1);
////        System.out.println(n2);
//        float value = (float) n2/(n1)*100;
//        System.out.println(df.format(value));
//        inputStream.close();
//    }
}
