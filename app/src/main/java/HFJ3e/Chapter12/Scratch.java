package HFJ3e.Chapter12;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scratch {
    public static void main(String[] args) {
//        List<String> allColors = List.of("Red", "Blue", "Yellow");
//        for (String color: allColors) {
//            System.out.println(color);
//        }
//
//        allColors.forEach(color -> System.out.println(color));
//        List<String> strings = List.of("I", "am", "a", "list" ,"of", "Strings");
//        List<String> result = strings.stream().sorted().limit(4).collect(Collectors.toList());
//        System.out.println("result = " + result);
//        Runnable r =  () -> System.out.println("Hi");
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Oh Hi Mark");
    }
}
