package com.valhallacore.service.auth;

import com.valhallacore.dto.BaseResponse;
import com.valhallacore.entity.auth.Role;
import com.valhallacore.entity.auth.SystemUserEntity;

import java.util.List;


public interface SystemUserService {
    BaseResponse saveSystemUser(SystemUserEntity systemUserEntity);

    BaseResponse editSystemUser(SystemUserEntity systemUserEntity);

    BaseResponse deleteSystemUser(SystemUserEntity systemUserEntity);
}
