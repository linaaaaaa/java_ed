package ru.alfabank.tasks_w9.task11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVParser {
    private static HashMap<String, Integer> parsedLines = new HashMap<>();
    private static HashMap<String, String> errorLines = new HashMap<>();

    static void main() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/people.txt"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                try {
                    int splitIndex = line.indexOf(',');
                    if (splitIndex > 0) {
                        int age = Integer.parseInt(line.substring(splitIndex + 1));
                        parsedLines.put(line.substring(0, splitIndex), age);
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    errorLines.put(line, e.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error on file read: " + e.getMessage());
        } finally {
            if (!parsedLines.isEmpty()) {
                System.out.println("Успешно обработано строк: " + parsedLines.size());
                System.out.println(parsedLines);
            }
            if (!errorLines.isEmpty()) {
                System.out.println("Ошибки: " + errorLines.size());
                System.out.println(errorLines);
            }
        }
    }
}
