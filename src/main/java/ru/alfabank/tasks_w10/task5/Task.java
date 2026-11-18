package ru.alfabank.tasks_w10.task5;

import java.util.Comparator;

public class Task implements Comparable<Task> {
    private String title;
    private int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Task o) {
        if(priority>=o.priority){
            if(priority==o.priority){
                return 0;
            }
            else return 1;
        }
        else return -1;
    }

    @Override
    public String toString(){
        return title+": "+priority;
    }
}
