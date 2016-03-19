package br.edu.metrocamp.service;

import java.security.NoSuchAlgorithmException;

/**
 * Interface de contrato de serviços de criptografia
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public interface ICriptografiaService {
	String encriptar(String mensagem, AlgoritmoCriptografia algoritmo) throws NoSuchAlgorithmException;
}
