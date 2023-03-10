package com.valhallacore.entity.auth;

import com.valhallacore.Enum.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class SystemUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private UserType userType;
    private String fullName;
    private Date birthDay;
    private String email;
    private String phone;
    @OneToOne
    private Account account;
}
