package br.com.fundamentos;

public class TipoLogico {
	public static void main(String[] args) {
		boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		boolean variavelFalsa = false;
		System.out.println("Variável falsa: " + variavelFalsa);
		System.out.println("--------------------------------------------------------");
		int idade = 20;
		boolean podeTirarCarteira = idade >= 18;
		if(podeTirarCarteira) {
			System.out.println("Sim ele(a), pode tirar carteira! ");
		}else{
			System.out.println("Não ele(a), não pode tirar carteira! ");
		}
	}

}
