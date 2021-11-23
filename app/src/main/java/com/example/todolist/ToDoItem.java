package com.example.todolist;

import android.text.format.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class ToDoItem {

    private String description;
    private boolean isComplete;
    private long id;
    private long timeStamp;

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public ToDoItem(String description, boolean isComplete) {
        this.description = description;
        this.isComplete = isComplete;
        this.id = id;
        Calendar date = Calendar.getInstance();
        this.timeStamp = date.getTimeInMillis();
    }

    public ToDoItem(String description, boolean isComplete, long id, long timeStamp) {
        this.description = description;
        this.isComplete = isComplete;
        this.id = id;
        this.timeStamp = timeStamp;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void toggleComplete() {
        isComplete = !isComplete;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return getDescription();
    }

}
