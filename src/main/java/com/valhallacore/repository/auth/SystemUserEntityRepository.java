package com.valhallacore.repository.auth;

import com.valhallacore.entity.auth.SystemUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserEntityRepository extends JpaRepository<SystemUserEntity, Long> {

}
