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

    public void setDone(String idString, boolean done) {
        int id = Integer.parseInt(idString);
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    task.setDone(done);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %d.", id);
        out.println();
    }
}
