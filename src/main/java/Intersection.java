import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public List<Integer> intersectionFast(int[] a, int[] b) {
        List<Integer> result = new LinkedList<>();
        for(int x : a){
            if (IntStream.of(b).anyMatch(y -> y == x)) {
                result.add(x);
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        Intersection inter = new Intersection();
//        System.out.println(inter.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
//        System.out.println(inter.intersection(new int[]{4, 6, 11, 2, 3}, new int[]{5, 11, 3, 9, 1}));
//
//        System.out.println(inter.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
//        System.out.println(inter.intersectionFast(new int[]{4, 6, 11, 2, 3}, new int[]{5, 11, 3, 9, 1}));
//    }
}