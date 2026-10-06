package ru.alfabank.taks_w8.task5;

public interface NumberFormatter {
    String format(int v);

    default String join(int[] a) {
        String result = "";
        for (int x : a) {
            if (!result.isEmpty()) {
                result += ", ";
            }
            result += format(x);
        }
        return result;
    }

    static NumberFormatter decimal() {
        return new NumberFormatter() {
            @Override
            public String format(int v) {
                return Integer.toString(v);
            }
        };
    }

    static NumberFormatter binary() {
        return new NumberFormatter() {
            @Override
            public String format(int v) {
                return Integer.toBinaryString(v);
            }
        };
    }

    static NumberFormatter hexUpper() {
        return new NumberFormatter() {
            @Override
            public String format(int v) {
                return Integer.toHexString(v).toUpperCase();
            }
        };
    }
}
