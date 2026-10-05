package ru.alfabank.tasks_w7.task11;

public class CsvExporter extends DataExporter{
    @Override
    protected void transform() {
        System.out.println("Transform CSV");
    }

    @Override
    protected void write() {
    }

    @Override
    protected void read() {
        System.out.println("Read CSV");
    }
}
