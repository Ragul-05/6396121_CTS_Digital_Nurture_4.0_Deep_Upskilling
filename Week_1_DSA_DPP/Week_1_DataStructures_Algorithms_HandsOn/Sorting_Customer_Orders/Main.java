package Week_1_DataStructures_Algorithms_HandsOn.Sorting_Customer_Orders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.00),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 200.75)
        };

        System.out.println(" Original Orders:");
        SortUtils.printOrders(orders);

        // Bubble Sort
        System.out.println("\n Orders Sorted by Bubble Sort:");
        SortUtils.bubbleSort(orders);
        SortUtils.printOrders(orders);

        // Reset order
        orders = new Order[]{
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.00),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 200.75)
        };

        // Quick Sort
        System.out.println("\n Orders Sorted by Quick Sort:");
        SortUtils.quickSort(orders, 0, orders.length - 1);
        SortUtils.printOrders(orders);
    }
}
