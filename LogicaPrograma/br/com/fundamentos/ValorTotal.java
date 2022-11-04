package br.com.fundamentos;

import java.util.Scanner;

/*	Exercício 04: Encontre o valor total baseado na quantidade e no desconto.
 * 
 * -	Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. 
 * 
 * -	Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
 *  
 * -	Depois você vai precisar usar uma estrutura de decisão. 
 *  
 * -	Se a quantidade desejada do produto for maior que 10 unidades,
 * -	vai ser preciso dar um desconto de 10% em cima do subtotal, 
 *
 * -	mas se for menor que 10, você NÃO aplica desconto algum.
 * 
 *	Para encontrar o valor referente ao percentual de desconto 
 *	(que vai ser 0% ou 10%, dependendo da quantidade) você multiplica o subtotal pelo próprio percentual 
 *	e divide tudo por 100.Tendo o valor referente ao percentual de desconto, 
 *	você vai retirar esse valor do subtotal. 
 *	O que sobrar será o valor total final e deverá ser apresentado no console.
 * */
public class ValorTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Informe a quantidade de produto: ");
		int quantidadeProduto = sc.nextInt(); 
		
		double subtotal = valorProduto * quantidadeProduto;
		if(quantidadeProduto > 10) {
			subtotal = subtotal - (subtotal * 10 / 100);
			System.out.println("Total à pagar é: " + subtotal);
			
		}
		
		sc.close();
	}
}
