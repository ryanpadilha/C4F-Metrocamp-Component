package br.edu.veris.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe de criptografia SHA-1.
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public class CriptografiaSHA1 implements ICriptografia {

	public String encriptar(String mensagem) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
		messageDigest.update(mensagem.getBytes(), 0, mensagem.length());

		return new BigInteger(1, messageDigest.digest()).toString(16);
	}

}
