package ru.alfabank.tasks_w6;

public class Counter {
    private static int count = 0;

    public Counter() {
        count += 1;
    }

    public static int getCount() {
        return count;
    }
}
