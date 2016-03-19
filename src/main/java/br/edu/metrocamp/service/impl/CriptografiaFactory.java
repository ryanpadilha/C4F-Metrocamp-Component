package br.edu.metrocamp.service.impl;

import java.security.NoSuchAlgorithmException;

import br.edu.metrocamp.model.CriptografiaMD5;
import br.edu.metrocamp.model.CriptografiaSHA1;
import br.edu.metrocamp.service.AlgoritmoCriptografia;
import br.edu.metrocamp.service.ICriptografiaService;

/**
 * Factory de controle de instancias de criptografia
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public class CriptografiaFactory implements ICriptografiaService {

	public String encriptar(String mensagem, AlgoritmoCriptografia algoritmo) throws NoSuchAlgorithmException {
		String criptoMessage = "";

		switch (algoritmo) {
		case MD5:
			criptoMessage = new CriptografiaMD5().encriptar(mensagem);
			System.out.println("criptografia MD5");
			break;
		case SHA1:
			criptoMessage = new CriptografiaSHA1().encriptar(mensagem);
			System.out.println("criptografia SHA1");
			break;
		default:
			// TODO: implementar comportamento default
			break;
		}

		return criptoMessage;
	}

}
