package ru.alfabank.tasks_w7.task_7;

public class PaymentDemo {
    static void main() {
        System.out.println(new CashPayment(500).process());
        printReceipt(new CardPayment(799,"**** 1234"));
        Payment[] array={new CardPayment(100,"**** 1111"),new CashPayment(50)};
        for(Payment p:array){
            printReceipt(p);
        }
    }

    static void printReceipt(Payment p){
        System.out.println(p.process());
        if(p instanceof CardPayment){
            System.out.println("PAN: "+((CardPayment)p).getPanMasked());
        }
    }
}
