package javaEveryday.com.DW;

public class Student {
    protected String name;
    public Student(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am a Student.";
    }
    public static void polyMethod(Object obj){
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        Student stu = new Student("Stu");
        polyMethod(stu);
        OneRowNim nim = new OneRowNim();
        polyMethod(nim);
    }
}
