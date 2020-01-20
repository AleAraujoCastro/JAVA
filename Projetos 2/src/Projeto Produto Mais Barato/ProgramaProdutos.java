package exercicio08;

import java.util.Scanner;

public class ProgramaProdutos {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor do primeiro produto: ");
		double prod1 = teclado.nextDouble();
		
		
		System.out.println("Qual o valor do segundo produto: ");
		double prod2 = teclado.nextDouble();
		
		
		System.out.println("Qual o valor do terceiro produto: ");
		double prod3 = teclado.nextDouble();
		
		
		System.out.println("Primeiro Produto: " + prod1);
		System.out.println("Segundo Produto: " + prod2);
		System.out.println("Terceiro Produto: " + prod3);
		
		if(prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("Você deve comprar o produto 1 de valor R$" + prod1);		
		}else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("Você deve comprar o produto 2 de valor R$" + prod2);			
		}else if(prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("Você deve comprar o produto 3 de valor R$" + prod3);
			
		}

	}

}
