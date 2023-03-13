package HFJ3e.Chapter12;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
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
//        Consumer<String> c = s -> System.out.println(s);
//        c.accept("Oh Hi Mark");
//        r.run();
//        Supplier<String> s = () -> System.out.println("Some string");
//        Consumer<String> c = (s1, s2) -> System.out.println(s1 + s2);
//        Runnable r = (String str) -> System.out.println(str);
//        Function<String, Integer> f = s -> s.length();
//        System.out.println(f.apply("Oh Hi Mark"));
//        Supplier<String> s = () -> "Some string";
//        System.out.println(s.get());
//        Consumer<String> c = s -> "String" + s;
//        Consumer<String> c = (s1, s2) -> System.out.println(s1 + s2);
//        Function<String, Integer> f = (int i) -> "i = " + i;
//        Consumer<String> c = s -> System.out.println(s);
//        c.accept("Oh Hi Mark");
//        Consumer<String> c = s -> System.out.println(s1 + s2);
//
//        Function<String, Integer> f = s -> s.length();
//        System.out.println(f.apply("oh hi Mark"));
//        Supplier<String> s = () -> "Some string";
//        System.out.println(s.get());
//        Consumer<String> c = s -> System.out.println(s);
//        Consumer<String> c = s -> "String" + s;
//        Supplier<String> s = () -> "Some string: ";
        Function<String, Integer> f = (String s) -> s.length();
    }
}
