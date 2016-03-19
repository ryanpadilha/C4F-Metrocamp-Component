package br.edu.metrocamp.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import br.edu.metrocamp.service.AlgoritmoCriptografia;

/**
 * Caso de testes do componente de criptografia.
 *
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.0.1
 *
 */
public class CriptografiaFactoryTest {

	@Test
	public void encriptarMD5() throws NoSuchAlgorithmException {
		String mensagem = "Mensagem a ser criptografada";

		CriptografiaFactory factory = new CriptografiaFactory();
		String value = factory.encriptar(mensagem, AlgoritmoCriptografia.MD5);
		assertNotNull(value);
		assertTrue("e89521c6d3830c2c4b13443989d7b833".equals(value));
	}

	@Test
	public void encriptarSHA1() throws NoSuchAlgorithmException {
		String mensagem = "Mensagem a ser criptografada";

		CriptografiaFactory factory = new CriptografiaFactory();
		String value = factory.encriptar(mensagem, AlgoritmoCriptografia.SHA1);
		assertNotNull(value);
		assertTrue("c9c86978889d348435726a503784a35de6c03c01".equals(value));
	}
}
