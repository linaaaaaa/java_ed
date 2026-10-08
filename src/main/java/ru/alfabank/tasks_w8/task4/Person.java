package ru.alfabank.tasks_w8.task4;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("Unknown", 0);
    }

    @Override
    public int compareTo(Person person) {
        if (person.age >= age) {
            if (person.age == age)
                return 0;
            else return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name + ", " + age;
    }

    public String getName() {
        return name;
    }
}
