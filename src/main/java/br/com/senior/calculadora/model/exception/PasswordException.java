package br.com.senior.calculadora.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Senha Invalida")
public class PasswordException extends RuntimeException {

}
