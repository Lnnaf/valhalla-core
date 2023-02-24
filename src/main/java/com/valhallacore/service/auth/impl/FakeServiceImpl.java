package com.valhallacore.service.auth.impl;

import com.valhallacore.service.auth.FakeService;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class FakeServiceImpl implements FakeService {

    @Override
    public void saveFakeRoles() throws Exception {
        Faker dateFaker = new Faker();
        for (int i = 0; i < 10; i++) {
            String name = dateFaker.dcComics().hero();
            System.out.println("dataFaker " + name);
        }
    }
}
