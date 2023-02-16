package Lesson16_Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        for (Product p : products) {
            names.add(p.getName());
        }
        return names;
    }

    public List<String> getProductNamesAlphabetically() {
        List<String> names = getProductNames();
        Collections.sort(names);
        return names;
    }

    public List<Double> getPricesMoreThanTen() {
        List<Double> prices = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > 10) {
                prices.add(p.getPrice());
            }
        }
        return prices;
    }

    public List<Double> getPricesLessThanZero() {
        List<Double> prices = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() < 0) {
                prices.add(p.getPrice());
            }
        }
        return prices;
    }

    public String getPricesAsString() {
        StringBuilder s = new StringBuilder();
        for (Product p : products) {
            s.append(p.getPrice()).append(" ");
        }
        return s.toString();
    }
}
