package com.valhallacore.dto.bo;

import java.util.List;

public interface ProductListDto {
    Long getProductId();

    String getProductName();

    String getProductDescription();

    Double getProductOriginalPrice();

    Double getProductDiscountPercentage();

    Long getCategoryId();

    String getCategoryName();

    String getImageUrlListToString();
}
