package com.example.hw2_7map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeListIsEmptyException extends RuntimeException {
    public EmployeeListIsEmptyException(String message) {
        super(message);
    }
}
