package ru.alfabank.tasks_w8.task6;

public class DemoAbstractNotifier {
    static void main() {
        new EmailNotifier().notify("user@ex.com", "Hi");
        new SMSNotifier().notify("+7999", "Hi");
        new EmailNotifier().notify("", "test validation");
    }
}
