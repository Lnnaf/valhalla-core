package com.valhallacore.service.bo;

import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ProductEntity> getAll(Pageable pageable);

    void saveProduct(ProductEntity product);
}
