package javaEveryday.com.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EvalPostFix {
    public double evaluate(String postfix){
        return 0;
    }

    public static void main(String[] args) {
        String postfix = "1 2 +";
        System.out.println(Arrays.toString(postfix.split(" ")));
        // can you split it up into an array
        // now I can see that you can split it
        // can you do a for loop on each one
        for(String item: postfix.split(" ")){
            System.out.println(item);
        }
        // sweet you can do it
    }
}
