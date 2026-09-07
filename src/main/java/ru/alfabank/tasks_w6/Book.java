package ru.alfabank.tasks_w6;

public class Book {
    private String title;
    private String author;
    private int pages;

    public void printInfo() {
        System.out.println("\"" + title + "\" - " + author + ", страниц: " + pages);
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
