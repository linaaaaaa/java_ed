package ru.alfabank.tasks_w9.task12;

public class Tx implements AutoCloseable {
    private String state = "ACTIVE";

    @Override
    public void close() throws TxRollbackException {
        if (!state.equalsIgnoreCase("COMMITTED")) {
            System.out.println("rollback");
            throw new TxRollbackException("rollback failed");
        }
    }

    public void commit() {
        state = "COMMITTED";
        System.out.println(state);
    }
}
