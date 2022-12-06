package javaEveryday.com.DW.week7.practice.exercise;

public class TestPet {
    public static void main(String[] args) {
//        Pet pet = new Pet("",10); // throw IllegalArgumentException
//        Pet pet = new Pet("g",0); // throw IllegalArgumentException
        try {
            Pet pet = new Pet("", 10);
        } catch (IllegalPetNameArgumentException e)  {
            // some code how we want to handle invalid name
        } catch (IllegalArgumentException e2) {
            // Some code how we want to handle any issues when IllegalArgumentException is thrown
        }
    }
}
