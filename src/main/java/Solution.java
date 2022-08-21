public class Solution {
    ////below is my answer
//    public static int convertToDecimal(String binary) {
//        int result = 0;
//        int conversion = 1;
//        for(int i = binary.length()-1; i >= 0; i--) {
//            if (binary.charAt(i)== '1')
//                result += conversion;
//            conversion *=2;
//        }
//        return result;
//    }
    // below is the code in the book
    public static int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convertToDecimal("111111"));
    }
}