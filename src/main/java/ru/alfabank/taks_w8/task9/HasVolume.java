package ru.alfabank.taks_w8.task9;

public interface HasVolume {
    double volume();

    default double mass(double density) {
        return volume() * density;
    }
}
