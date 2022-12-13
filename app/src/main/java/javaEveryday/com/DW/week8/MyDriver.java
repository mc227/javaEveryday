package javaEveryday.com.DW.week8;
// Create a driver class
import java.util.ArrayList;

public class MyDriver {
    // Create an ArrayList that will hold the instances of Fruit object
    ArrayList listOfFruits = new ArrayList();

    // Add Fruit instances to the ArrayList
    private void populateFruitArray() {
        // Create instances of different types of fruits.
        // Depending on the requirement, the input values for creating fruit instances can be read from a file.
        Fruit apple = new Fruit();
        apple.setWeight(1);
        apple.setColor("red");
        // Add apple to ArrayList
        listOfFruits.add(apple);
        // Create another fruit
        Fruit mango = new Fruit();
        mango.setWeight(2);
        mango.setColor("green");
        // Add mango to ArrayList
        listOfFruits.add(mango);
    }

    // Iterate through the Fruit instances found in the ArrayList
    private void iterateFruitArray() {
        // It is also possible to use enhanced for loop syntax
        // Iterate through the listOfFruits
        for(int countOfFruits = 0; countOfFruits <listOfFruits.size(); countOfFruits++) {
            // Get the instance of the Fruit object from the ArrayList
            Fruit fruitToIterate = (Fruit) listOfFruits.get(countOfFruits);
            // Print out the weight of the fruit
            System.out.println("Weight =" + fruitToIterate.getWeight());
            // Print out the color of the fruit
            System.out.println("Color = "+ fruitToIterate.getColor());

        }
    }

    // Find a Fruit instance from the ArrayList with color green
    private void findFruitFromArray() {
        // Find the Fruit with color green
        // It is also possible to use enhanced for loop syntax
        // Iterate through the listOfFruits
        for(int countOfFruits = 0; countOfFruits <listOfFruits.size(); countOfFruits++) {
            // Get the instance of the Fruit object from the ArrayList
            Fruit fruitToIterate = (Fruit) listOfFruits.get(countOfFruits);
            // Print out the weight of the fruit
            if("green".equals(fruitToIterate.getColor())) {
                System.out.println("Found the fruit");
            }
        }
    }

    // To execute and test different methods written
    public static void main(String[] args) {
        // Create an instance of MyDriver
        MyDriver driver = new MyDriver();
        // Populate the fruit ArrayList
        driver.populateFruitArray();
        // Iterate through the Fruit ArrayList
        driver.iterateFruitArray();
        // Check to find a fruit from the Fuit ArrayList
        driver.findFruitFromArray();
    }
}