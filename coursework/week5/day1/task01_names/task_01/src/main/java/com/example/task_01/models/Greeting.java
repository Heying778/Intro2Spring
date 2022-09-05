package com.example.task_01.models;

import java.sql.Time;

public class Greeting {
    private String name;
    private Time timeOfDay;

    public Greeting(String word) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greeting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String word) {
        this.name = name;
    }

    public Time getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(Time timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

}
