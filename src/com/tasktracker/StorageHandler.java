package com.tasktracker;

import java.util.List;

public class StorageHandler {
    private final String FILE_PATH = "tasks.json";

    public void saveTasks(List<Task> tasks) {
        // Convierte la lista a formato JSON y la escribe en el archivo.
    }

    public List<Task> loadTasks() {
        // Lee el archivo, convierte el JSON a objetos Task y devuelve la lista.
        // Si el archivo no existe, devuelve una lista vacía.
        return null;
    }
}
