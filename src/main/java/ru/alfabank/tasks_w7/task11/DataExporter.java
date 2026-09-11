package ru.alfabank.tasks_w7.task11;

public abstract class DataExporter {
    final void export() {
        read();
        transform();
        write();
    }

    protected void read(){
        System.out.println("Read Data");
    };

    protected abstract void transform();

    protected abstract void write();
}
