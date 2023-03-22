package HFJ3e.Chapter16;

import java.io.*;

public class Scratch {
    public static void main(String[] args) throws IOException {
        File myFile = new File("grades.txt");
        FileReader fileReader = new FileReader(myFile);

        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
}
