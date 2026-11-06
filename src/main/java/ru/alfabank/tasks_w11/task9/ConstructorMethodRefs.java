package ru.alfabank.tasks_w11.task9;

import ru.alfabank.tasks_w6.Person;

import java.util.function.*;

public class ConstructorMethodRefs {
    static void main() {
        Supplier<Person> def = Person::new;
        Function<String, Person> byName = Person::new;
        BiFunction<String, Integer, Person> full = Person::new;

        System.out.println(def.get());
        System.out.println(byName.apply("Ann"));
        System.out.println(full.apply("Bob", 35));
    }
}
