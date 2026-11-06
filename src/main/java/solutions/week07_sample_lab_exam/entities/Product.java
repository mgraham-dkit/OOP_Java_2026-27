package solutions.week07_sample_lab_exam.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    private static final ArrayList<String> VALID_CATEGORIES =
            new ArrayList<>(Arrays.asList("food", "clothing", "electronics", "toys"));

    private String productId;
    private String productName;
    private String productCategory;
    private double productPrice;

    public Product(String prodId, String prodName, double price, String prodCategory){
        // Validate price
        if(price <= 0){
            System.out.println("PRICE MUST BE GREATER THAN 0. DEFAULTING TO 1");
            price = 1;
        }

        // Validate name
        String dummyName = "DUMMY_PRODUCT_NAME";
        if(validateString(prodName)){
            System.out.println("PRODUCT NAME CANNOT BE BLANK");
            System.out.println("DEFAULTING TO DUMMY VALUE");
            prodName = dummyName;
        }

        // Validate product ID
        String prefix = "PROD_";
        if(validateString(prodId)){
            System.out.println("PRODUCT ID CANNOT BE BLANK");
            System.out.println("DEFAULTING TO DUMMY VALUE");
            prodId = prefix + "DUMMY";
        }else if(!prodId.startsWith("PROD_")){
            System.out.println("PRODUCT ID MUST START WITH " + prefix);
            prodId = prefix + prodId;
            System.out.println("AMENDING SUPPLIED ID TO " + prodId);
        }

        // Validate product category
        String defaultCategory = Product.VALID_CATEGORIES.getFirst();
        if(validateString(prodCategory)){
            System.out.println("PRODUCT CATEGORY CANNOT BE BLANK");
            System.out.println("SETTING TO DEFAULT VALUE");
            prodCategory = defaultCategory;
        }else if(!Product.VALID_CATEGORIES.contains(prodCategory.toLowerCase())){
            System.out.println("PRODUCT CATEGORY IS INVALID");
            System.out.println("SETTING TO DEFAULT VALUE");
            prodCategory = defaultCategory;
        }

        this.productId = prodId;
        this.productCategory = prodCategory;
        this.productName = prodName;
        this.productPrice = price;
    }

    private static boolean validateString(String text) {
        return text == null || text.isBlank();
    }

    public String getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public String getProductCategory(){
        return productCategory;
    }

    public double getProductPrice(){
        return productPrice;
    }
}
