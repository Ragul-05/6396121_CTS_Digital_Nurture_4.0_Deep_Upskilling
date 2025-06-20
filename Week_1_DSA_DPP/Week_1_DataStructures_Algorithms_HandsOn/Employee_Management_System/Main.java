package Week_1_DataStructures_Algorithms_HandsOn.Employee_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager(100); 

        int choice;
        do {
            System.out.println("\n====== Employee Management System ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Position: ");
                    String position = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, position, salary);
                    if (manager.addEmployee(emp)) {
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println(" Could not add employee.");
                    }
                    break;

                case 2:
                    System.out.println("\n Employee List:");
                    manager.displayEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    Employee found = manager.searchEmployee(searchId);
                    System.out.println(found != null ? found : " Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = manager.deleteEmployee(deleteId);
                    System.out.println(deleted ? " Employee deleted." : " Employee not found.");
                    break;

                case 5:
                    System.out.println(" Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
