package com.valhallacore.service.bo;

import com.valhallacore.dto.BaseResponse;
import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface ProductService {
    Page<ProductEntity> findByNameContainingAndCategory(Pageable pageable, String name, String categoryId);

    BaseResponse findById(String id);

    void saveProduct(ProductEntity product);
}
