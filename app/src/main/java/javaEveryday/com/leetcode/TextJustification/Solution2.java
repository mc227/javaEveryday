package javaEveryday.com.leetcode.TextJustification;

import javaEveryday.com.my.random.TextJustification;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int i = 0;
        List<String> res = new ArrayList<>();
        while(i < words.length) {
            int j = goRight(i, words, maxWidth);
            res.add(justify(i,j,words,maxWidth));
            i = j + 1;
        }
        return res;
    }

    public int goRight(int start, String[] words, int maxWidth) {
        int end = start;
        int sum = words[end++].length();//This
        while(end < words.length && sum + 1 + words[end].length() <= maxWidth){
            sum += 1 +  words[end++].length();
        }
        return end - 1;
    }

    public String justify(int start, int end, String[] words, int maxWidth) {
        if(start == end) {
            return padResult(words[start], maxWidth);
        }
        boolean lastLine = (end == words.length - 1);
        int numSpace = end - start; // space
        int totalSpace = maxWidth - wordsSpace(start,end, words);
        String space = lastLine? " ":blank(totalSpace/numSpace);
        int remainder = lastLine?0:totalSpace%numSpace;
        StringBuilder sb = new StringBuilder();
        for(int i = start; i <= end; i++) {
            sb.append(words[i])
                    .append(space)
                    .append(remainder-- > 0? " ":"");
        }
        return padResult(sb.toString().trim(),maxWidth);
    }

    public int wordsSpace(int i, int j, String[] words) {
        int wordLength = 0;
        for(int w = i; w <= j; w++) {
            wordLength += words[w].length();
        }
        return wordLength;
    }


    public String padResult(String word, int maxWidth) {
        return word + blank(maxWidth - word.length());
    }

    public String blank(int space) {
        return new String(new char[space]).replace('\0', ' ');
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.fullJustify(arr,16));
        System.out.println(new ArrayList<>(
                Arrays.asList("This    is    an", "example  of text", "justification.  ")));
    }
}