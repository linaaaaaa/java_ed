package ru.alfabank.tasks_w7.task_6;

public class Child extends Base{
    static String who(){
        return "Child";
    }

    @Override
    String whoAmI(){
        return "Child";
    }
}
