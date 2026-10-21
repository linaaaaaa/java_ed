package ru.alfabank.tasks_w10.task2;

import java.util.*;

public class SetDemo {
    static void main() {
        Set<String> uniqueWords = new HashSet<>();
        String text = "java java collections list set set";
        String[] textArray = text.split(" ");
        TreeSet<String> uniqueWordsTree = new TreeSet<>();
        for (String s : textArray) {
            uniqueWords.add(s);
            uniqueWordsTree.add(s);
        }
        System.out.println(uniqueWords.size() + ": " + uniqueWords);
        System.out.println(uniqueWordsTree);
    }
}
