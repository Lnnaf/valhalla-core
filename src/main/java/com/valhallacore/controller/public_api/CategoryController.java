package com.valhallacore.controller.public_api;

import com.valhallacore.Enum.ResponseStatus;
import com.valhallacore.dto.BaseResponse;
import com.valhallacore.service.bo.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/category")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor
@CrossOrigin("*")
public class CategoryController {
    private final ProductCategoryService productCategoryService;
    @GetMapping("get")
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
