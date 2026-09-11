package ru.alfabank.tasks_w6.Money_task;

public class Money {
    private final long cents;
    private final Currency currency;

    private Money(long cents, Currency currency) {
        this.cents = cents;
        this.currency = currency;
    }

    public static Money of(double amount, String currency) {
        return new Money((long) (amount * 100), Currency.valueOf(currency));
    }

    public static Money ofCents(long cents, String currency) {
        return new Money(cents, Currency.valueOf(currency));
    }

    public static Money ofRubles(long rub, int kop) {
        return new Money(rub * 100 + kop, Currency.RUB);
    }

    public Money add(Money money) {
        if (currency != money.currency) {
            throw new IllegalArgumentException("Операция допустима только для одинаковых валют!");
        }
        return new Money(cents + money.cents, currency);
    }

    public Money multiply(int n) {
        return new Money(cents * n, currency);
    }

    public String toString() {
        double amount = (double) cents / 100;
        return amount + " " + currency;
    }
}
