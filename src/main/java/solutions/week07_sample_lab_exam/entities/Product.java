package solutions.week07_sample_lab_exam.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Product {
    // Variables listed in UML diagram
    // - means private so these must be private variables
    // __ (underlined) means static, so valid categories must be marked as static
    // All uppercase variable name means constant - VALID_CATEGORIES must be marked as final
    // Values (food, clothing etc) are supplied by Category Notes in spec
    private static final ArrayList<String> VALID_CATEGORIES =
            new ArrayList<>(Arrays.asList("food", "clothing", "electronics", "toys"));

    private String productId;
    private String productName;
    private String productCategory;
    private double productPrice;

    // Constructor listed with this signature in UML diagram
    public Product(String prodId, String prodName, double price, String prodCategory){
        // Validation as per spec
        // Validate price
        if(price <= 0){
            System.out.print("INVALID PRICE \"" + price + "\". ");
            System.out.println("PRICE MUST BE GREATER THAN 0. DEFAULTING TO 1");
            // Spec states an appropriate default value must be used - 1 has been chosen
            price = 1;
        }

        // Validate name
        // Spec states an appropriate default value must be used - DUMMY_PRODUCT_NAME has been chosen
        String dummyName = "DUMMY_PRODUCT_NAME";
        // Validation as per spec
        if(containsText(prodName)){
            System.out.print("PRODUCT NAME CANNOT BE BLANK. ");
            System.out.println("DEFAULTING TO DUMMY VALUE");
            prodName = dummyName;
        }

        // Validate product ID
        // Validation as per spec
        String prefix = "PROD_";
        if(containsText(prodId)){
            System.out.print("PRODUCT ID CANNOT BE BLANK. ");
            System.out.println("DEFAULTING TO DUMMY VALUE");
            // Spec states an appropriate default value must be used - PROD_DUMMY has been chosen
            // PROD_ is retained as the prefix because IDs should always start with PROD
            prodId = prefix + "DUMMY";
        }else if(!prodId.startsWith("PROD_")){
            System.out.print("INVALID PRODUCT ID \"" + prodId + "\". ");
            System.out.print("PRODUCT ID MUST START WITH " + prefix + ". ");
            // Spec states all product ids must start with PROD_,
            // so updated version just adds "PROD_" to start of supplied value
            prodId = prefix + prodId;
            System.out.println("AMENDING SUPPLIED ID TO " + prodId);
        }

        // Validate product category
        String defaultCategory = Product.VALID_CATEGORIES.getFirst();
        // Validate category contains text
        if(containsText(prodCategory)){
            System.out.print("PRODUCT CATEGORY CANNOT BE BLANK. ");
            System.out.println("SETTING TO DEFAULT VALUE");
            // Spec states invalid categories should default to "food",
            // i.e. the first in my list of categories
            prodCategory = defaultCategory;
        // Validate that category is selected from list of valid options
            // Spec states that the check cannot be case-sensitive,
            // so we have to convert the supplied category to lowercase to match what's in the valid list
        }else if(!Product.VALID_CATEGORIES.contains(prodCategory.toLowerCase())){
            System.out.print("PRODUCT CATEGORY \"" + prodCategory + "\" IS INVALID. ");
            System.out.println("SETTING TO DEFAULT VALUE");
            // If category is not found in list, spec states it should default to "food",
            // i.e. the first in my list of categories
            prodCategory = defaultCategory;
        }

        this.productId = prodId;
        this.productCategory = prodCategory;
        this.productName = prodName;
        this.productPrice = price;
    }

    // Validation method - not included in the spec but useful as a helper function
    // This is a private method that can confirm a string contains text
    private static boolean containsText(String text) {
        return text == null || text.isBlank();
    }

    // Getter method listed in UML diagram with this signature
    // Methods with the naming structure get+VariableName are getters
    // They should just return the variable they're named after
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

    // Method listed in UML diagram with this signature
    public static boolean checkCategory(String category){
        // Logic is implicit, not explicit. You are expected to understand that "checking" a category
        // means confirming that the supplied category is considered valid
        // under the rules listed in the spec
        // The rules specify all categories must be one of the four in the list
        // This method confirms the supplied category contains text
        // (no point checking the list if it's null/empty)
        // It then checks if it's in the list
        // If it's not, it returns false
        // If it is found in the list, it returns true
        if(containsText(category)){
            return false;
        }

        // Spec states comparisons must be case-insensitive, so we have to convert the parameter supplied to lowercase
        if(!Product.VALID_CATEGORIES.contains(category.toLowerCase())){
            return false;
        }

        return true;
    }

    // Method listed in UML diagram with this signature
    public String toString(){
        StringBuilder sb = new StringBuilder();
        // standard toString structure - toString should usually follow this
        sb.append("Product{");
        sb.append("productId=");
        sb.append(productId);
        sb.append(", productName=");
        sb.append(productName);
        sb.append(", productCategory=");
        sb.append(productCategory);
        sb.append(", productPrice=");
        sb.append(productPrice);
        sb.append("}");

        return sb.toString();
    }

    // Method listed in UML diagram with this signature
    public boolean equals(Object other){
        // Cannot compare different types - must check before you do the logical comparison
        if(!(other instanceof Product product)){
            return false;
        }

        // Spec states two Products are equal if they have the same ProductID
        // As it does not mention case-insensitivity, you could do this with equals() or equalsIgnoreCase()
        if(!this.productId.equals(product.productId)){
            return false;
        }

        return true;
    }

    // Method listed in UML diagram with this signature
    public int hashCode(){
        // Logic of this is based on logic of equals -
        // The spec states two Products are equal if they have the same productId,
        // so this method is also only based on productId
        return Objects.hash(productId);
    }
}
