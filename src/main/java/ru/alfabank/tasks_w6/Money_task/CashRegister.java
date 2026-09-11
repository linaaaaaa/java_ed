package ru.alfabank.tasks_w6.Money_task;

public class CashRegister {
    static void main() {
        System.out.println(Money.of(199.99, "RUB").add(Money.of(0.01, "RUB")));
        //test exception
        // System.out.println(Money.of(10,"USD").add(Money.of(5,"EUR")));
        System.out.println(Money.ofCents(2500, "RUB").multiply(3));
    }
}
