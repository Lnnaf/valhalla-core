package com.valhallacore.entity.bo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;


import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long quantityAvailable;
    private int quantity;
    private int subTotal;
    private double salePrice;
    private double discountPercentage;
    private double originalPrice;
    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private Set<ProductImageEntity> productImageEntities;
}
