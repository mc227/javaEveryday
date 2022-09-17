
/*
Introducing tags

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            if (args.length == 1) {
                FileReader fileReader = new FileReader(consoleReader.readLine());
                consoleReader.close();

                StringBuilder tag = new StringBuilder();
                String openigTag = '<' + args[0] ;
                String closingTag = "</" + args[0] + ">";

                int count = 0;
                while (fileReader.ready()) {
                    int c = fileReader.read();
                    if ((c == '\n' || c == '\r') && tag.length() > 0 && tag.charAt(tag.length() - 1) != '>') {
                        continue;
                    }

                    tag.append((char)c);

                    if (c == '>') {
                        if (!tag.toString().contains(openigTag)) {
                            tag.delete(0, tag.length());
                            continue;
                        }

                        count = tagCount(tag.toString(), openigTag) - tagCount(tag.toString(), closingTag);

                        if (tag.toString().contains(closingTag) && count == 0) {
                            System.out.println(tag.toString().substring(tag.indexOf(openigTag)));
                            tag.delete(0, tag.length());
                        }
                    }
                }

                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int tagCount(String str, String tag) {
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(tag, lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += tag.length();
            }
        }

        return count;
    }
}
