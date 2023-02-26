package com.valhallacore.entity.bo;

import com.valhallacore.entity.auth.SystemUserEntity;
import lombok.*;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DiscountCodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String description;
    private Date createdDate;
    private Date expiredDate;
    private double amount;
    private double stock;
    private Date lastModifier;
    @ManyToOne
    private SystemUserEntity author;
}
