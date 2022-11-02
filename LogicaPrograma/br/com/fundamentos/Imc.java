package br.com.fundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		System.out.println("O seu IMC é: " + imc );
		
		scanner.close();
	}

}
