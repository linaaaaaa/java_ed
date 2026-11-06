package ru.alfabank.tasks_w11.task2_3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf_ForEach {
    static void main() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "", "three", "", "five"));
        words.removeIf(s -> s.isEmpty());
        words.forEach(System.out::println);
    }
}
