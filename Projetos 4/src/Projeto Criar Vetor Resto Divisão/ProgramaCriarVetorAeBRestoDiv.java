package exercicio10;

import java.util.Scanner;

public class ProgramaCriarVetorAeBRestoDiv {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i);
			vetorA[i] = teclado.nextInt();
			
			vetorB[i] = vetorA[i] % 2;			
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

	}

}
