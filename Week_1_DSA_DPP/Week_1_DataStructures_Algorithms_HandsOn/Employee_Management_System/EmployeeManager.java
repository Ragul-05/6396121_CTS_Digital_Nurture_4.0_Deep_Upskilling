package Week_1_DataStructures_Algorithms_HandsOn.Employee_Management_System;

public class EmployeeManager {
    private Employee[] employees;
    private int size; 

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean addEmployee(Employee emp) {
        if (size >= employees.length) {
            System.out.println(" Employee list is full.");
            return false;
        }
        employees[size++] = emp;
        return true;
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id)
                return employees[i];
        }
        return null;
    }

    public void displayEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {}
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                return true;
            }
        return false;
    }
}
