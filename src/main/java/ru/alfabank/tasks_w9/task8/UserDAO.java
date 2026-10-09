package ru.alfabank.tasks_w9.task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDAO {
    public String loadUserById(int id) throws IOException {
        String filePath = "src/main/resources/users/" + id + ".txt";
        String userData = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                userData += line + "\n";
            }
        } catch (IOException e) {
            throw e;
        }
        return userData;
    }
}
