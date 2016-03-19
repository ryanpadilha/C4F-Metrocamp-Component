package br.edu.veris.service.impl;

import java.security.NoSuchAlgorithmException;

import br.edu.veris.model.CriptografiaMD5;
import br.edu.veris.model.CriptografiaSHA1;
import br.edu.veris.service.AlgoritmoCriptografia;
import br.edu.veris.service.ICriptografiaService;

/**
 * Factory de controle de instancias de criptografia
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public class CriptografiaFactory implements ICriptografiaService {

	private static CriptografiaFactory instance;

	private CriptografiaFactory() {
	}

	public static CriptografiaFactory getInstance() {
		if (null == instance) {
			instance = new CriptografiaFactory();
		}

		return instance;
	}

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
