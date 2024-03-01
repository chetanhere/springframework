package com.example.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products extends BaseModel{
    private String name;
    private String description;
    private String image;
    private int price;
    private int quantity;
    private Categories category;

}
