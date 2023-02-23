package com.valhallacore.repository.bo;

import com.valhallacore.entity.bo.ProductImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImageEntityRepository extends JpaRepository<ProductImageEntity, Long> {
}
