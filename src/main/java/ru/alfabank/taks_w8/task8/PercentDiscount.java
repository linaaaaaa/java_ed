package ru.alfabank.taks_w8.task8;

public class PercentDiscount implements DiscountPolicy {
    private final int percent;

    public PercentDiscount(int percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount * (100 - percent) / 100;
    }
}
