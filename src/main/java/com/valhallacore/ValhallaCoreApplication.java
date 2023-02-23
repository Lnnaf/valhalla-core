package com.valhallacore;

import com.valhallacore.entity.auth.Role;
import com.valhallacore.repository.auth.RoleRepository;
import com.valhallacore.service.auth.SystemUserService;
import com.valhallacore.service.bo.ProductService;
import com.vastik.spring.data.faker.DataFaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ValhallaCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValhallaCoreApplication.class, args);
    }
}
