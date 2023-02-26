package com.valhallacore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {
    private int code;
    private String status;
    private String msg;
    private Object data;
    private Date time;
}
