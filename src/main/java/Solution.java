import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(3L);
        for (int i=0; i < 10; i++) {
//            System.out.println(random.nextDouble());
            System.out.println(random.nextInt());
        }
    }
}
