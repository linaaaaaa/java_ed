package ru.alfabank.tasks_w10.task6;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Person comparePerson = (Person) obj;
        if (name.equals(comparePerson.name) && age == comparePerson.age) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String result = name + age;
        return result.hashCode();
    }

    static void main() {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Alice", 16));
        for (int i = 0; i < 2; i++) {
            personSet.add(new Person("Alice", 30));
        }
        System.out.println(personSet);
    }
}
