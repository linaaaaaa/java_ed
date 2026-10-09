package ru.alfabank.tasks_w8.task10;

import java.util.List;

public interface Operation {
    String name();

    double apply(double a, double b);

    static Operation add(double a, double b){
        return new Add();
    }

    static Operation mul(double a, double b){
        return new Mul();
    }

    static Operation pow(double a, double b){
        return new Pow();
    }

    static List<Operation> builtin() {
        return List.of(new Add(), new Mul(),new Pow());
    }
}
