package com.duran.store.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {

    CUSTOMER_NOT_FOUND("ERR_CUSTOMER_001", "Customer not found"),
    INVALID_CUSTOMER("ERR_CUSTOMER_002", "Invalid customer parameters"),
    GENERIC_ERROR("ERR_GENERIC_001", "An error occurred");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
