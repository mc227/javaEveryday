package javaEveryday.com.my.random;

public class Person {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    public static void main(String[] args) {
        Person trang = new Person();
        trang.setName("Trang");
        trang.setAge(30);
//        System.out.println(trang.name);
//        System.out.println(trang.age);

        Person stephanie = new Person();
        stephanie.setName("Stephanie");
        stephanie.setAge(18);
        System.out.println(stephanie);

    }
}
