package ru.alfabank.taks_w8.task6;

public abstract class AbstractNotifier implements Notifier {
    @Override
    public void notify(String to, String msg) {
        if (!to.isEmpty() && !msg.isEmpty()) {
            System.out.println("LOG: to=" + to + ", msg=" + msg);
            doNotify(to, msg);
        } else {
            System.out.println("Notification error");
        }
    }

    protected abstract void doNotify(String to, String msg);
}
