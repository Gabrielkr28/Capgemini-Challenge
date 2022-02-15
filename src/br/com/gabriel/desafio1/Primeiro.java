package br.com.gabriel.desafio1;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tamanho = input.nextInt();

		String valores = "";
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j == i - 1; j++) {
				valores += "*";
			}
			valores += "\n";

		}

	}

}
