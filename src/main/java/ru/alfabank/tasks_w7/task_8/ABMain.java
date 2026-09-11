package ru.alfabank.tasks_w7.task_8;

public class ABMain {
    static void main() {
        A a=new B();
        System.out.println(a.type);
        System.out.println(a.name());
        System.out.println(((B)a).type);
        System.out.println(((B)a).name());
    }
}
