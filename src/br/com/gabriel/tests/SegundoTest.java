package br.com.gabriel.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.gabriel.desafio2.Segundo;

class SegundoTest {

	@Test
	public void SegundoTestPasswordYa3() {
		Segundo segundo = new Segundo();

		Integer calculatedValue = segundo.checkString("Ya3");
		assertEquals(3, calculatedValue);
	}

	@Test
	public void SegundoTestPasswordagua() {
		Segundo segundo = new Segundo();

		Integer calculatedValue = segundo.checkString("agua");
		assertEquals(3, calculatedValue);
	}

}
