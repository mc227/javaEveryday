package javaEveryday.com.DW;

/**
 * A Project class that makes calculations with Weight Objects
 *
 *
 * @version 1.0
 * @author
 */

public class Project1 {
    /**
     * Looks for the Weight object with the minimum weight value
     *
     * @param weight1 first Weight parameter
     * @param weight2 second Weight parameter
     * @param weight3 third Weight parameter
     *
     * @return the lowest weight
     */
    private Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
        Weight lowest = weight1;
        if (!lowest.lessThan(weight2)) {
            lowest = weight2;
        }
        if (!lowest.lessThan(weight3)) {
            lowest = weight3;
        }
        System.out.println("The minimum weight is " + lowest.toString());
        return lowest;
    }

    /**
     * Looks for the Weight object with the max weight value
     *
     * @param weight1 first Weight parameter
     * @param weight2 second Weight parameter
     * @param weight3 third Weight parameter
     *
     * @return the max weight
     */
    private Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
        Weight max = weight1;
        if (max.lessThan(weight2)) {
            max = weight2;
        }
        if (max.lessThan(weight3)) {
            max = weight3;
        }
        System.out.println("The maximum weight is " + max.toString());
        return max;
    }

    /**
     * Looks for the average of the 3 weight objects
     *
     * @param weight1 first Weight parameter
     * @param weight2 second Weight parameter
     * @param weight3 third Weight parameter
     *
     * @return the average weight
     */
    private Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {
        int totalPounds;
        double totalOunce;
        Weight average = null;
        totalPounds = weight1.getPounds() + weight2.getPounds() + weight3.getPounds();
        totalOunce = weight1.getOunces() + weight2.getOunces() + weight3.getOunces();
        int averagePounds = totalPounds / 3;
        double averageOunces = totalOunce / 3;
        average = new Weight(averagePounds, averageOunces);
        System.out.println("The average weight is " + average.toString());
        return average;
    }

    public static void main(String[] args) {
        Project1 project1 = new Project1();
        Weight weight1 = new Weight(11, 3);
        Weight weight2 = new Weight(7, 20);
        System.out.println(weight2); // 8 pound(s) 4.0 ounce(s)
//        Weight weight3 = new Weight(14, 6);
        Weight weight3 = new Weight(14, 6);
        project1.findMinimum(weight1, weight2, weight3);
        project1.findMaximum(weight1, weight2, weight3);
        project1.findAverage(weight1, weight2, weight3);
    }
}
