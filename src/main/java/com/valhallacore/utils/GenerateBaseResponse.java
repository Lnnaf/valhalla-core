package com.valhallacore.utils;

import com.valhallacore.Enum.ResponseStatus;
import com.valhallacore.dto.BaseResponse;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GenerateBaseResponse {
    public static BaseResponse successGetResponse(String msg, Object data) {
        return BaseResponse.builder()
                .code(HttpStatus.OK.value())
                .msg(msg)
                .data(data)
                .status(ResponseStatus.SUCCESS.getValue())
                .time(new Date())
                .build();
    }

    public static BaseResponse noContentGetResponse(String msg, Object data) {
        return BaseResponse.builder()
                .code(HttpStatus.NO_CONTENT.value())
                .msg(msg)
                .data(data)
                .status(ResponseStatus.SUCCESS.getValue())
                .time(new Date())
                .build();
    }

    public static BaseResponse invalidField(String msg, Object data) {
        return BaseResponse.builder()
                .code(HttpStatus.UNPROCESSABLE_ENTITY.value())
                .msg(msg)
                .data(data)
                .status(ResponseStatus.FAILURE.getValue())
                .time(new Date())
                .build();
    }

    public static BaseResponse notFound(String msg, Object data) {
        return BaseResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .msg(msg)
                .data(data)
                .status(ResponseStatus.FAILURE.getValue())
                .time(new Date())
                .build();
    }
}
