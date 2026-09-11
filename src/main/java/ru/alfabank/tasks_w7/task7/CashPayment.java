package ru.alfabank.tasks_w7.task7;

public class CashPayment extends Payment{
    @Override
    String process() {
        return "Paid in cash: "+super.amount;
    }

    public CashPayment(double amount){
        super(amount);
    }
}
