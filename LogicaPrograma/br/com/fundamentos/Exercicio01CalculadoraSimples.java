package br.com.fundamentos;

import java.util.Scanner;

/* 1 Para criar uma calculadora simples você vai precisar receber três informações pelo console. 
 * 2 São os dois números que participarão da operação e também a operação que será realizada.
 * 3 Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
 * 4 Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos
 * 5 aqui no curso - o *Scanner*. Para receber a operação você pode receber também um número que vai indicar 
 * 6 a mesma. Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.
 * Com esses três valores - os dois números e qual será a operação - você pode utilizar 
 * a estrutura de decisão if para só realizar a operação que o usuário escolheu. 
 * */
public class Exercicio01CalculadoraSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Informe a operação: [ 1- Adição 2- Subtração 3- Multiplicação 4- Divisão ]: ");
		int tipoOperacao = sc.nextInt();
		
		System.out.print("Informe o segundo número: ");
		double num2 = sc.nextDouble();
		
		if (tipoOperacao == 1) {
			System.out.println("O resultado é: " + (num1 + num2));
		}if(tipoOperacao == 2) {
			System.out.println("O resultado é: " + (num1 - num2));
		}if (tipoOperacao == 3) {
			System.out.println("O resultado é: " + (num1 * num2));
		}if (tipoOperacao == 4) {
			System.out.println("O resultado é: " + (num1 / num2));
		}
		sc.close();
	}
}
