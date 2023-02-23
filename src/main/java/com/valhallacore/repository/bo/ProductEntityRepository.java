package com.valhallacore.repository.bo;

import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Long> {
    Page<ProductEntity> findAllByNameContaining(Pageable pageable, String name);
}
