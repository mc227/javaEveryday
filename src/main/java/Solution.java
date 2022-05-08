import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        String[] original = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Ferrari","Kia","Testla","Hummer"};
        String[][] original1 = new String[2][];
        int chunk = 3; // chunk size to divide
        for(int i=0;i<original.length;i+=chunk){
            System.out.println(Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk))));
            original1[i] = new String[] {Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk)))};
        }
        for(String[] o: original1) {
            for(String item: o) {
                System.out.println(item+" ");
            }
            System.out.println();
        }
    }
}