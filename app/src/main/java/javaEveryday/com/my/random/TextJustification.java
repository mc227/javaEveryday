package javaEveryday.com.my.random;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    /**
     maxWidth = 16
     words = ["This", "is", "an", "example", "of", "text", "justification."]
                                    i         j

     lineLength = 4 + 4 + 2 = 10

     output = ["This is an",
                ]




     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;
        while(i < n) {
            int j = i + 1;
            int lineLength = words[i].length();
            while( j < n && (lineLength + words[j].length() + j - i -1 < maxWidth)){
                lineLength += words[j].length();
                ++j;
            }
            int diff = maxWidth - lineLength;
            int numberOfWords = j - i;
            if(numberOfWords == 1 || j >= n){
                result.add(leftJustify(words, diff, i, j));
            } else {
                result.add(middleJustify(words, diff, i,j));
            }
            i = j;
        }
        return result;
    }

    private String middleJustify(String[] words, int diff, int i, int j) {
        int spacesNeeded = j - i - 1;
        int spaces = diff/spacesNeeded;
        int extraSpaces = diff % spacesNeeded;
        StringBuilder result = new StringBuilder(words[i]);
        for(int k = i+1; k < j; ++k) {
            int spacestoApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacestoApply) + words[k]);
        }
        return result.toString();
    }

    private String leftJustify(String[] words, int diff, int i, int j) {
        int spacesOnRight = diff - (j - i - 1);
        StringBuilder result = new StringBuilder(words[i]);
        for(int k = i+1; k < j; ++k) {
            result.append(" "+ words[k]);
        }
        result.append(" ".repeat(spacesOnRight));
        return result.toString();
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        TextJustification textJustification = new TextJustification();
        System.out.println(textJustification.fullJustify(arr,16));
    }
}
