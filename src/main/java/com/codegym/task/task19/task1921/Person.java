package com.codegym.task.task19.task1921;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("MM dd yyyy");
        Person person = new Person("Mark Costales", ft.parse("9 22 2000"));
        System.out.println(person.getBirthDate());
    }
}
