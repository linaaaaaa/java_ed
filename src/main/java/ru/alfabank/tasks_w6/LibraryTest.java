package ru.alfabank.tasks_w6;

public class LibraryTest {
    static void main() {
        Book book_1=new Book("Преступление и наказание","Ф.М. Достоевский",300);
        Book book_2=new Book();
        book_1.printInfo();
        book_2.printInfo();
        book_2.setTitle("Народные сказки");
        book_2.setPages(50);
        System.out.println(book_2.getTitle()+", "+book_2.getPages());
    }
}
