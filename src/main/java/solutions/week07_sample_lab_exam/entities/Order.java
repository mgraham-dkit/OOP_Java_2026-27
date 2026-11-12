package solutions.week07_sample_lab_exam.entities;

import java.util.ArrayList;

public class Order {
    // Variables listed in UML diagram
    // - means private so these must be private variables
    // __ (underlined) means static, so orderCount must be marked as static
    private static int orderCount = 0;

    private int orderId;
    private ArrayList<Product> orderedItems;

    public Order(ArrayList<Product> items){
        // Not mentioned, but implied!
        // Order count provides logic for order ID
        Order.orderCount++;
        this.orderId = orderCount;

        // A supplied ordered product list may be null. Where it is, create a new blank one
        if(items == null) {
            orderedItems = new ArrayList<>();
        }else{
            orderedItems = items;
            // An order's product list cannot contain null. If null is present, remove it
            for (Product item : items) {
                if(item == null){
                    orderedItems.remove(item);
                }
            }
        }
    }

    // Getter method listed in UML diagram with this signature
    public int getOrderId(){
        return this.orderId;
    }

    // Method listed in UML diagram with this signature
    public double calcTotal(){
        // Based on application step #5 - calculate total price for order
        // Total price means adding price of every product in the order
        double total = 0;
        for (Product orderedItem : orderedItems) {
            total += orderedItem.getProductPrice();
        }

        return total;
    }

    // Method listed in UML diagram with this signature
    public boolean contains(Product product){
        // Based on logic in application step #3
        // You need to be able to check if a specific product is in an order
        if(product == null){
            return false;

        }
        if(orderedItems.contains(product)){
            return true;
        }

        return false;
    }

    // Method listed in UML diagram with this signature
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // standard toString structure - toString should usually follow this format
        sb.append("Order{");
        sb.append("orderId=");
        sb.append(orderId);
        sb.append(", orderedItems=");
        sb.append(orderedItems);
        sb.append("}");

        return sb.toString();
    }
}
