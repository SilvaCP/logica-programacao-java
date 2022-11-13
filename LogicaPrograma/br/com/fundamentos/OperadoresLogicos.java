package br.com.fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaior100 = true;
		Boolean periodoDeDesconto = false;
		Boolean jaFezCompras = false;
		Boolean pagamentoAvista = true;
		
		//Boolean aplicarDesconto = carrinhoMaior100 && periodoDeDesconto && jaFezCompras;
		Boolean aplicarDesconto = carrinhoMaior100 && (periodoDeDesconto || jaFezCompras) && pagamentoAvista;
		
		
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique desconto.");
		}else {
			System.out.println("Não aplique desconto.");
		}
		
//		Boolean aplicarDesconto = carrinhoMaior100 || periodoDeDesconto;
//	
//		if(aplicarDesconto) {
//			System.out.println("Sim! Aplique desconto.");
//		}else {
//			System.out.println("Não aplique desconto.");
//		}
	}
}
