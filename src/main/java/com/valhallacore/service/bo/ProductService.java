package com.valhallacore.service.bo;

import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface ProductService {
    Page<ProductListDto> findByNameContainingAndCategory(Pageable pageable, String name, String categoryId);

    void saveProduct(ProductEntity product);
}
