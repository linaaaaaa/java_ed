package ru.alfabank.tasks_w8.task7;

public class Demo {
    static void main() {
        System.out.println(new C().id());
        System.out.println(((A) new C()).id());
        System.out.println(((B) new C()).id());
    }
}
