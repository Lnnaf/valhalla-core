package com.valhallacore.entity.bo;

import com.valhallacore.entity.auth.SystemUserEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity extends SystemUserEntity {
    @CreationTimestamp
    private Date joinedDay;
    private Double point;
}
