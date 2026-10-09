package ru.alfabank.tasks_w9.task8;

import java.io.IOException;

public class UserService {
    public String readUserData(int id) {
        try {
            String userData = new UserDAO().loadUserById(id);
            if (userData.trim().isEmpty()) {
                userData += "No data found";
            }
            userData = "User " + id + ":\n" + userData;
            return userData;
        } catch (IOException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
}
