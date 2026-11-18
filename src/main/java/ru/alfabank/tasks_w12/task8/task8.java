package ru.alfabank.tasks_w12.task8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task8 {
    static void main() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //test 2nd list
        //nums=List.of(-3,0,2,7);
        Map<Boolean, List<Integer>> numsMapped = nums.stream()
                .collect(
                        Collectors.partitioningBy(n -> n > 1 &&
                                !IntStream.rangeClosed(2, (int) Math.sqrt(n)).anyMatch(d -> n % d == 0)));
        System.out.println(numsMapped);
    }
}
