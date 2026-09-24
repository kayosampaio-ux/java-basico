package com.exemplo.crudprodutos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Map<String, Object>> tratarResponseStatusException(
            ResponseStatusException exception) {

        Map<String, Object> resposta = new HashMap<>();

        resposta.put("data", LocalDateTime.now());
        resposta.put("status", exception.getStatusCode().value());
        resposta.put("erro", exception.getReason());

        return ResponseEntity
                .status(exception.getStatusCode())
                .body(resposta);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> tratarException(Exception exception) {

        Map<String, Object> resposta = new HashMap<>();

        resposta.put("data", LocalDateTime.now());
        resposta.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        resposta.put("erro", "Ocorreu um erro interno no servidor");

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(resposta);
    }
}