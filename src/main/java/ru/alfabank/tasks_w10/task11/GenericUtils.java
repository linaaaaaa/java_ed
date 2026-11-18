package ru.alfabank.tasks_w10.task11;

import java.util.Arrays;
import java.util.List;

public class GenericUtils {
    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        if (dst.size() < src.size()) throw new IllegalArgumentException();
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    static void main() {
        List<Number> destList = Arrays.asList(new Number[5]);
        List<Integer> srcList = Arrays.asList(1, 2, 3);
        GenericUtils.copy(destList, srcList);
        System.out.println(srcList);
        System.out.println(destList);
    }
}
