package ru.alfabank.tasks_w7.Logger;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimestampLogger extends Logger{
    @Override
    public void log(String msg){
        msg="["+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))+"] "+msg;
        super.log(msg);
    }
}
