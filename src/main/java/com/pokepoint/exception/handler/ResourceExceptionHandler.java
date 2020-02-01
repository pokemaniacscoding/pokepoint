package com.pokepoint.exception.handler;

import com.pokepoint.exception.DataIntegrityException;
import com.pokepoint.exception.ObjectNotFoundException;
import com.pokepoint.exception.StandardError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException obj, HttpServletRequest request) {
        StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), obj.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }

    @ExceptionHandler(DataIntegrityException.class)
    public ResponseEntity<StandardError> dataIntegrityException(DataIntegrityException obj, HttpServletRequest request){
        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), obj.getMessage(), System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standardError);
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<StandardError> handle(MethodArgumentNotValidException exception) {
        List<StandardError> erroLista = new ArrayList<>();
        List<FieldError> fieldErrorLista = exception.getBindingResult().getFieldErrors();
        fieldErrorLista.forEach(e -> {
            String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            erroLista.add(new StandardError(HttpStatus.BAD_REQUEST.value(), e.getField(), mensagem, System.currentTimeMillis()));
        });
        return erroLista;
    }
}
