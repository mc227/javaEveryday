public class BinaryToDecimal {
    public int convertToDecimal(String binary) {
        int conversion = 1;
        int result = 0;
        for(int i = binary.length() - 1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                result *=conversion;
            }
            conversion *= 2;
        }
        return result;
    }


    public static void main(String args[]) {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.convertToDecimal("10110"));
    }
}
