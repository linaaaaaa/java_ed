package ru.alfabank.tasks_w8.task10;

public class Mul implements Operation {
    @Override
    public String name() {
        return "Mul";
    }

    @Override
    public double apply(double a, double b) {
        return a * b;
    }
}
