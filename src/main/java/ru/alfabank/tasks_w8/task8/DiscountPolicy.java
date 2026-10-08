package ru.alfabank.tasks_w8.task8;

public interface DiscountPolicy {
    double apply(double amount);

    static DiscountPolicy none() {
        return new NoDiscount();
    }

    static DiscountPolicy percent(int p) {
        return new PercentDiscount(p);
    }

    static DiscountPolicy threshold(double threshold, int p) {
        return new ThresholdDiscount(threshold, p);
    }
}
