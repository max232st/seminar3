package org.example.seminar3.hw3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String family;
    private Integer price;
    private Integer year;
    private Integer pages;
}
