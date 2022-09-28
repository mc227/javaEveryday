

public class Solution {
    public static void main(String[] args) {
//        for(int i = 1; i < 6; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i = 1; i < 5; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i = 1; i < 4; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i = 1; i < 3; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i = 1; i < 2; i++) {
//            System.out.print(i);
//        }
        for(int j = 0; j < 6;j++){
            for(int i = 0; i < 6 - j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}