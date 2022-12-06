package javaEveryday.com.DW.week7.practice.exercise;

public class IllegalPetAgeArgumentException extends IllegalArgumentException {
    private int age;

    public IllegalPetAgeArgumentException(int age) {
        super("Age must be greater than 0: age=" + age);
    }
    public String toString(){
        return this.getClass().getSimpleName() + " : Age must be greater than 0: age=" + age;
    }
}
