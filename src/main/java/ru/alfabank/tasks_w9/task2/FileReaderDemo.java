package ru.alfabank.tasks_w9.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    static void main() {
        //test non-existing file
        //try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/ru/alfabank/tasks_w9/task1/sample.txt"))) {
            String line = br.readLine();
            System.out.println("Прочитано: " + line);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
        }
    }
}
