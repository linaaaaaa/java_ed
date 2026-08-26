package ru.alfabank.tasks_w5;

import java.util.Arrays;

public class NumUtils {
    public void max(int... xs) {
        int[] xsCopy = Arrays.copyOf(xs, xs.length);
        Arrays.sort(xsCopy);
        System.out.println("int ..., " + xsCopy[xsCopy.length - 1]);
    }

    public void max(double... xs) {
        double[] xsCopy = Arrays.copyOf(xs, xs.length);
        Arrays.sort(xsCopy);
        System.out.println("double ..., " + xsCopy[xsCopy.length - 1]);
    }

    static void main() {
        NumUtils numUtils = new NumUtils();
        numUtils.max(1, 2);
        numUtils.max(1.0, 2);
        numUtils.max(new int[]{3, 1, 2});
    }
}
