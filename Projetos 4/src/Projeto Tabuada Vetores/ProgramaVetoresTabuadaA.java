package exercicio32;

import java.util.Scanner;

public class ProgramaVetoresTabuadaA {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[5];
		
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o número na posição " + i + " do vetor A");
			vetorA[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < vetorA.length;i++) {
			
			System.out.println("Tabuada do Vetor " + vetorA[i]);
			
			for(int j = 0; j <= 10;j++) {
			int mult = vetorA[i] * j;
			System.out.println(vetorA[i] + " x " + j + " = " + mult);
		}
			
			System.out.println();
		
	}
		
		
	}

}
