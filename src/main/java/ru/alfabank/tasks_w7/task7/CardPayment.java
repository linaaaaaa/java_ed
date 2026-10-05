package ru.alfabank.tasks_w7.task7;

public class CardPayment extends Payment{
    private String panMasked;

    public CardPayment(double amount, String panMasked){
        super(amount);
        this.panMasked=panMasked;
    }

    public String getPanMasked() {
        return panMasked;
    }

    @Override
    String process() {
        return "Paid by card: "+super.amount;
    }
}
