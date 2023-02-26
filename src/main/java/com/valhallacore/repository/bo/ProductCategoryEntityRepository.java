package com.valhallacore.repository.bo;

import com.valhallacore.entity.bo.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryEntityRepository extends JpaRepository<ProductCategoryEntity, Long> {
}
