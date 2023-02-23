package org.example.seminar3.hw2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Сахар", 60, "Белорусь", 1.0, 1);
        Product pr2 = new Product("Молоко", 55, "Россия", 0.9, 2);
        Product pr3 = new Product("Печенье", 120, "Украина", 1.0, 5);
        Product pr4 = new Product("Конфеты", 75, "Польша", 1.5, 3);
        Product pr5 = new Product("Кукурузные хлопья", 60, "Россия", 1.0, 2);

        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);

        String minPriceName = MinPriceName(productList, 2);
        if (minPriceName.isEmpty()) {
            System.out.println("Нет товара в заданной категории");
        } else {
            System.out.println(minPriceName);
        }
    }

    public static String MinPriceName(List<Product> productList, Integer grade) {
        Integer minPrice = productList.get(0).getPrice();
        String minPriceName = "";
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getSort() == grade) {
                if (productList.get(i).getPrice() <= minPrice) {
                    minPrice = productList.get(i).getPrice();
                    minPriceName = productList.get(i).getName();
                }
            }
        }
        return minPriceName;
    }
}
