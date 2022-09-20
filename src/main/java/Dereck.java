import java.util.Scanner;

public class Dereck {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
//        int n=sc.nextInt();
        int n=5;
        System.out.println();
        int s=2*n-1;
//        // Upper Half
        for (int i = 0;i<(s/2)+1;i++)
        {
            int m = n;
            // Decreasing part
            for (int j = 0; j < i; j++)
            {
                System.out.print(m + " ");
                m--;
            }

//            // Constant Part
//            for (int k = 0; k < s - 2 * i; k++)
//            {
//                System.out.print(n - i + " ");
//            }
//            // Increasing part.
//            m = n - i + 1;
//            for (int l = 0; l < i; l++)
//            {
//                System.out.print(m + " ");
//                m++;
//            }
            System.out.println();
        }
//        // Lower Half
//        for (int i = s / 2 - 1;i >= 0; i--)
//        {
////            // Decreasing Part
//            int m = n;
//            for (int j = 0; j < i; j++)
//            {
//                System.out.print(m + " ");
//                m--;
//            }
//
//            // Constant Part.
//            for (int k = 0;k < s - 2 * i; k++)
//            {
//                System.out.print(n - i + " ");
//            }
//            // Increasing Part
//            m = n - i + 1;
//            for (int l = 0; l < i; l++)
//            {
//                System.out.print(m + " ");
//                m++;
//            }
//            System.out.println();
//        }
    }
}
