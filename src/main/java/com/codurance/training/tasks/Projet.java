package com.codurance.training.tasks;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Projet {
    public String name;
    public List<Task> tasks = new ArrayList<>();

    private void addTask(String description) {
        List<Task> projectTasks = taskList.tasks.get(project);
        if (projectTasks == null) {
            taskList.out.printf("Could not find a project with the name \"%s\".", project);
            taskList.out.println();
            return;
        }
        projectTasks.add(new Task(taskList.nextId(), description, false));
    }
}
