package ru.alfabank.taks_w8.task6;

public class EmailNotifier extends AbstractNotifier {
    @Override
    protected void doNotify(String to, String msg) {
        System.out.println("EMAIL->" + to + ": " + msg);
    }
}
