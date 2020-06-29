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
}
