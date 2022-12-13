package javaEveryday.com.DW.week8;

public class TwoD {
    public static void main(String args[])
    {
        int a[][]=new int[4][3];
        int d[]={10,20,30,40,50,60,70,80,90,100,110,120};
        int count=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(count==d.length) break;
                a[i][j]=d[count];
                count++;
            }}
        int j=0;
        for (int i = 0; i<4;i++) {
            for(j=0;j<3;j++)
                System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
