package com.nttdata.co.pruebabackend.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import com.nttdata.co.pruebabackend.utils.Utils;

import java.time.LocalDateTime;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionConfig {

    @ExceptionHandler(MissingPathVariableException.class)
    public ResponseEntity<ErrorDTO> catchBadRequestResponse(Exception ex, WebRequest request){
        Utils.loggerInfo("ERROR : BadRequestResponse");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dto);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ErrorDTO> catchRequiredRequestParameter(Exception ex, WebRequest request){
        Utils.loggerInfo("ERROR : RequiredRequestParameter");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dto);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> catchInternalServerError(Exception ex, WebRequest request){
        Utils.loggerInfo("ERROR : InternalServerError");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                request.getDescription(false)
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
    }

    @ExceptionHandler(NotFoundErrorException.class)
    public ResponseEntity<ErrorDTO> catchNotFoundError(Exception ex, WebRequest request){
        Utils.loggerInfo("ERROR : Not Found Error");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                request.getDescription(false)
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(dto);
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<ErrorDTO> catchServletRequestParameterPropertyValues(Exception ex, WebRequest request){
        Utils.loggerInfo("ERROR : ServletRequestParameterPropertyValues");
        ErrorDTO dto = new ErrorDTO(
                LocalDateTime.now().toString(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                request.getDescription(false)
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
    }





}
