package ru.alfabank.tasks_w12.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class task4 {
    public static Optional<Double> average(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(list.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }

    static void main() {
        //test 1
        average(List.of(1, 2, 3)).ifPresent(System.out::println);
        //test 2
        if (!average(new ArrayList<>()).isPresent()) {
            System.out.println("list is empty");
        }
    }
}
