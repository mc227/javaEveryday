public class LinearComplexity {
    public int countChars(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }
        return count;
    }
//    public static void main(String[] args) {
//
//        System.out.println(countChars('a', "Sally sells sea shells on the seashore"));
//    }
}
