/*
Introducing tags

*/


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();
            FileReader fileReader = new FileReader(fileName);
            String html = "";
            while (fileReader.ready()){
                int data = fileReader.read(); //Read one character (the char will be widened to an int)
                html += (char) data;
            }
            fileReader.close();
            Document document = Jsoup.parse(html);
            document.body().select(args[0]).forEach(System.out::println);

        }

    }
}
