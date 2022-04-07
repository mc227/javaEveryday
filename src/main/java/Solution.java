import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(3000);

        System.out.println(" - How long did I sleep? \n - " + ((System.currentTimeMillis()-start)) / 1000 + " seconds");

    }
}
