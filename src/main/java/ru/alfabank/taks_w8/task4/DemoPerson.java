package ru.alfabank.taks_w8.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoPerson {
    static void main() {
        List<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person("Ann", 33));
        people.add(new Person("Bob", 15));
        people.add(new Person("Uncle John", 67));
        Collections.sort(people);
        for (Person p : people) {
            System.out.println(p.toString());
        }
        Collections.sort(people, new PersonNameComparator());
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
