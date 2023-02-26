package com.valhallacore.service.bo.impl;

import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.repository.bo.ProductEntityRepository;
import com.valhallacore.repository.bo.ProductImageEntityRepository;
import com.valhallacore.service.bo.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductEntityRepository productEntityRepository;
    private final ProductImageEntityRepository productImageEntityRepository;

    /**
     * Create by: BaoDP
     * Date created: 24/02/2023
     *
     * @param pageable
     * @param name
     * @param categoryId
     * @return A page of product find by name and categoryId, if categoryId is null or empty or blank then return all products regardless of their category
     */
    @Override
    public Page<ProductListDto> findByNameContainingAndCategory(Pageable pageable, String name, String categoryId) {
        Long validCategoryId = categoryId == null || categoryId.isEmpty() || categoryId.trim().isEmpty() ? null : Long.valueOf(categoryId);
        String validName = name == null || name.isEmpty() || name.trim().isEmpty() ? null : name;


        return productEntityRepository.findByNameContainingAndCategory(pageable, validName, validCategoryId);
    }

    /**
     * description: For test, not Final
     *
     * @param product
     */
    @Override
    public void saveProduct(ProductEntity product) {
        productEntityRepository.save(product);
    }
}
