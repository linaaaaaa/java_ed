package ru.alfabank.taks_w8.task10;

public class Pow implements Operation {
    @Override
    public String name() {
        return "Pow";
    }

    @Override
    public double apply(double a, double b) {
        return Math.pow(a,b);
    }
}
