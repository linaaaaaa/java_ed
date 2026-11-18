package ru.alfabank.tasks_w12.task9;

import java.util.ArrayList;
import java.util.List;

public class skipAndLimit<T> {
    static void main() {
        skipAndLimit<Integer> skipAndLimit = new skipAndLimit<>();
        System.out.println(skipAndLimit.page(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2, 3));
        System.out.println(skipAndLimit.page(List.of(1, 2, 3, 4, 5), 2, 3));
        //test exceptions:
        System.out.println(skipAndLimit.page(List.of(1, 2, 3, 4, 5), 2, -1));
        skipAndLimit.page(null, 1, 1);
    }

    List<T> page(List<T> data, int page, int size) {
        try {
            if (page < 1 || size <= 0 || data == null) {
                throw new IllegalArgumentException("[skipAndLimit.page]Incorrect params");
            }
            List<T> resultingList = data.stream().skip((long) (page - 1) * size).limit(size).toList();
            if (resultingList.size() >= size) {
                return resultingList;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>(0);
    }
}
