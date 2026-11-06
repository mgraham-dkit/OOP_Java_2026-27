package solutions.week07_sample_lab_exam.apps;

import solutions.week07_sample_lab_exam.entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductTester {
    static void main(String[] args) {
        // 1)
        Product p1 = new Product("PROD_001", "Chicken teriyaki bao", 3.45, "food");
        Product p2 = new Product("PROD_002", "Pork gyoza", 4.45, "food");
        Product p3 = new Product("003", "Crew neck tshirt", 9.95, "Clothing");
        Product p4 = new Product(null, "", -2.45, "Bad category");

        ArrayList<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        // 2)
        displayProducts(products);

        // 3)
        Scanner input = new Scanner(System.in);
        System.out.println("--- Now creating new Product ---");
        System.out.print("Product ID: ");
        String prodId = input.nextLine();
        System.out.print("Product name: ");
        String name = input.nextLine();
        System.out.print("Product category: ");
        String category = input.nextLine();
        System.out.print("Product unit price: ");
        double price = input.nextDouble();

        Product userProduct = new Product(prodId, name, price, category);
        products.add(userProduct);
        System.out.println("New product added!");
        System.out.println("Updated product list: ");

        // 4)
        displayProducts(products);
    }

    private static void displayProducts(ArrayList<Product> products) {
        for(Product product : products){
            System.out.println(product);
        }
    }
}
