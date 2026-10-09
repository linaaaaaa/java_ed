package ru.alfabank.tasks_w9.task7;

import java.io.IOException;

public class DemoLeak {
    static void main() {
        try (LeakProneResource leak = new LeakProneResource()) {
            throw new IOException("work failed!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable th : e.getSuppressed()) {
                System.out.println(th.getMessage());
            }
        }
    }
}
