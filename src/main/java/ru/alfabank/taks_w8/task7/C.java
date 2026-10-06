package ru.alfabank.taks_w8.task7;

public class C implements A, B {
    public String id() {
        return A.super.id() + "&" + B.super.id();
    }
}
