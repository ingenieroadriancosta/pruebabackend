package com.nttdata.co.pruebabackend.config.exception;

public class NotFoundErrorException extends RuntimeException{
    public NotFoundErrorException(String message) {
        super(message);
    }
}
