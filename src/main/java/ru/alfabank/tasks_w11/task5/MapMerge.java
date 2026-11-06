package ru.alfabank.tasks_w11.task5;

import java.util.*;

public class MapMerge {
    static void main() {
        String inputString = new Scanner(System.in).nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (String word : Arrays.asList(inputString.split("[^A-Za-z]+"))) {
            map.merge(word, 1, Integer::sum);
        }
        System.out.println(map);
    }
}
