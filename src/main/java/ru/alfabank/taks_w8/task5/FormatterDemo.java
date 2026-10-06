package ru.alfabank.taks_w8.task5;

public class FormatterDemo {
    static void main() {
        NumberFormatter f = NumberFormatter.hexUpper();
        System.out.println(f.join(new int[]{10, 15}));
        System.out.println(NumberFormatter.binary().format(5));
        System.out.println(new PrefixedFormatter("#").join(new int[]{1, 2, 3}));
    }
}
