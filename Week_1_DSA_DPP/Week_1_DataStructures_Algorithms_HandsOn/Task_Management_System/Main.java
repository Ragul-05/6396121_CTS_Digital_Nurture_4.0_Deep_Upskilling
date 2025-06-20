package Week_1_DataStructures_Algorithms_HandsOn.Task_Management_System;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Write API", "In Progress"));
        taskList.addTask(new Task(3, "Test Module", "Completed"));

        System.out.println(" All Tasks:");
        taskList.traverseTasks();

        System.out.println("\n Searching for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\n Deleting Task ID 1");
        boolean deleted = taskList.deleteTask(1);
        System.out.println(deleted ? "Task deleted." : "Task not found.");

        System.out.println("\n Updated Task List:");
        taskList.traverseTasks();
    }
}
