package ru.alfabank.tasks_w12.task2;

import java.util.*;

public class task2 {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //сумма четных чисел
        System.out.println(numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum());
        //max число
        System.out.println(numbers.stream().max(Integer::compare).get());
        //кол-во чисел, кратных 3
        System.out.println(numbers.stream().filter(n -> n % 3 == 0).count());
    }
}
