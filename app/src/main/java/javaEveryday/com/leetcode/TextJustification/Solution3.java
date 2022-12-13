package javaEveryday.com.leetcode.TextJustification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        if(words.length == 0)
            return null;

        return fullJustifyHelp(words, maxWidth, 0);

    }

    public List<String> fullJustifyHelp(String[] words, int maxWidth, int start){
        //At the end of words list.
        if (start == words.length){
            List<String> output = new ArrayList<String>();
            return output;
        }

        if(words.length - 1 == start){
            char[] space = new char[maxWidth-words[start].length()];
            Arrays.fill(space,' ');
            String thisLine = words[start];
            thisLine += String.valueOf(space);
            List<String> output = new ArrayList<String>();
            output.add(thisLine);
            return output;
        }
        int currentLength = words[start].length();
        int spaceNum = 0;
        while(spaceNum < words.length - start - 1 && currentLength <= maxWidth){
            spaceNum++;
            currentLength += words[start+spaceNum].length() + 1;
        }

        if(currentLength > maxWidth){
            currentLength -= 1+words[start+spaceNum].length();
            spaceNum--;
        }
        currentLength = 0;
        for(int i = 0; i <= spaceNum; i++){
            currentLength += words[start+i].length();
        }

        String thisLine = "";

        //If this line only has one word
        if(spaceNum == 0){
            char[] space = new char[maxWidth-words[start].length()];
            Arrays.fill(space,' ');
            thisLine = words[start] + String.valueOf(space);
            List<String> output = new ArrayList<String>();
        }
        //If there is no other word after this line.
        else if (start + spaceNum + 1 == words.length){
            thisLine = words[start];
            for(int i = 1; i <= spaceNum; i++){
                thisLine += " " + words[start+i];
            }
            char[] space = new char[maxWidth-thisLine.length()];
            Arrays.fill(space,' ');
            thisLine += String.valueOf(space);
            List<String> output = new ArrayList<String>();
        }
        //For normal case, construct the line.
        else{
            thisLine = buildLine(words, currentLength, maxWidth, start, spaceNum);
        }

        List<String> output = fullJustifyHelp(words, maxWidth, start+spaceNum+1);
        output.add(0, thisLine);
        return output;
    }

    //Build the line recursively.
    public String buildLine(String[] words, int currentLength, int maxWidth, int start, int spaceNum){
        //judge whether the space can be divided evenly.
        String thisLine = "";
        if((maxWidth-currentLength)%spaceNum == 0){
            char[] space = new char[(maxWidth-currentLength)/spaceNum];
            Arrays.fill(space, ' ');
            String spaces = String.valueOf(space);
            // thisLine = words[start];
            for(int i = 0; i < spaceNum; i++){
                thisLine += words[start+i] + spaces;
            }
            thisLine += words[start + spaceNum];
        }
        else{
            char[] space = new char[(maxWidth-currentLength)/spaceNum + 1 ];
            Arrays.fill(space, ' ');
            String spaces = String.valueOf(space);
            thisLine += words[start] + spaces;
            start += 1;
            spaceNum -= 1;
            currentLength += spaces.length();
            //build the line text recursively.
            thisLine += buildLine(words, currentLength, maxWidth, start, spaceNum);
        }
        return thisLine;
    }
    public static void main(String[] args) {
        String[] arr = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.fullJustify(arr, 16));
        System.out.println(new ArrayList<>(
                Arrays.asList("This    is    an", "example  of text", "justification.  ")));
    }
}