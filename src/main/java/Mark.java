public class Mark {


    public static void main(String[] args) {
        int a= 0;
        for (int i=1;i< 1000; i=i+1) {
            if (i%3==0||i%5==0) {
                a= a+i;
            }
        }
        System.out.println(a);
    }
}
