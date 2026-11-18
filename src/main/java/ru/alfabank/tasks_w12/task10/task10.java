package ru.alfabank.tasks_w12.task10;

import java.util.Arrays;
import java.util.List;

public class task10 {
    static void main() {
        List<String> sentences;
        //test data
        // sentences = List.of("Hello, world!", "Hello Java");
        sentences = List.of("a a", "A!");
        List<String> mappedSentences = sentences.stream().
                flatMap(s -> Arrays.stream(s.split("[^a-zA-Z]+"))).
                map(String::toLowerCase).
                filter(s -> !s.isBlank()).
                distinct().sorted().toList();
        System.out.println(mappedSentences);
    }
}
