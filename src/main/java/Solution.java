import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
/*
The first parameter of the main method is a file name.
Count the letters of the English alphabet in the file.
Display the number of letters.
Close the streams.

Requirements:
•	You don't need to read anything from the console.
•	Create a stream to read from the file passed as the first argument of the main method.
•	You need to count the letters of the English alphabet in the file and display the number.
•	You must count both uppercase and lowercase letters.
•	The stream used to read the file must be closed.
* */
    public static void main(String[] args) throws IOException {
        /*The first parameter of the main method is a file name.*/
        //System.out.println(args[0]);
        /*Count the letters of the English alphabet in the file.*/
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;

        while(fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            arrayList.add(data);
        }
//        System.out.println(arrayList);
        for(Integer item: arrayList) {
            if((item >=65 && item <=90)||(item >=97 && item <=122)) {
                count++;
            }
        }
        /*Display the number of letters.*/
        System.out.println(count);
        fileInputStream.close();
    }
}
