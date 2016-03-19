package br.edu.metrocamp.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe de criptografia MD5.
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public class CriptografiaMD5 implements ICriptografia {

	public String encriptar(String mensagem) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.update(mensagem.getBytes(), 0, mensagem.length());

		return new BigInteger(1, messageDigest.digest()).toString(16);
	}
}
