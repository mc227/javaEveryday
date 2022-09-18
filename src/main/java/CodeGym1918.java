

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Introducing tags

*/

public class CodeGym1918 {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = consoleReader.readLine();
        } catch (IOException ignore) {
        }

        StringBuilder readFileContent = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                readFileContent.append(fileReader.readLine());
            }
        } catch (IOException ignore) {
        }

        String fileContent = readFileContent.toString().replaceAll("[\\r\\n]+", "");
        System.out.println(fileContent); //M
        System.out.println("******************"); //M

        String tag = args[0];
        String openedTag = "<" + tag;
        String closedTag = "</" + tag;
        int openedTagIndex = fileContent.indexOf(openedTag);
        System.out.println(openedTagIndex); //M
        System.out.println("******************"); //M
        int closedTagIndex = fileContent.indexOf(closedTag);
        System.out.println(closedTagIndex); //M
        System.out.println("******************"); //M
        int openedTagCount = 0;
        int closedTagCount = 0;
        ArrayList<Integer> openedTagsIndexes = new ArrayList<>();
        ArrayList<Integer> closedTagsIndexes = new ArrayList<>();
        ArrayList<Integer> tempClosedTagsIndexes = new ArrayList<>();

        while (openedTagIndex != -1 || closedTagIndex != -1) {
            if (openedTagIndex != -1 && openedTagIndex < closedTagIndex) {
                openedTagsIndexes.add(openedTagIndex);
                openedTagCount++;
                openedTagIndex = fileContent.indexOf(openedTag, openedTagIndex + 1);
            } else if (closedTagCount != -1 && (closedTagIndex < openedTagIndex || openedTagIndex == -1)) {
                tempClosedTagsIndexes.add(closedTagIndex + tag.length() + 3);
                closedTagCount++;
                closedTagIndex = fileContent.indexOf(closedTag, closedTagIndex + 1);
            }

            if (closedTagCount == openedTagCount) {
                for (int i = tempClosedTagsIndexes.size() - 1; i >= 0; i--) {
                    closedTagsIndexes.add(tempClosedTagsIndexes.get(i));
                }
                tempClosedTagsIndexes.clear();
            }
        }

        for (int i = 0; i < openedTagsIndexes.size(); i++) {
            System.out.println(fileContent.substring(openedTagsIndexes.get(i), closedTagsIndexes.get(i)));
        }
    }
}
