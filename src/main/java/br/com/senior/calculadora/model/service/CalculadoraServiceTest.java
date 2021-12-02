package br.com.senior.calculadora.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.calculadora.model.exception.PasswordException;
import br.com.senior.calculadora.model.exception.PasswordNotFoundException;
import br.com.senior.calculadora.model.profile.CalculadoraProfile;

@Service
@Profile("test")
public class CalculadoraServiceTest implements CalculadoraService {

	@Autowired
	CalculadoraProfile calculadoraProfile;

	@Override
	public Boolean isValid(String senha) {
		if (senha == null) {
			throw new PasswordNotFoundException();
		}

		boolean valido = calculadoraProfile.getSenha().equals(senha);
		if (!valido) {
			throw new PasswordException();
		}

		return valido;
	}

}
