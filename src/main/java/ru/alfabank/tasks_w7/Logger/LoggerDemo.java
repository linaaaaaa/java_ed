package ru.alfabank.tasks_w7.Logger;

public class LoggerDemo {
    static void main() {
        new Logger().log("Hello");
        new TimestampLogger().log("Started");
        Logger l=new TimestampLogger();
        l.log("PolymorphismTest");
    }
}
