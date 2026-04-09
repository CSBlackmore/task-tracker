package com.tasktracker;

import java.util.List;

public class TaskManager {
    // Atributo: private List<Task> tasks;
    // Atributo: private StorageHandler storage; (El encargado de guardar)

    // Constructor: Carga las tareas existentes usando el storage.

    public void addTask(String description) {
        // Crea una nueva Task, le asigna un ID único y la guarda en la lista.
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
