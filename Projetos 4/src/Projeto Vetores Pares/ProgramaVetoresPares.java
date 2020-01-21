package exercicio11;

import java.util.Scanner;

public class ProgramaVetoresPares {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int quant = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = teclado.nextInt();
			
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				quant += 1;				
			}			
		}
		
		
		System.out.println();
		System.out.println("Quantidade de números Pares: " + quant);
		

	}

}
