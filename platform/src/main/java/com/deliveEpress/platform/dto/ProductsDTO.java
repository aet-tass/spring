package com.deliveEpress.platform.dto;

import com.deliveEpress.platform.entity.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {
    private Integer id;
    private String name;
    private String description;
    private Double originalPrice;
    private Double price;
    private Products.Category category;
    private double quantity;
    private String ref;
}
