package exercicio06;

import java.util.Scanner;

public class ProgramaCriarVetorAeBSomaC {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for(int i = 0, j = 0; i<vetorA.length; i++, j++) {
			System.out.println("Entre com o valor do Vetor A da posição " + i);
			vetorA[i] = teclado.nextInt();			
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do Vetor B da posição " + i);
			vetorB[i] = teclado.nextInt();
		}
		
		for(int i = 0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i<vetorC.length;i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		System.out.println();
		
		
		
		
		
	}

}
