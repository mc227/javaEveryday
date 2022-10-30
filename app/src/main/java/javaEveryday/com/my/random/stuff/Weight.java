package javaEveryday.com.my.random.stuff;

import java.util.*;


/**
 * A weight class that uses "English measure"
 * (i.e., pounds and ounces)
 *
 * @version 4.0
 * @author  CS139, James Madison University
 */
public class Weight
{
    // These attributes are essential to the definition of a Weight
    private int      ounces, pounds, sign;

    /**
     * Explicit Value Constructor
     *
     * @param pounds     The number of pounds (must be positive)
     * @param ounces     The number of ounces (must be positive)
     * @param positive   true for a postive Weight, false for negative
     */
    public Weight(int pounds, int ounces, boolean positive)
    {
        this.pounds = Math.abs(pounds);
        this.ounces = Math.abs(ounces);

        this.sign   = 1;
        if (!positive) this.sign = -1;

        normalize(toOunces()); // In case ounces is greater than 15
    }

    /**
     * Copy Constructor
     *
     * @param other     The Weight to (deep) copy
     */
    public Weight(Weight other)
    {
        this(other.pounds, other.ounces, (other.sign > 0));
    }

    /**
     * Default Constructor
     */
    public Weight()
    {
        this(0, 0, true);
    }

    /**
     * Change this Weight by a given amount
     *
     * @param other   The amount to change this Weight by
     */
    public void changeBy(Weight other)
    {
        int     otherWeightInOunces, thisWeightInOunces, total;

        thisWeightInOunces  = this.toOunces();
        otherWeightInOunces = other.toOunces();

        total = thisWeightInOunces + otherWeightInOunces;

        normalize(total); // In case ounces is greater than 15
    }

    /**
     * Check to see if this Weight is equal to
     * a given Weight
     *
     * @param other   The other Weight to use in the comparison
     * @return        true if the two are equal and false otherwise
     */
    public boolean equals(Weight other)
    {
        int     otherWeightInOunces, thisWeightInOunces;

        thisWeightInOunces  = this.toOunces();
        otherWeightInOunces = other.toOunces();

        return (thisWeightInOunces == otherWeightInOunces);
    }

    /**
     * Set the pounds and ounces for this Weight based on
     * on a value measure only in ounces (which may be greater than
     * or equal to 16).
     *
     * @param totalOunnces   The total number of ounces in the Weight
     */
    private void normalize(int totalOunces)
    {
        int   total;

        total  = Math.abs(totalOunces);
        pounds = total / 16;
        ounces = total % 16;

        if (totalOunces < 0) sign = -1;
    }


    /**
     * A factory method that constructs a Weight from a
     * String representation.
     *
     * Note: The String is assumed to be comma-delimited, with the
     * pounds listed first. Both values must be included (even if 0),
     * and both values must be integers. This method throws a
     * NoSuchElementException if either the pounds or ounces is missing
     * and throws a NumberFormatException if either the pounds or ounces
     * is not an integer.
     *
     * @param  s   The String representation
     * @return     A corresponding Weight
     */
    public static Weight parseWeight(String s) throws
            NoSuchElementException, NumberFormatException
    {
        boolean              positive;
        int                  ounces, pounds;
        StringTokenizer      st;
        String               token;


        st     = new StringTokenizer(s, ",");
        token  = st.nextToken();
        pounds = Integer.parseInt(token);
        token  = st.nextToken();
        ounces = Integer.parseInt(token);

        positive = true;
        if ((pounds < 0) || (ounces < 0)) positive = false;

        return new Weight(pounds, ounces, positive);
    }


    /**
     * Get a String representation of this Weight
     *
     * @return  The String
     */
    public String toString()
    {
        String     s, poundString;

        s = new String();
        if (sign < 0) s += "Negative ";

        poundString = " lbs. ";
        if (pounds == 1) poundString = " lb.  ";

        s += pounds + poundString + ounces + " oz.";
        return s;
    }


    /**
     * Get a String representation of this Weight
     *
     * @param   terse  true for a terse representaion; false otherwise
     * @return         The String
     */
    public String toString(boolean terse)
    {
        String       s;

        if (terse)
        {
            s = new String();
            if (sign < 0) s += "-";
            s += pounds + "," + ounces;

            return s;
        }
        else
        {
            return toString();
        }
    }

    /**
     * Get that value of this Weight in ounces
     * (e.g., this method returns 17 for a Weight of 1lb. 1oz.)
     *
     * Note: This method is private because it is only used
     *       within the class.
     *
     * @return  The Weight in ounces
     */
    private int toOunces()
    {
        int     total;

        total = sign * (pounds*16 + ounces);
        return total;
    }
}
