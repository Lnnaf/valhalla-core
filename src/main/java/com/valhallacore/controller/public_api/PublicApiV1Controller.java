package com.valhallacore.controller.public_api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.valhallacore.Enum.ResponseStatus;
import com.valhallacore.dto.BaseResponse;
import com.valhallacore.dto.bo.ProductListDto;
import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.service.auth.FakeService;
import com.valhallacore.service.auth.SystemUserService;
import com.valhallacore.service.bo.ProductCategoryService;
import com.valhallacore.service.bo.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor
@CrossOrigin("*")
public class PublicApiV1Controller {
    private final ProductService productService;
    private final SystemUserService systemUserService;
    private final FakeService fakeService;
    private final ProductCategoryService productCategoryService;

    /**
     * Create by: BaoDP
     * Date created: 24/02/2023
     *
     * @param size
     * @param page
     * @param name
     * @param categoryId
     * @return A custom page (page number and size) of product find by name and categoryId, if categoryId is null or empty or blank then return all products regardless of their category
     * Note: imageUrls will be return as a string concatenated separated by commas - "," .
     */
    @GetMapping("products")
    public ResponseEntity<BaseResponse> getProductsByNameAndCategory(@RequestParam(value = "size", defaultValue = "5") int size,
                                                                             @RequestParam(value = "page", defaultValue = "0") int page,
                                                                             @RequestParam(value = "name", defaultValue = "") String name,
                                                                             @RequestParam(value = "categoryId", defaultValue = "") String categoryId) {
        Pageable pageable = PageRequest.of(page, size);
        var tempProductEntities = productService.findByNameContainingAndCategory(pageable, name, categoryId);
        Page<ProductListDto> response = tempProductEntities.map(item -> {
            ProductListDto productListDto = ProductListDto.builder().build();
            BeanUtils.copyProperties(item, productListDto);
            return productListDto;
        });œ
        var baseResponse =  BaseResponse.builder()
                .code(HttpStatus.OK.value())
                .data(response)
                .status(ResponseStatus.SUCCESS.getValue())
                .time(new Date())
                .build();
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }

    // Fake date API
    @GetMapping("fakeData")
    public ResponseEntity<?> fakerRoles() {
        fakeService.saveFakeProduct();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("categories")
    public ResponseEntity<BaseResponse> getCategories() {
        var categories = productCategoryService.findAll();

        var response = BaseResponse.builder()
                .code(HttpStatus.OK.value())
                .status(ResponseStatus.SUCCESS.getValue())
                .data(categories)
                .time(new Date()).build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
