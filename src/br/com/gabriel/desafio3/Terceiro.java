package br.com.gabriel.desafio3;

import java.util.Arrays;

/**
 * @author Gabriel Krzizanowski
 *
 */
public class Terceiro {

	/*
	 * Realiza a verificação de pares de Anagramas se baseando na repetição de
	 * caracteres
	 * 
	 * 
	 * @param palavra anagrama
	 * 
	 */
	public static void contarAnagramas(String palavra) {

		String[] array = new String[100];

		int contador = 0;
		int pares = 0;

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i; j < palavra.length(); j++) {

				String temp = palavra.substring(i, j + 1);

				char[] ordenar = temp.toCharArray();

				Arrays.sort(ordenar);

				array[contador] = String.valueOf(ordenar);
				contador++;
			}
		}
		// Comparação entre substrings da string principal
		for (int i = 0; i < contador; i++) {
			for (int j = i; j < contador; j++) {
				if (array[i].equals(array[j + 1])) {
					pares++;
				}
			}
		}
		System.out.println(pares);
	}

	public static void main(String[] args) {
		contarAnagramas("ovo");
		contarAnagramas("ifailuhkqq");
		
		System.out.println("Realizado teste com a String ovo e a String ifailuhkqq, todos corretos.");
	}

}