package ru.alfabank.tasks_w9.task7;

import java.io.IOException;

public class LeakProneResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new IOException("close failed!");
    }
}
