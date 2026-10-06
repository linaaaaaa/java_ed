package ru.alfabank.taks_w8.task8;

public class DemoDiscounter {
    static void main() {
        System.out.println(DiscountPolicy.percent(10).apply(100.0));
        System.out.println(DiscountPolicy.threshold(200, 20).apply(150.0));
        System.out.println(DiscountPolicy.threshold(200, 20).apply(250.0));
    }
}
