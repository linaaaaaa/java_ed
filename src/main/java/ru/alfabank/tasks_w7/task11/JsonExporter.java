package ru.alfabank.tasks_w7.task11;

public class JsonExporter extends DataExporter{
    @Override
    protected void write() {
        System.out.println("Write JSON");
    }

    @Override
    protected void transform() {
        System.out.println("Transform JSON");
    }

//    task test that export cannot be overridden
//    @Override
//    void export() {
//        transform();
//        write();
//    }

}
