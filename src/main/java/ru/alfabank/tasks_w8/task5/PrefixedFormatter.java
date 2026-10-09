package ru.alfabank.tasks_w8.task5;

public class PrefixedFormatter implements NumberFormatter{
    private String prefix;

    public PrefixedFormatter(String pref){
        prefix=pref;
    }

    @Override
    public String format(int v){
        return prefix+v;
    }
}
