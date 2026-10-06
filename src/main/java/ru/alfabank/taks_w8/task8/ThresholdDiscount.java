package ru.alfabank.taks_w8.task8;

public class ThresholdDiscount implements DiscountPolicy {
    private final double threshold;
    private final int percent;

    public ThresholdDiscount(double threshold, int percent) {
        this.threshold = threshold;
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        if (amount >= threshold) {
            return amount * (100 - percent) / 100;
        } else {
            return amount;
        }
    }
}
