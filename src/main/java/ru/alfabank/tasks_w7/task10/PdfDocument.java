package ru.alfabank.tasks_w7.task10;

public class PdfDocument extends Document {
    private String version;

    public PdfDocument(String version){
        this.version=version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public PdfDocument copy(){
        return new PdfDocument(version);
    }
}
