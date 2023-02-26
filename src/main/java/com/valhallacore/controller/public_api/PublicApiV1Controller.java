package com.valhallacore.controller.public_api;

import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.service.auth.FakeService;
import com.valhallacore.service.auth.SystemUserService;
import com.valhallacore.service.bo.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor
@CrossOrigin("*")
public class PublicApiV1Controller {
    private final ProductService productService;
    private final SystemUserService systemUserService;
    private final FakeService fakeService;

    /**
     * Create by: BaoDP
     * Date created: 24/02/2023
     *
     * @param size
     * @param page
     * @param name
     * @param categoryId
     * @return A custom page (page number and size) of product find by name and categoryId, if categoryId is null or empty or blank then return all products regardless of their category
     */
    @GetMapping("products")
    public ResponseEntity<Page<ProductEntity>> getProductsByNameAndCategory(@RequestParam(value = "size", defaultValue = "5") int size,
                                                                            @RequestParam(value = "page", defaultValue = "0") int page,
                                                                            @RequestParam(value = "name", defaultValue = "") String name,
                                                                            @RequestParam(value = "categoryId", defaultValue = "") String categoryId) {
        Pageable pageable = PageRequest.of(page, size);

        return new ResponseEntity<>(productService.findByNameContainingAndCategory(pageable, name, categoryId), HttpStatus.OK);
    }

    // Fake date API
    @GetMapping("fakeRoles")
    public ResponseEntity<?> fakerRoles() {
        fakeService.saveFakeProduct();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
