package ru.alfabank.tasks_w5;

public class DigitsSum {
    public int digitSum(int n) {
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        sum += n % 10;
        if (n / 10 > 0) {
            sum += digitSum(n / 10);
        }
        return sum;
    }

    //sum=5; ds(12343+2+1)
    public int digitSumIter(int n) {
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        do {
            sum += n % 10;
            n = n / 10;
        }
        while (n > 0);
        return sum;
    }

    public int digitalRoot(int n) {
        n = digitSum(n);
        if (n / 10 > 0) {
            n = digitalRoot(n);
        }
        return n;
    }

    static void main() {
        DigitsSum ds = new DigitsSum();
        System.out.println("digitSum: " + ds.digitSum(12345) + ", digitalRoot: " + ds.digitalRoot(12345));
        System.out.println(ds.digitSum(0) + ds.digitalRoot(0));
        System.out.println(ds.digitSum(-409));
    }
}
