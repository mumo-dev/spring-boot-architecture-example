package com.mumo.myshop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -945487050730803985L;

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
