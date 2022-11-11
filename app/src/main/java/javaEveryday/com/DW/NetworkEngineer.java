package javaEveryday.com.DW;

public class NetworkEngineer extends Employee{
    private double bonus;
    /**
     * Initializes Employee class with one parameter
     *
     * @param salary is in dollars
     */
    public NetworkEngineer(double salary) {
        super(salary);
    }

    /**
     * gets Bonus amount
     * @return bonus in dollars
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * sets bonus amount
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
