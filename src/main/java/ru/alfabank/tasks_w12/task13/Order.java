package ru.alfabank.tasks_w12.task13;

import java.sql.Date;

public class Order {
    private int id;
    private String userEmail;
    private double total;
    private Date createdAt;

    public Order(int id, String userEmail, double total, Date createdAt) {
        this.id = id;
        this.userEmail = userEmail;
        this.total = total;
        this.createdAt = createdAt;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public double getTotal() {
        return total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String toString(){
        return "ID: "+id+", user: "+userEmail+", total: "+total+", created at "+createdAt;
    }
}
