package solutions.week07_sample_lab_exam.entities;

import java.util.ArrayList;

public class Order {
    private static int orderCount = 0;

    private int orderId;
    private ArrayList<Product> orderedItems;

    public Order(ArrayList<Product> items){
        Order.orderCount++;
        this.orderId = orderCount;

        if(items == null) {
            orderedItems = new ArrayList<>();
        }else{
            orderedItems = items;
            for (Product item : items) {
                if(item == null){
                    orderedItems.remove(item);
                }
            }
        }
    }

    public int getOrderId(){
        return this.orderId;
    }

    public double calcTotal(){
        double total = 0;
        for (Product orderedItem : orderedItems) {
            total += orderedItem.getProductPrice();
        }

        return total;
    }

    public boolean contains(Product product){
        if(orderedItems.contains(product)){
            return true;
        }

        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order{");
        sb.append("orderId=");
        sb.append(orderId);
        sb.append(", orderedItems=");
        sb.append(orderedItems);
        sb.append("}");

        return sb.toString();
    }
}
