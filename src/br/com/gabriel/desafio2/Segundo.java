package br.com.gabriel.desafio2;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String password = input.next();

		System.out.println(checkString(password));

		input.close();

	}

	public static Integer checkString(String str) {
		Integer count = 0;
		char ch;
		String specialCharactersString = "!@#$%^&*()-+";
		Boolean verificaSeEntrou = false;

		/**
		 * Este for realiza a verificação se na String tem um numero
		 * 
		 * @author Gabriel Krzizanowski
		 */
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				verificaSeEntrou = true;
				break;
			}
		}
		if (verificaSeEntrou == true) {
			verificaSeEntrou = false;
		} else {
			count++;
		}

		/**
		 * Este for realiza a verificação se na String tem uma letra maiuscula
		 * 
		 * @author Gabriel Krzizanowski
		 */
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				verificaSeEntrou = true;
				break;
			}
		}

		if (verificaSeEntrou == true) {
			verificaSeEntrou = false;
		} else {
			count++;
		}

		/**
		 * Este for realiza a verificação se na String tem uma letra minuscula
		 * 
		 * @author Gabriel Krzizanowski
		 */
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				verificaSeEntrou = true;
				break;
			}
		}

		if (verificaSeEntrou == true) {
			verificaSeEntrou = false;
		} else {
			count++;
		}

		/**
		 * Este for realiza a verificação se na String tem um caracter especial
		 * 
		 * @author Gabriel Krzizanowski
		 */
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (specialCharactersString.contains(Character.toString(ch))) {
				verificaSeEntrou = true;
				break;
			}
		}

		if (verificaSeEntrou == true) {
			verificaSeEntrou = false;
		} else {
			count++;
		}

		/**
		 * Ultima verificacao para checarmos se a String tem o valor exigido pelo
		 * programa
		 * 
		 * @author Gabriel Krzizanowski
		 */
		if (str.length() + count >= 6) {
			return count;
		} else {
			count += 6 - str.length() - count;
			return count;
		}

	}

}
