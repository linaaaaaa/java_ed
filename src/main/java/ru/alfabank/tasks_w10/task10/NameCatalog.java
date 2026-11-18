package ru.alfabank.tasks_w10.task10;

import java.util.*;

public class NameCatalog {
    static void main() {
        String[] names = {"anna", "bob", "alice", "george", "bill"};
        Map<Character, List<String>> nameCatalog = new HashMap<>();
        for (String n : names) {
            Character firstCh = n.charAt(0);
            if (nameCatalog.containsKey(firstCh)) {
                nameCatalog.get(firstCh).add(n);
            } else {
                nameCatalog.put(firstCh, new ArrayList<>(Arrays.asList(n)));
            }
        }
        System.out.println(nameCatalog);
    }
}
