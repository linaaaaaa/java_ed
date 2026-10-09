package ru.alfabank.tasks_w9.task4;

public class Calculation {
    public double divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    static void main() {
        System.out.println(new Calculation().divide(3,2));
        try {
            System.out.println(new Calculation().divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
    }
}
