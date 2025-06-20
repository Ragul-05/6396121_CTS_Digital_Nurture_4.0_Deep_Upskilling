package Week_1_DataStructures_Algorithms_HandsOn.Task_Management_System;

public class TaskLinkedList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null)
            current = current.next;

        current.next = newNode;
    }


    public Task searchTask(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == id)
                return current.task;
            current = current.next;
        }
        return null;
    }

  
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    
    public boolean deleteTask(int id) {
        if (head == null)
            return false;

        if (head.task.taskId == id) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.task.taskId != id) {
            current = current.next;
        }

        if (current.next == null)
            return false;

        current.next = current.next.next;
        return true;
    }
}
