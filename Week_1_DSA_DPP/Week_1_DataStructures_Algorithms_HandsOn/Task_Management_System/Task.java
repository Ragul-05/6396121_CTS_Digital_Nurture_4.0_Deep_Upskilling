package Week_1_DataStructures_Algorithms_HandsOn.Task_Management_System;
public class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [ID=" + taskId + ", Name=" + taskName + ", Status=" + status + "]";
    }
}
