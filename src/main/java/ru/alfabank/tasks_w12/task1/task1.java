package ru.alfabank.tasks_w12.task1;

import java.util.Arrays;
import java.util.List;

public class task1 {
    static void main() {
        List<String> names = Arrays.asList("alice", "Bob", "alex ", "Charlie", "bob","ALICE");
        List<String> filteredNames=names.stream().map(s->s.trim().toUpperCase()).filter(s->s.startsWith("A")).distinct().toList();
        System.out.println(filteredNames);
    }
}
