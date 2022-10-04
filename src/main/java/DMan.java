//

public class DMan {
    public static String Speak(String something) {
        return something;
    }

    public static Integer Add(int x, int y) {
        return x+y;
    }



    public static void main(String[] args) {
        // [20, 20, 89, 78]
        String[] array = new String[]{"20", "20", "1", "2"};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + Integer.valueOf(array[i]);
        }
        System.out.println(sum);

    }
}
