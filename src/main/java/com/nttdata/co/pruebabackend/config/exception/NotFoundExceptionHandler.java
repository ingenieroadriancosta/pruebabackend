package com.nttdata.co.pruebabackend.config.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nttdata.co.pruebabackend.utils.Utils;

@EnableWebMvc
@ControllerAdvice
// @Order(Ordered.HIGHEST_PRECEDENCE)
public class NotFoundExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    protected ResponseEntity<Object> handleNoHandlerFoundException(
            NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Utils.loggerInfo("ERROR : handleNoHandlerFoundException");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                status.value(),
                status.getReasonPhrase(),
                request.getDescription(false));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dto);
    }

}
