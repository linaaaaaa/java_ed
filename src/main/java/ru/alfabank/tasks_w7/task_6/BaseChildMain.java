package ru.alfabank.tasks_w7.task_6;

public class BaseChildMain {
    static void main() {
        System.out.println(Base.who());
        System.out.println(Child.who());
        Base ref=new Child();
        System.out.println(ref.whoAmI());
    }
}
