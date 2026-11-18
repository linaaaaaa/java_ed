package ru.alfabank.tasks_w12.task7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task7 {
    static void main() {
        List<Purchase> purchases = List.of(new Purchase("apple", 1), new Purchase("banana", 2),
                new Purchase("apple", 3));
        Map<String, Integer> purchasesMap = purchases.stream().collect(Collectors.toMap(Purchase::getProduct, Purchase::getQty, Integer::sum));
        System.out.println(purchasesMap);
    }
}
