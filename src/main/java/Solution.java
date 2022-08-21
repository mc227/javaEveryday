public class Solution {
    public static int convertToDecimal(String binary) {
        int result = 0;
        int conversion = 1;
        for(int i = binary.length()-1; i >= 0; i--) {
            if (binary.charAt(i)== '1')
                result += conversion;
            conversion *=2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convertToDecimal("111"));
    }
}