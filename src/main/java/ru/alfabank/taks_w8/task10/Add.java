package ru.alfabank.taks_w8.task10;

public class Add implements Operation {
    @Override
    public String name() {
        return "Add";
    }

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}
