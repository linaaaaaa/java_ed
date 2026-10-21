package ru.alfabank.tasks_w10.task4;

import java.util.ArrayList;
import java.util.List;

public class PairTest {
    static void main() {
        Pair<String, Integer> personAge = new Pair<>("Alice", 30);
        List<Pair<String, Integer>> pairList = new ArrayList<>();
        pairList.add(personAge);
        pairList.add(new Pair<>("Max", 10));
        for (Pair<String, Integer> p : pairList) {
            System.out.println(p);
        }
        System.out.println(new Pair<Double, Double>((double) 5, (double) 10));
    }
}
