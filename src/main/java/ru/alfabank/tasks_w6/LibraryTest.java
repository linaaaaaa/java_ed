package ru.alfabank.tasks_w6;

public class LibraryTest {
    static void main() {
        Book сrimeAndPunishment = new Book("Преступление и наказание", "Ф.М. Достоевский", 300);
        Book book2 = new Book();
        сrimeAndPunishment.printInfo();
        book2.printInfo();
        book2.setTitle("Народные сказки");
        book2.setPages(50);
        System.out.println(book2.getTitle() + ", " + book2.getPages());
    }
}
