package com.valhallacore.dto.bo;

import com.valhallacore.utils.DiscountUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleOff {
    private double salePrice;
    private double discountPercentage;
    private double originalPrice;
    public double getDiscountPercentage() {
        return DiscountUtil.getDiscountPercentage(originalPrice, salePrice);
    }
}
