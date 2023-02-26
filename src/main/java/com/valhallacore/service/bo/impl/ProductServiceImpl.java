package com.valhallacore.service.bo.impl;

import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.repository.bo.ProductEntityRepository;
import com.valhallacore.repository.bo.ProductImageEntityRepository;
import com.valhallacore.service.bo.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.weaver.ast.Var;
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
    public Page<ProductEntity> findByNameContainingAndCategory(Pageable pageable, String name, String categoryId) {
        Long validCategoryId = StringUtils.isBlank(categoryId) ? null : Long.valueOf(categoryId.trim());
        String validName = StringUtils.isBlank(name) ? "" : name.trim();

        return validCategoryId != null ? productEntityRepository.findByNameContainingIgnoreCaseAndCategory_Id(validName, validCategoryId, pageable) : productEntityRepository.findByNameContainingIgnoreCase(validName, pageable);
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
