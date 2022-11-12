package br.com.fundamentos;

import java.util.Scanner;
/*
 * Faça um programa que receba:
 * O valor da conta de luz
 * Conta de água
 * Conta de telefone
 * Escola do filho
 * Fatura do cartão
 * Gastos com supermercado
 * ... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
 * 
 * */

public class Exercicio3GastoFamiliar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe os gastos deste mês com... ");
	Double total = 0.0;
	
	System.out.print("Luz, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Água, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Telefone, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Escala, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Cartão, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Supermercado, R$: ");
	total += sc.nextDouble();
	
	System.out.print("Gasto total nesse mês foi de R$: " + total);
	
	sc.close();
}
}
