package ru.alfabank.tasks_w6;

import java.util.ArrayList;
import java.util.List;

public class CounterDemo {
    static void main() {
        List<Counter> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Counter());
        }
        System.out.println(Counter.getCount());
    }
}
