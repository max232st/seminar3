package org.example.seminar3.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private String name;
    private Integer price;
    private String country;
    private Double weigh;
    private Integer sort;
}
