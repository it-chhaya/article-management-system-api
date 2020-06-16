package com.articlerest.articlerest.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppException {

    @ExceptionHandler(ArticleNotFoundException.class)
    public ResponseEntity<String> articleNotFound() {
        return ResponseEntity.ok("User Not Found");
    }

}
