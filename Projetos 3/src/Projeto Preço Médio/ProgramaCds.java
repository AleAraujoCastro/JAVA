package exercicio22;

import java.util.Scanner;

public class ProgramaCds {

	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de Cd's: ");
		int cds = teclado.nextInt();
		
		
		double soma = 0;
		double medio = 0;
		double preco;
		
		for(int i = 0; i < cds; i++) {
			
			System.out.println("Entre com o valor do Cd " + (i+1));
			preco = teclado.nextDouble();			
			
			soma += preco;
			medio = soma/cds;			
		}
		
		System.out.println("Total de Cd's: " + cds);
		System.out.println("Valor Total Investido: R$" + soma);
		System.out.println("Valor Médio de cada Cd: R$" + medio);

	}

}
