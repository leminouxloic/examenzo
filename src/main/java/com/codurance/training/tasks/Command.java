package com.codurance.training.tasks;

public class Command {

    public static void help() {
        out.println("Commands:");
        out.println("  show");
        out.println("  add project <project name>");
        out.println("  add task <project name> <task description>");
        out.println("  check <task ID>");
        out.println("  uncheck <task ID>");
        out.println();
    }

    public static void show(List<Projet> projets) {
        for (Projet projet : projets) {
            out.println(projet.toString());
        }
    }

    public static void check(List<Projet> projets, String idString) {
        Projet.setDone(projets, idString, true);
    }

    public static void uncheck(List<Projet> projets, String idString) {
        Projet.setDone(projets, idString, false);
    }

    public static void error(String command) {
        out.printf("I don't know what the command \"%s\" is.", command);
        out.println();
    }

    public static void add(String commandLine) {
        String[] subcommandRest = commandLine.split(" ", 2);
        String subcommand = subcommandRest[0];
        if (subcommand.equals("project")) {
            projets.add(new Projet(subcommandRest[1]));
        } else if (subcommand.equals("task")) {
            String[] projectTask = subcommandRest[1].split(" ", 2);
            for(Projet projet : projets){
                if(projet.name == projectTask[0]){
                    projet.addTask(projectTask[1]);
                }
            }
        }
    }
}
