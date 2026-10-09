package ru.alfabank.tasks_w9.task12;

public class DemoTxRollbackException {
    static void main() {
        System.out.println("Scenario 1:");
        try (Tx tx = new Tx()) {
            throw new IllegalStateException("work failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable err : e.getSuppressed()) {
                System.out.println(err.getMessage());
            }
        }
        System.out.println("Scenario 2:");
        try (Tx tx = new Tx()) {
            tx.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
