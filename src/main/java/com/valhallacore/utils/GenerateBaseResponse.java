package com.valhallacore.utils;

import com.valhallacore.dto.BaseResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GenerateBaseResponse {
    public static BaseResponse successGetResponse(String msg, Object data) {
        return BaseResponse.builder()
                .code(200)
                .msg(msg)
                .data(data)
                .time(new Date())
                .build();
    }
}
