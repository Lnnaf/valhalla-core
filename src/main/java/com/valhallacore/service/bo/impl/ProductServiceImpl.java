package com.valhallacore.service.bo.impl;

import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.entity.bo.ProductImageEntity;
import com.valhallacore.repository.bo.ProductEntityRepository;
import com.valhallacore.repository.bo.ProductImageEntityRepository;
import com.valhallacore.service.bo.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
//@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductEntityRepository productEntityRepository;
    private final ProductImageEntityRepository productImageEntityRepository;

    @Override
    public Page<ProductEntity> getAll(Pageable pageable) {
        return productEntityRepository.findAllByNameContaining(pageable, "");
    }

    @Override
    public void saveProduct(ProductEntity product) {
        productEntityRepository.save(product);
    }
}
