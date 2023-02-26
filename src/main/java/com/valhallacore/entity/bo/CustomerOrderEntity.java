package com.valhallacore.entity.bo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CustomerEntity customer;
    @OneToMany(mappedBy = "customerOrder")
    @JsonBackReference
    private Set<OrderDetailEntity> productEntitySet;
    private double totalPrice;
    private double originalPrice;
    @ManyToOne
    private DiscountCodeEntity discountCode;
}
