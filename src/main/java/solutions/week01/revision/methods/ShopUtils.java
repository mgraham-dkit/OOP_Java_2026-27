package solutions.week01.revision.methods;

import java.util.ArrayList;

public class ShopUtils {
    public static ArrayList<String> findGreater(String [] names, double [] prices, double reqPrice){
        ArrayList<String> expensiveNames = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > reqPrice){
                expensiveNames.add(names[i]);
            }
        }

        return expensiveNames;
    }
}
