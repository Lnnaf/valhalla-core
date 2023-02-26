package com.valhallacore.entity.bo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int quantityAvailable;
    private int quantity;
    private double discountPercentage;
    private double originalPrice;
    @ManyToOne
    private ProductCategoryEntity category;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductImageEntity> images;
}
