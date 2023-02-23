package com.valhallacore.service.auth.impl;

import com.valhallacore.dto.BaseResponse;
import com.valhallacore.dto.fake_java.FakeRole;
import com.valhallacore.entity.auth.Role;
import com.valhallacore.entity.auth.SystemUserEntity;
import com.valhallacore.repository.auth.AccountRoleRepository;
import com.valhallacore.repository.auth.RoleRepository;
import com.valhallacore.repository.auth.SystemUserEntityRepository;
import com.valhallacore.service.auth.SystemUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class SystemUserServiceImpl implements SystemUserService {
    private final SystemUserEntityRepository systemUserEntityRepository;
    private final AccountRoleRepository accountRoleRepository;
    private final RoleRepository roleRepository;

    /**
     * Description: Not create dto and validate yet
     */
    @Override
    public BaseResponse saveSystemUser(SystemUserEntity systemUserEntity) {
        // Save SystemUser and get auto-generated id for save role
        SystemUserEntity systemUser = systemUserEntityRepository.save(systemUserEntity);
        systemUserEntityRepository.flush();

        // Save role for account


        return null;
    }

    @Override
    public BaseResponse editSystemUser(SystemUserEntity systemUserEntity) {
        return null;
    }

    @Override
    public BaseResponse deleteSystemUser(SystemUserEntity systemUserEntity) {
        return null;
    }

}
