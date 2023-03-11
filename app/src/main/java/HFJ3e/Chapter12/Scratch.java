package HFJ3e.Chapter12;

import java.util.List;

public class Scratch {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blue", "Yellow");
        for (String color: allColors) {
            System.out.println(color);
        }

        allColors.forEach(color -> System.out.println(color));
    }
}
