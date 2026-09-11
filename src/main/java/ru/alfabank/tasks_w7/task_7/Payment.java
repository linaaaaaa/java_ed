package ru.alfabank.tasks_w7.task_7;

public abstract class Payment {
    double amount;
    abstract String process();
    public Payment(double amount){
        this.amount=amount;
    }
}