package javaEveryday.com.my.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextJustification {
    /**
     maxWidth = 16
     words = ["This", "is", "an", "example", "of", "text", "justification."]
                i      j
     lineLength =

     output = ["This    is    an", "example  of text", "justification.  "]
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;
        while(i < n) {
            int lineLength = words[i].length();
            int j = i + 1;
            while(j < n && (lineLength + words[j].length() + j - i - 1) < maxWidth) {
                lineLength += words[j].length();
                ++j;
            }
            int numOfWords = j - i;
            int diff = maxWidth - lineLength;
            if(numOfWords==1 || j>=n){
                result.add(leftJustify(words,diff,i,j));
            } else {
                result.add(middleJustify(words,diff,i,j));
            }
            i = j;
        }
        return result;
    }

    private String middleJustify(String[] words, int diff, int i, int j) {
        int spaceGroups = j - i - 1;
        int spaces = diff/spaceGroups;
        int extraSpaces = diff % spaceGroups;
        StringBuilder result = new StringBuilder(words[i]);
        for(int k = i+1; k < j; ++k) {
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1: 0);
            result.append(" ".repeat(spacesToApply) + words[k]);
        }
        return result.toString();
    }

    private String leftJustify(String[] words, int diff, int i, int j) {
        int spacesOnRight = diff - (j - i - 1);
        StringBuilder result = new StringBuilder(words[i]);
        for(int k = i+1; k < j; ++k) {
            result.append(" "+words[k]);
        }
        result.append(" ".repeat(spacesOnRight));
        return  result.toString();
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        TextJustification textJustification = new TextJustification();
        System.out.println(textJustification.fullJustify(arr, 16));
        System.out.println(new ArrayList<>(
                Arrays.asList("This    is    an", "example  of text", "justification.  ")));
    }
}
