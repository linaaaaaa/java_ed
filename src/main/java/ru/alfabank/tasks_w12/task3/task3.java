package ru.alfabank.tasks_w12.task3;

import java.util.*;
import java.util.stream.Collectors;

public class task3 {
    static void main() {
        List<Person> people = Arrays.asList(new Person("Ava", "Paris"),
                new Person("Bob", "Moscow"), new Person("Cam", "Warsaw"),
                new Person("Den", "Moscow"), new Person("Ethan", "Paris"),
                new Person("Jane", "Paris"), new Person("Helen", "Rome"));
        Map<String, List<Person>> cityPeople = new HashMap<>();
        cityPeople = people.stream().collect(Collectors.groupingBy(Person::getCity));
        cityPeople.forEach((s, entry) -> {
            System.out.println(s + ", " + entry.size() + ": " + entry);
        });
    }
}
