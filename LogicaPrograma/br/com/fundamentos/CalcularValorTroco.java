package br.com.fundamentos;

import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Informe o valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Informe a quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		System.out.println("Troco: " + resultado);
		
		scanner.close();
		
	}

}
