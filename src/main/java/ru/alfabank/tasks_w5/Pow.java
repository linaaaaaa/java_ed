package ru.alfabank.tasks_w5;

public class Pow {
    public double pow(double a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        if (n < 0 && a == 0) {
            System.out.println("Incorrect input");
            System.exit(0);
        } else if (n < 0) {
            return 1 / pow(a, -n);
        } else if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return a * pow(a * a, (n - 1) / 2);
        }
        return a;
    }

    static void main() {
        Pow p = new Pow();
        System.out.println(p.pow(2, 10));
        System.out.println(p.pow(2, -3));
        System.out.println(p.pow(0, 0));
    }
}
