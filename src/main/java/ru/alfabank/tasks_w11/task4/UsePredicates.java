package ru.alfabank.tasks_w11.task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsePredicates<T> {
    public int countIf(List<T> list, Predicate<T> condition) {
        int count = 0;
        for (T t : list) {
            if (condition.test(t))
                count += 1;
        }
        return count;
    }

    static void main() {
        UsePredicates<Integer> upInt = new UsePredicates<>();
        List<Integer> nums = Arrays.asList(-1, 0, 5, 2, -3);
        int countPositive = upInt.countIf(nums, x -> x > 0);
        System.out.println(countPositive);

        UsePredicates<String> upString = new UsePredicates<>();
        List<String> words2 = Arrays.asList("one", "two", "three", "six");
        int countLen3 = upString.countIf(words2, w -> w.length() == 3);
        System.out.println(countLen3);
    }
}
