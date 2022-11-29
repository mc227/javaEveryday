package javaEveryday.com.DW;

public class NetworkEngineer extends Employee{
    protected double bonus;
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

    @Override
    public String toString() {
        return "NetworkEngineer base salary: $" + salary;
    }

    /**
     * This method is the same method on Page 342 of the Java, Java, Java book
     * obj.toString() is invoked at run time.
     * @param obj
     */
    public static void polyMethod(Object obj){
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        NetworkEngineer networkEngineer = new NetworkEngineer(200000);
        polyMethod(networkEngineer);
    }
}
