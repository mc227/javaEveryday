import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
reviewing com.codegym.task.task18.task1821;
Symbol frequency
The program is started with one argument: the name of a file that contains text.
Calculate how often each symbol is encountered.
Sort the results by increasing ASCII code (read about it online).

Example:
','=44, 's'=115, 't'=116.

Display the sorted results:
[symbol1] frequency1
[symbol2] frequency2
Close the streams.

Example output:
, 19
- 7
f 361


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. You need to calculate the frequency of each symbol in the file and display the results.
4. The displayed results should be sorted by ascending ASCII code.
5. The stream used to read the file must be closed.
* */
public class Solution {
    public static void main(String[] args) throws Exception {

        // Create a stream to read from the file passed
        // as the first argument of the main method.
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] contents = new byte[1024];
        int bytesRead = 0;
        String strContent = "";
        // read all the bytes into strContent
        while((bytesRead = bufferedInputStream.read(contents)) != -1) {
            strContent += new String(contents, 0, bytesRead);
        }
//        System.out.println(strContent);
        fileInputStream.close();
        bufferedInputStream.close();

        byte[] foo = strContent.getBytes("US-ASCII");
        Map<Byte, Integer> map = new TreeMap<>();
        for(Byte item: foo) {
            if (map.containsKey(item)){
                map.put(item, map.get(item)+1);
            } else {
                map.put(item, 1);
            }
        }
        for (Map.Entry<Byte,Integer> entry : map.entrySet()){
            System.out.println((char)entry.getKey().byteValue() + " " + entry.getValue());
        }
    }
}