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
		
		System.out.println("Entre com a população A: ");
		popA = teclado.nextDouble();
		
		
		if(popA > 0) {
			infoValida = true;
		}else {
			System.out.println("População a precisa ser maior que 0!");
		}
	}while(!infoValida);
	
			infoValida = false;
	
	do {
		
		System.out.println("Entre com a porcentagem da população A: ");
		taxaA = teclado.nextDouble();
		
		
		if(popA > 0) {
			infoValida = true;
		}else {
			System.out.println("A porcentagem de crescimento precisa ser maior que 0!");
		}
	}while(!infoValida);
	
	
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a população B: ");
			popB = teclado.nextDouble();
			
			
			if(popB > 0) {
				infoValida = true;
			}else {
				System.out.println("População a precisa ser maior que 0!");
			}
		}while(!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Entre com a porcentagem da população B: ");
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
		
		System.out.println("POPULAÇÃO A: " + popA);
		System.out.println("POPULAÇÃO B: " + popB);
		System.out.println("QUANTIDADE DE ANOS: " + cont + " anos");
		
		
	}

}
