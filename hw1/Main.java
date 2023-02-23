package org.example.seminar3.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Main {

    public static void main(String[] args) {
        Product pr1 = new Product("мука петровска", 60, 2);
        Product pr2 = new Product("мука вологодская высший", 76, 2);
        Product pr3 = new Product("мука ивановская", 70, 3);
        Product pr4 = new Product("мука ивановская высший", 75, 1);

        List<Product> itemsList = new ArrayList<>();
        itemsList.add(pr1);
        itemsList.add(pr2);
        itemsList.add(pr3);
        itemsList.add(pr4);
        System.out.println(itemsList);
        String searchName = "высший";
        double maxCena = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().contains(searchName) &&
                    (itemsList.get(i).getSort().equals(1) || itemsList.get(i).getSort().equals(2))) {
                if (itemsList.get(i).getCena() > maxCena) maxCena = itemsList.get(i).getCena();
            }
        }
        System.out.println("Цена товаров 1го или 2го сорта с наименованием «высший» = " + maxCena);
    }
}
