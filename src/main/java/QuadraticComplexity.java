import java.util.ArrayList;
import java.util.List;

public class QuadraticComplexity {
    // assuming no duplicate values exist in each array
    public static List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};
        int[] array = {1, 2, 3};
        System.out.println(intersection(first,second));
    }
}
