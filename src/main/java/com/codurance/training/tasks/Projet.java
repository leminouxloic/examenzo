package com.codurance.training.tasks;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Projet {
    public String name;
    public List<Task> tasks = new ArrayList<>();

    public Projet(String name){
        this.name = name;
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }
}
