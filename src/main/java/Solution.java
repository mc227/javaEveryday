
/*
Picking out numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter printWriter = new BufferedWriter(new FileWriter(fileName2))) {

            while (bufferedFileReader.ready()) {
                String[] splittedLine = bufferedFileReader.readLine().replaceAll("\\W"," ").split(" ");
                List<String> list = new ArrayList<>();
                for(int i = 0; i < splittedLine.length; i++) {
                    if (isInteger(splittedLine[i])){
                        list.add(splittedLine[i]);
                    }
                }
                for(int i = 0; i < list.size(); i++){
                    printWriter.write(list.get(i) + " ");
                }
            }
        }
        reader.close();
    }
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
