package com.valhallacore.service.bo.impl;

import com.valhallacore.entity.bo.ProductCategoryEntity;
import com.valhallacore.repository.bo.ProductCategoryEntityRepository;
import com.valhallacore.service.bo.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {
    private final ProductCategoryEntityRepository productCategoryEntityRepository;

    @Override
    public List<ProductCategoryEntity> findAll() {
        return productCategoryEntityRepository.findAll();
    }
}
