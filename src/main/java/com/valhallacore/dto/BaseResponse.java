package com.valhallacore.dto;

import com.valhallacore.Enum.ResponseStatus;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class BaseResponse {
    private int code;
    private ResponseStatus status;
    private String msg;
    private Object data;
    private Date time;
}
