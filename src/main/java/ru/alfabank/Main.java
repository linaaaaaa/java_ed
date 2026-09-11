package ru.alfabank;

import ru.alfabank.tasks_w5.MathUtils;
import ru.alfabank.tasks_w6.Task;
import ru.alfabank.tasks_w6.Temperature;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int a=5;
        char b='a';
        boolean t=true;
        System.out.println("Hello");

        //Test Temperature (w6)
        System.out.println("32 C to F: "+String.format("%.2f",Temperature.cToF(0)));
        System.out.println("300 K to C: "+String.format("%.2f",Temperature.kToC(300)));

        //Test Task (w6)
        System.out.println(new Task("Refactor").start().complete().getStatus());
        System.out.println(new Task("Bugfix").start().getStatus());
        System.out.println(new Task().start().getTitle());
        System.out.println("Tasks count: "+Task.getCount());
    }
}
