package br.edu.metrocamp.model;

import java.security.NoSuchAlgorithmException;

/**
 * Interface de contrato interno de tipos de criptografia
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public interface ICriptografia {
	String encriptar(String mensagem) throws NoSuchAlgorithmException;
}
