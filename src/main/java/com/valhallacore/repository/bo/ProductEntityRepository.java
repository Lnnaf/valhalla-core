package com.valhallacore.repository.bo;

import com.valhallacore.dto.bo.ProductListDto;
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
//    @Query(value = "SELECT " +
//            " p.id AS productId, " +
//            "  p.name AS productName, " +
//            "  p.description AS productDescription, " +
//            "  p.original_price AS productOriginalPrice, " +
//            "  p.discount_percentage AS productDiscountPercentage, " +
//            "  c.id AS categoryId, " +
//            "  c.name AS categoryName, " +
//            "  GROUP_CONCAT(DISTINCT pi.url SEPARATOR ',') AS imageUrlListToString " +
//            "FROM " +
//            "  product_entity p " +
//            "  LEFT JOIN product_category_entity c ON p.category_id = c.id" +
//            "  LEFT JOIN product_image_entity pi ON p.id = pi.product_id " +
//            "WHERE (?1 IS NULL OR p.name LIKE ?1) " +
//            "AND (?2 IS NULL OR p.category_id = ?2)" +
//            "GROUP BY" +
//            "  p.id"
//            , nativeQuery = true)
    Page<ProductEntity> findByNameContainingIgnoreCaseAndCategory_Id(String name, Long categoryId, Pageable pageable);

    Page<ProductEntity> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
