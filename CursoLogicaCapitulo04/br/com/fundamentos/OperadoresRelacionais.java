package br.com.fundamentos;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		boolean doisIgualDois = 2 == 2;
		System.out.println("2 é igual à 2? " + (2 == 2));
		
		boolean doisDiferenteDois = 2 != 2;
		System.out.println("2 é diferente de 2? " + (2 != 2));
		
		int quatro = 4;
		boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		boolean quatroMaiorOuIgualQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro " + quatroMaiorOuIgualQuatro);
		
		// Abaixo uma funcionalidade (equals).
		Integer cinco = 5;
		boolean cincoIgualCinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)? " + cincoIgualCinco);
		
		Integer seis = 6;
		boolean cincoIqualSeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)? " + cincoIqualSeis);
		
		// Abaixo exemplo com equals()
		Integer centoVinteOito = 128;
		Integer centoVinteOito2 = 128;
		boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito2);
		System.out.println("centoVinteOito.equals(centoVinteOito2)? " + centoVinteOitoIgualCentoVinteOito);
		
		// Abaixo exemplo sem equals()
		boolean centoVinteOitoIgualCentoVinteOito2 = centoVinteOito == centoVinteOito2;
		System.out.println("centoVinteOito == CentoVinteOito2 ? " + centoVinteOitoIgualCentoVinteOito2);
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
	}
}
