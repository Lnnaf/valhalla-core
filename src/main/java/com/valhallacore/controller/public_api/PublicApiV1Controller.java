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

    @GetMapping("products")
    public ResponseEntity<Page<ProductEntity>> getProducts(@RequestParam(value = "size") int size,
                                                           @RequestParam(value = "page") int page) {
        Pageable pageable = PageRequest.of(page, size);
        return new ResponseEntity<>(productService.getAll(pageable), HttpStatus.OK);
    }

    @GetMapping("fakeRoles")
    public ResponseEntity<?> fakerRoles() throws Exception {
        fakeService.saveFakeRoles();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
