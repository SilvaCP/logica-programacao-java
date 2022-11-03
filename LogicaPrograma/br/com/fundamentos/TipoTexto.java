package br.com.fundamentos;

import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Olá " + nome + "!");
		
		sc.close();
	}
}
