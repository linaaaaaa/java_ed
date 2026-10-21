package ru.alfabank.tasks_w10.task12;

import java.util.*;

public class SplitAndSort {
    public static List<Map.Entry<String, Integer>> splitAndSort(String s) {
        Map<String, Integer> wordsFrequencyMap = new HashMap<>();
        for (String word : Arrays.asList(s.split("[^A-Za-z]+"))) {
            wordsFrequencyMap.put(word, wordsFrequencyMap.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedEntriesByFreq = new ArrayList<>(List.copyOf(wordsFrequencyMap.entrySet()));
        Collections.sort(sortedEntriesByFreq, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });
        return sortedEntriesByFreq;
    }
}
