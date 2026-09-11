package ru.alfabank.tasks_w7.task11;

public class DataExporterDemo {
    static void main() {
        new JsonExporter().export();
        DataExporter dataExporter=new CsvExporter();
        dataExporter.export();
    }
}
