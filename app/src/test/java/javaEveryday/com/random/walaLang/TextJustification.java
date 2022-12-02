package javaEveryday.com.random.walaLang;

import java.util.ArrayList;
import java.util.Arrays;

public class TextJustification {
    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList("This    is    an", "example  of text", "justification.  "));
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);
    }
}
