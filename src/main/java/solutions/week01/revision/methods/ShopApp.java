package solutions.week01.revision.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] names = {"TV", "Phone", "Laptop", "Watch", "Lollipop"};
        double [] prices = {200, 75, 1300, 25, .50};

        System.out.println("Please enter the price threshold: ");
        double requiredPrice = input.nextDouble();

        ArrayList<String> results = ShopUtils.findGreater(names, prices, requiredPrice);
        System.out.println("Products with price over " + requiredPrice);
        for (String result : results) {
            System.out.println(result);

        }
    }
}
