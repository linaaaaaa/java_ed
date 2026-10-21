package ru.alfabank.tasks_w10.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTasksDemo {
    static void main() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Выучить коллекции", 2));
        tasks.add(new Task("Сделать зарядку", 1));
        tasks.add(new Task("Прочитать книгу", 3));
        Collections.sort(tasks);
        System.out.println(tasks);
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println(tasks);
    }
}
