package ru.alfabank.tasks_w8.task6;

public class SMSNotifier extends AbstractNotifier {
    @Override
    protected void doNotify(String to, String msg) {
        System.out.println("SMS->" + to + ": " + msg);
    }
}
