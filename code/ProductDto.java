package com.example.productservice.dtos;

import com.example.productservice.models.Categories;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {

    private String name;
    private String description;
    private String image;
    private int price;

}
