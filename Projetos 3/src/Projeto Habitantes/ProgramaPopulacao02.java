package exercicio05;

import java.util.Scanner;

public class ProgramaPopulacao02 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		boolean infoValida = false;		
		double popA;
		double popB;
		double taxaA = 0;
		double taxaB = 0;
		int cont = 0;
		
		
	do {
		
		System.out.println("Entre com a popula��o A: ");
		popA = teclado.nextDouble();
		
		
		if(popA > 0) {
			infoValida = true;
		}else {
			System.out.println("Popula��o a precisa ser maior que 0!");
		}
	}while(!infoValida);
	
			infoValida = false;
	
	do {
		
		System.out.println("Entre com a porcentagem da popula��o A: ");
		taxaA = teclado.nextDouble();
		
		
		if(popA > 0) {
			infoValida = true;
		}else {
			System.out.println("A porcentagem de crescimento precisa ser maior que 0!");
		}
	}while(!infoValida);
	
	
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a popula��o B: ");
			popB = teclado.nextDouble();
			
			
			if(popB > 0) {
				infoValida = true;
			}else {
				System.out.println("Popula��o a precisa ser maior que 0!");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a porcentagem da popula��o B: ");
			taxaB = teclado.nextDouble();
			
			
			if(popB > 0) {
				infoValida = true;
			}else {
				System.out.println("A porcentagem de crescimento precisa ser maior que 0!");
			}
		}while(!infoValida);
		
		while (popA <= popB) {
			popA += (popA * taxaA)/100;
			popB += (popB * taxaB)/100;
			cont++;
		}
		
		System.out.println("POPULA��O A: " + popA);
		System.out.println("POPULA��O B: " + popB);
		System.out.println("QUANTIDADE DE ANOS: " + cont + " anos");
		
		
	}

}
