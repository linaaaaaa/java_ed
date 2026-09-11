package ru.alfabank.tasks_w7.task_7;

public class CardPayment extends Payment{
    private String panMasked;

    @Override
    String process() {
        return "Paid by card: "+super.amount;
    }

    public String getPanMasked() {
        return panMasked;
    }

    public CardPayment(double amount, String panMasked){
        super(amount);
        this.panMasked=panMasked;
    }
}
