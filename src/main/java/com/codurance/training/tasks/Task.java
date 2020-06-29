package com.codurance.training.tasks;

public final class Task {
    private final long id;
    private final String description;
    private boolean done;
    private static int taskId;

    public Task(String description, boolean done) {
        this.id = nextTaskId();
        this.description = description;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString(){
        String etat = this.isDone() ? "x" : " ";
        return "    ["+etat+"] "+this.getId()+": "+this.getDescription()+"%n";
    }

    public static long nextTaskId(){
        return ++taskId;
    }
}
