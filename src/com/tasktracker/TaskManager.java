package com.tasktracker;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private StorageHandler storage;

    // Constructor: Carga las tareas existentes usando el storage.
    public TaskManager(StorageHandler storage) {
        this.storage = storage;
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        // Creates a new tasks with and ID and adds it to the list
        tasks.add(new Task(tasks.size() + 1, description, "TO-DO"));
    }

    public void updateTask(int id, String newDescription) {
        // Busca la tarea por ID. Si existe, cambia su descripción y actualiza 'updatedAt'.
    }

    public void updateTaskStatus(int id, String status) {
        // Cambia el estado (puedes usar un String o un Enum: TODO, IN_PROGRESS, DONE).
    }

    public void deleteTask(int id) {
        // Elimina la tarea de la lista.
    }

    public List<Task> listTasks(String statusFilter) {
        // Si el filtro es null, devuelve todas. Si no, filtra por el estado.
        return null;
    }

    // Método privado findTaskById(int id) para no repetir lógica de búsqueda.
}
