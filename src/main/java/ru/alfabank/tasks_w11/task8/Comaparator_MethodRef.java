package ru.alfabank.tasks_w11.task8;

import ru.alfabank.tasks_w6.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comaparator_MethodRef {
    static void main() {
        List<Person> people=new ArrayList<>();
        people.add(new Person("ann",30));
        people.add(new Person("Bob",30));
        people.add(new Person("Carl",25));
        people.sort(Comparator.comparing(Person::getAge).thenComparing(x->x.getName().toLowerCase()));
        System.out.println(people);
        people.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(x->x.getName().toLowerCase()));
        System.out.println(people);
    }
}
