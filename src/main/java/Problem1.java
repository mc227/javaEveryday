public class Problem1
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        long start_time= System.currentTimeMillis();
        long summ=0;
        int max_value=1000;
        int series_intial=1;
        int series_3_dist=3;
        int series_5_dist=5;
        int series_15_dist=15;
        int nvalue_3=((max_value-1)/3);
        int nvalue_5=((max_value-1)/5);
        int nvalue_15=((max_value-1)/15);

        summ=(nvalue_3*((2*series_intial)+(nvalue_3-1))*series_3_dist)/2;
        summ+=(nvalue_5*((2*series_intial)+(nvalue_5-1))*series_5_dist)/2;
        summ-=(nvalue_15*((2*series_intial)+(nvalue_15-1))*series_15_dist)/2;
        System.out.println("Summay value:"+summ);
        System.out.println("Total time taken:"+ ((System.currentTimeMillis()-start_time)/1000)+"sec");
    }

}