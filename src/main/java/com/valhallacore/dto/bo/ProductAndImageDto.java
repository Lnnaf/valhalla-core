package com.valhallacore.dto.bo;

import lombok.*;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class ProductAndImageDto {
    private Long id;
    private String name;
    private String description;
    private Long quantityAvailable;
    private int quantity;
    private int subTotal;
    private double salePrice;
    private double discountPercentage;
    private double originalPrice;
    private String imageUrl;
}
