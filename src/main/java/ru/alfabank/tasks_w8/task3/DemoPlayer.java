package ru.alfabank.tasks_w8.task3;

public class DemoPlayer {
    static void main() {
        Player player = new Player();
        player.play();
        player.record();
        Playable playable = player;
        playable.play();
        Recordable recordable = player;
        recordable.record();
    }
}
