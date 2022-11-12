
/*
 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
 * com a previdência, depois verifique se ela pode aposentar ou não. Nas regras desse programa a pessoa 
 * vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos. 
 * Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 * 
 * */

package br.com.fundamentos;

import java.util.Scanner;

public class Exercicio4{
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Idade: ");
		Integer idade = sc.nextInt();
		
		System.out.print("Tempo de contribuição: ");
		Integer contribuicao = sc.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean tempoDeContribuicaoSuficiente = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		Boolean podeAposentar = temIdadeParaAposentar && tempoDeContribuicaoSuficiente;
		
		if(podeAposentar) {
			System.out.println("Sim, pode aposentar! ");
		}else {
			System.out.println("Não vai ser possivel aposentar agora! ");
		}
		
		sc.close();
	}
}




