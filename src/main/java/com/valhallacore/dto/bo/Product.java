package com.valhallacore.dto.bo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private Long id;
    private String name;
    private String description;
    private String image;
    private Long quantityAvailable;
    private SaleOff saleOff;
    private Long price;
    private int quantity;
    private int subTotal;
}
