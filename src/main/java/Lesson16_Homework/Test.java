package Lesson16_Homework;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 39.80));
        products.add(new Product("Apple", 8.20));
        products.add(new Product("Carrot", 6.70));
        products.add(new Product("Chicken", 140.00));
        products.add(new Product("Juice", 51.20));
        ProductMarket market = new ProductMarket(products);
        System.out.println("All product names: " + market.getProductNames());
        System.out.println("Product names alphabetically: " + market.getProductNamesAlphabetically());
        System.out.println("Prices more than 10: " + market.getPricesMoreThanTen());
        System.out.println("Prices less than 0: " + market.getPricesLessThanZero());
        System.out.println("Prices as string: " + market.getPricesAsString());
    }
}
