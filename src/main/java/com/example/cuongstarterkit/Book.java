package com.example.cuongstarterkit;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    private Long id;
    private String name;
    private BigDecimal price;

    public Book(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
