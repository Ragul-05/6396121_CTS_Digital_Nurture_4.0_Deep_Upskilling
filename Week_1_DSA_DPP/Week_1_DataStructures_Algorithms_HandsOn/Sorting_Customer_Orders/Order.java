package Week_1_DataStructures_Algorithms_HandsOn.Sorting_Customer_Orders;

public class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order [ID=" + orderId + ", Name=" + customerName + ", Price=" + totalPrice + "]";
    }
}
