package br.com.fundamentos;

import java.util.Scanner;

public class Constantes {
	static final int IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		}else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		
		sc.close();
	}

}
