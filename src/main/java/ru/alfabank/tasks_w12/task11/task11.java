package ru.alfabank.tasks_w12.task11;

import java.util.Optional;

public class task11 {
    static void main() {
        User u = new User(new Profile(new Contact("a@b.c")));
        System.out.println((new task11().findEmail(u)).get());
        System.out.println((new task11().findEmail(null)).get());
    }

    Optional<String> findEmail(User u) {
        return Optional.of(Optional.ofNullable(u).orElse(new User()).getProfile().getContact().getEmail());
    }
}
