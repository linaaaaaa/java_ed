package ru.alfabank.tasks_w5;

public class MathUtils {
    public int multiply(int a, int b) {
        return (int) multiply((double) a, (double) b);
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String a, String b) {
        double aDouble;
        double bDouble;
        try {
            aDouble = Double.parseDouble(a);
            bDouble = Double.parseDouble(b);
            return Double.toString(multiply(aDouble, bDouble));
        } catch (Exception e) {
            return e.toString();
        }
    }

    static void main() {
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.multiply(2, 3));
        System.out.println(mathUtils.multiply(2.5, 4.0));
        System.out.println(mathUtils.multiply("Hi", "3"));
    }
}
