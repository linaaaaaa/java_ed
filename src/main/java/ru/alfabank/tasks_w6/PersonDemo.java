package ru.alfabank.tasks_w6;

public class PersonDemo {
    static void main() {
        Person p1=new Person();
        Person p2=new Person("Ann",25);
        System.out.println(p2);
        System.out.println(p1.getName());
        Person p3=new Person("Bob",-1);
    }
}
