package br.com.fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int adicao = 1 + 1;
		System.out.println("Adição: " + adicao);
		int subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);
		int multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		int divisao = 4 / 2;
		System.out.println("Divisão: " + divisao);
		int modulo = 7 % 4;
		System.out.println("Módulo: " + modulo);
		int precedencia1 = 1 + 1 * 5;
		System.out.println("Precedência1: " + precedencia1);
		int precedencia2 = (1 + 1) * 5;
		System.out.println("Precedência2: " + precedencia2);
		int precedencia3 = 5 * (1 + 1);
		System.out.println("Precedência3: " + precedencia3);
		int precedencia4 = 5 * (1 + 1) + 2;
		System.out.println("Precedência4: " + precedencia4);
		int precedencia5 = 5 * ((1 + 1) + 2);
		System.out.println("Precedência5: " + precedencia5);
		
		int cinco = 5;
		int um = 1;
		int precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedência com variáveis: " + precedenciaComVariaveis);
	}
}
