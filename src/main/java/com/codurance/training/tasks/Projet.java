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

    public static void setDone(List<Projet> projets,String idString, boolean done) {
        int id = Integer.parseInt(idString);
        for (Projet projet : projets) {
            for (Task task : projet.tasks) {
                if (task.getId() == id) {
                    task.setDone(done);
                }
            }
        }
        out.printf("Could not find a task with an ID of %d.", id);
        out.println();
    }

    public String toString() {
        out.println(project.getKey());
        for (Task task : project.getValue()) {
            out.printf(task.toString());
        }
        out.println();
    }
}
