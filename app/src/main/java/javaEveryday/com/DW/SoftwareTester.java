package javaEveryday.com.DW;

public class SoftwareTester extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Initializes Employee class with one parameter
     *
     * @param salary is in dollars
     */
    public SoftwareTester(double salary) {
        super(salary);
    }
}
