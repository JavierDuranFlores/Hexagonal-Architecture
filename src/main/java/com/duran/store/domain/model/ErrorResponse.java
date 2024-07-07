package com.duran.store.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class ErrorResponse {

    private String message;
    private String code;
    private List<String> details;
    private LocalDateTime timestamp;

}
