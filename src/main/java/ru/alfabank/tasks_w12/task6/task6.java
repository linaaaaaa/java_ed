package ru.alfabank.tasks_w12.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class task6 {
    static void main() {
        List<String> words = List.of("java", "kotlin", "Java", "js", "kafka");
        // test empty list:
        // List<String> words=new ArrayList<>();
        Map<Character, List<String>> mappedWords = words.stream().collect(
                Collectors.groupingBy(s -> s.toUpperCase().charAt(0),
                        Collectors.mapping(String::toUpperCase,
                                Collectors.collectingAndThen(Collectors.toCollection(TreeSet::new), ArrayList::new))));
        System.out.println(mappedWords);
    }
}
