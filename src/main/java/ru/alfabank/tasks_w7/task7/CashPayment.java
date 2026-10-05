package ru.alfabank.tasks_w7.task7;

public class CashPayment extends Payment{
    public CashPayment(double amount){
        super(amount);
    }

    @Override
    String process() {
        return "Paid in cash: "+super.amount;
    }
}
