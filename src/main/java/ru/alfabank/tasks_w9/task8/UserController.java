package ru.alfabank.tasks_w9.task8;

public class UserController {

    static void main() {
        UserController uc = new UserController();
        uc.getUserData(1);
        uc.getUserData(2);
        uc.getUserData(13);
    }

    private void getUserData(int id) {
        try {
            System.out.println(new UserService().readUserData(id));
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}
