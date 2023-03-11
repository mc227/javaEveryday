package HFJ3e.Chapter11;

import java.util.*;

public class TestGenerics3 {
    public static void main(String[] args) {

//        new TestGenerics3().go();
//        List<Dog> dogs = List.of(new Dog(), new Dog());
//        List<Cat> cats = List.of(new Cat(), new Cat());

//        TestGenerics3 test = new TestGenerics3();
//        test.takeAnimals(dogs); // accepts list of dogs
//        test.takeAnimals(cats); // accepts list of cats, because Cat extends Animal

        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        TestGenerics3 test = new TestGenerics3();
        test.takeAnimals2(dogs); // accepts list of dogs
        test.takeAnimals2(cats); // does not compile, because cats are not of type Dog

    }

    public void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);

        List<Dog> vaccinatedDogs = getUniqueAnimals(dogs);
        System.out.println(vaccinatedDogs);
        List<? extends Animal> uniqueAnimals2 = getUniqueAnimals2(dogs);
        System.out.println(uniqueAnimals2);
    }

    public void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public <T extends Animal> void takeAnimals2(List<T> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public <T extends Animal> List<T> getUniqueAnimals(List<T> animals) {
        return new ArrayList<>(animals);
    }

    public List<? extends Animal> getUniqueAnimals2(List<? extends Animal> animals) {
        return List.of(new Cat());
    }
}


abstract class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void bark() {
    }
}

class Cat extends Animal {
    void meow() {
    }
}


