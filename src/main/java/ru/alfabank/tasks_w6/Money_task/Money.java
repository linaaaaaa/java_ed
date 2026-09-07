package ru.alfabank.tasks_w6.Money_task;

public class Money {
    private final long CENTS;
    private final Currency CURRENCY;

    private Money(long cents, Currency currency) {
        this.CENTS = cents;
        this.CURRENCY = currency;
    }

    public static Money of(double amount, String currency) {
        return new Money((long)(amount*100),Currency.valueOf(currency));
    }

    public static Money ofCents(long cents, String currency) {
        return new Money(cents, Currency.valueOf(currency));
    }

    public static Money ofRubles(long rub, int kop) {
        return new Money(rub*100+kop,Currency.RUB);
    }

    public Money add(Money money) {
        if (CURRENCY != money.CURRENCY) {
            throw new IllegalArgumentException("Операция допустима только для одинаковых валют!");
        }
        return new Money(CENTS + money.CENTS, CURRENCY);
    }

    public Money multiply(int n) {
        return new Money(CENTS * n, CURRENCY);
    }

    public String toString() {
        double amount=(double)CENTS/100;
        return amount+ " " + CURRENCY;
    }
}
