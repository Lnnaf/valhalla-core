package com.valhallacore.service.convert;

import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.beans.BeanUtils;


public class ProductConvertor {
    public static ProductListDto convert(ProductEntity entity){
        var dto = new ProductListDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
