package exercicio12;

import java.util.Scanner;

public class ProgramaVetoresSoma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = teclado.nextInt();
			
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
			soma += vetorA[i];
		}
		
		System.out.println();
		
		System.out.println();
		System.out.println("A soma de todos elementos desse vetor é: " + soma);
		

	}

}
