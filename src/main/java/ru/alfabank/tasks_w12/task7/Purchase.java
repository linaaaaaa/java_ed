package ru.alfabank.tasks_w12.task7;

public class Purchase {
    private String product;
    private int qty;

    public Purchase(String product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }
}
