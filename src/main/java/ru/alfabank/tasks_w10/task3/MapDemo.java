package ru.alfabank.tasks_w10.task3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main() {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Алиса", 12345);
        phoneBook.put("Боб", 67890);
        phoneBook.put("Чарли", 54321);
        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Боб"));
        System.out.println(phoneBook.containsKey("Дэйв"));
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Телефон: " + entry.getValue());
        }
        phoneBook.remove("Чарли");
        System.out.println(phoneBook);
        phoneBook.put("Алиса", 99999);
        System.out.println(phoneBook);
    }
}
