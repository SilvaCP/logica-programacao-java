package br.com.fundamentos;

import java.util.Scanner;

/*	O seu programa deve receber a nota do aluno pelo 
 * console e depois você vai fazer uma operação lógica para saber se a nota do aluno
 * é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma 
 * variável do tipo Boolean. Por último, você deve utilizar a variável do tipo Boolean 
 * com a estrutura de decisão if para imprimir, no console, uma mensagem que vai 
 * dizer se o aluno passou ou não passou.
 * */ 
public class Graduacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a sua nota! ");
		double nota = sc.nextDouble();
		if(nota > 70) {
			System.out.println("Aluno aprovado! Parabéns! " + nota);
		} 
		boolean resultado = nota > 70;
		if(resultado = true) {
			System.out.println(resultado + " Aluno passou de ano!");
		}
	}

}
