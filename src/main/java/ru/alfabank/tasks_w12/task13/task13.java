package ru.alfabank.tasks_w12.task13;

import java.sql.Date;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class task13 {
    static void main() {
        List<Order> orders = List.of(new Order(1, "a@b.com", 100.00, Date.valueOf("2026-01-01")),
                new Order(2, "test", 11, Date.valueOf("2025-10-19")),
                new Order(3, "a@b.com", 1000, Date.valueOf("2026-10-05")),
                new Order(4, "test", 12, Date.valueOf("2020-01-01")));
        List<Order> lastUserOrders = orders.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.groupingBy(Order::getUserEmail, Collectors.maxBy(Comparator.comparing(Order::getCreatedAt))),
                        m -> m.values().stream().map(Optional::get))).toList();
        System.out.println(lastUserOrders);
    }
}
