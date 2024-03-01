package com.example.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Categories extends BaseModel {
    private String name;
    private String description;
    private List<Products> productList;
}
