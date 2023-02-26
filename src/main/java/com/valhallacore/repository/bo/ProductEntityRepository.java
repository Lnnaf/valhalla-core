package com.valhallacore.repository.bo;

import com.valhallacore.entity.bo.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Long> {
    /**
     * Create by: BaoDP
     * Date created: 24/02/2023
     *
     * @param pageable
     * @param name
     * @param categoryId
     * @return A page of product find by name and categoryId, if categoryId is null or empty or blank then return all products regardless of their category
     */
    @Query(value = "SELECT * FROM valhalla_db.product_entity WHERE valhalla_db.product_entity.name LIKE #{name} AND (valhalla_db.product_entity.category_id IS NULL OR valhalla_db.product_entity.category_id LIKE #{categoryId})", nativeQuery = true)
    Page<ProductEntity> findByNameContainingAndCategory(Pageable pageable, @Param("name") String name, @Param("categoryId") Long categoryId);
}
