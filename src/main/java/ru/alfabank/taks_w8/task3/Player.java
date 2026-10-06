package ru.alfabank.taks_w8.task3;

public class Player implements Recordable, Playable {
    @Override
    public void play() {
        System.out.println("Playback started");
    }

    @Override
    public void record() {
        System.out.println("Recording started");
    }
}
