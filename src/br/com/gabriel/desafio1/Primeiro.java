package br.com.gabriel.desafio1;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tamanho = input.nextInt();
		
		
		/*
		 * O laço abaixo realiza o espaçamento de linhas dependendo do numero do degrau
		 * para assim conseguir printar o icone em sua respectiva linha.
		 * 
		 * */
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (j < tamanho - i - 1)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
		input.close();

	}

}
