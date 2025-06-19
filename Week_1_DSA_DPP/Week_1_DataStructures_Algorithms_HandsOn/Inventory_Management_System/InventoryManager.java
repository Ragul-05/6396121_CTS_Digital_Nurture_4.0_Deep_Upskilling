package Week_1_DataStructures_Algorithms_HandsOn.Inventory_Management_System;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        if (!inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added.");
        } else {
            System.out.println("Product ID already exists!");
        }
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found!");
        }
    }

    // View All Products
    public void viewInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}