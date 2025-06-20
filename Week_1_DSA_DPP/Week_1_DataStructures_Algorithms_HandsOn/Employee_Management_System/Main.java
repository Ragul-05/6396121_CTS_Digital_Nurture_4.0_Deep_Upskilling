package Week_1_DataStructures_Algorithms_HandsOn.Employee_Management_System;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10); 

        manager.addEmployee(new Employee(101, "Alice", "Developer", 70000));
        manager.addEmployee(new Employee(102, "Bob", "Designer", 60000));
        manager.addEmployee(new Employee(103, "Charlie", "Manager", 90000));

        System.out.println("\n Employee List:");
        manager.displayEmployees();

        System.out.println("\n Searching for Employee ID 102:");
        Employee e = manager.searchEmployee(102);
        System.out.println(e != null ? e : " Employee not found");

        System.out.println("\n Deleting Employee ID 101");
        boolean deleted = manager.deleteEmployee(101);
        System.out.println(deleted ? " Employee deleted." : " Employee not found");

        System.out.println("\n Updated Employee List:");
        manager.displayEmployees();
    }
}

