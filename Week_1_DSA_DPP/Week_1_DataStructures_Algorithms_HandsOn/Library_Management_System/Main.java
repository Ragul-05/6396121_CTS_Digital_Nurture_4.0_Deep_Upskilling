package Week_1_DataStructures_Algorithms_HandsOn.Library_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = {
            new Book(101, "Harry Potter", "J.K. Rowling"),
            new Book(102, "The Hobbit", "J.R.R. Tolkien"),
            new Book(103, "The Alchemist", "Paulo Coelho"),
            new Book(104, "1984", "George Orwell")
        };

        System.out.print("Enter book title to search: ");
        String searchTitle = sc.nextLine();

        System.out.println("\n Using Linear Search:");
        Book foundLinear = SearchUtils.linearSearchByTitle(books, searchTitle);
        System.out.println(foundLinear != null ? foundLinear : " Book not found");
        SearchUtils.sortByTitle(books);

        System.out.println("\n Using Binary Search (after sorting):");
        Book foundBinary = SearchUtils.binarySearchByTitle(books, searchTitle);
        System.out.println(foundBinary != null ? foundBinary : " Book not found");

        sc.close();
    }
}

