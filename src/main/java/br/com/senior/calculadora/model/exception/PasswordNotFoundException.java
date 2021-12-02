package br.com.senior.calculadora.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Senha nao informada")
public class PasswordNotFoundException extends RuntimeException {

}
