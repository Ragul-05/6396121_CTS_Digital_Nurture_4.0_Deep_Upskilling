package DataStructures_Algorithms.E_Commerce_Platform;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- E-Commerce Product Search System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search by Product Name (Linear Search)");
            System.out.println("4. Search by Product Name (Binary Search)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();

                    productList.add(new Product(id, name, category));
                    System.out.println(" Product added.");
                    break;

                case 2:
                    System.out.println(" Product List:");
                    for (Product p : productList) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print(" Enter name to search (Linear): ");
                    String targetLinear = scanner.nextLine();
                    Product result1 = SearchUtil.linearSearch(productList.toArray(new Product[0]), targetLinear);
                    System.out.println(result1 != null ? result1 : " Product not found.");
                    break;

                case 4:
                    System.out.print(" Enter name to search (Binary): ");
                    String targetBinary = scanner.nextLine();

                    Product[] sortedArray = productList.toArray(new Product[0]);
                    SearchUtil.sortByName(sortedArray);

                    Product result2 = SearchUtil.binarySearch(sortedArray, targetBinary);
                    System.out.println(result2 != null ? result2 : " Product not found.");
                    break;

                case 5:
                    System.out.println(" Exiting...");
                    break;

                default:
                    System.out.println(" Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}
