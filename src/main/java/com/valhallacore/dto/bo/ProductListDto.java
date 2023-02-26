package com.valhallacore.dto.bo;

import com.valhallacore.entity.bo.ProductCategoryEntity;
import com.valhallacore.entity.bo.ProductImageEntity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductListDto {
    private Long id;
    private String name;
    private String description;
    private int quantityAvailable;
    private double discountPercentage;
    private double originalPrice;
    private ProductCategoryEntity category;

    private List<ProductImageEntity> images;

}
