package com.valhallacore.Enum;

public enum ResponseStatus {
    SUCCESS("success"),
    ERROR("error"),
    FAILURE("failure");

    private String value;

    ResponseStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
