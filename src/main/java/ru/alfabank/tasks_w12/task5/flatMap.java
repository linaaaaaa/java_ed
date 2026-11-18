package ru.alfabank.tasks_w12.task5;

import java.util.Arrays;
import java.util.List;

public class flatMap {
    static void main() {
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        List<Integer> allNumbers = listOfLists.stream().flatMap(l -> l.stream()).toList();
        System.out.println(allNumbers);
    }
}
