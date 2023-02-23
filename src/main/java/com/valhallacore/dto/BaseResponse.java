package com.valhallacore.dto;

import com.valhallacore.Enum.ResponseStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class BaseResponse {
    private int code;
    private ResponseStatus status;
    private String message;
    private Object data;
    private Date timeResponse;
}
