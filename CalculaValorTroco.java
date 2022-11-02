package br.com.cursologica;

import java.util.Scanner;

// Esse algorítmo elabora um troco ao cliente.
public class CalculaValorTroco {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor passado pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}

}
