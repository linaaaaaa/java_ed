package ru.alfabank.taks_w8.task8;

public class NoDiscount implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount;
    }
}
