package ru.alfabank.tasks_w9.task13;

public class DemoSafeIO {
    static void main() {
        try {
            System.out.println(SafeIO.readFirstLineUnchecked("nofile"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable th : e.getSuppressed()) {
                System.out.println(th.getMessage());
            }
        }
        try {
            System.out.println(SafeIO.parseIntFromFileUnchecked("src/main/resources/123.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable th : e.getSuppressed()) {
                System.out.println(th.getMessage());
            }
        }
        try {
            System.out.println(SafeIO.parseIntFromFileUnchecked("src/main/resources/abc.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable th : e.getSuppressed()) {
                System.out.println(th.getMessage());
            }
        }
    }
}
