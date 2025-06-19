package br.com.karloskelvin.event.exception;

import br.com.karloskelvin.event.dto.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EventControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDTO> handleNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(404).body(new ErrorDTO(ex.getMessage()));
    }
}
