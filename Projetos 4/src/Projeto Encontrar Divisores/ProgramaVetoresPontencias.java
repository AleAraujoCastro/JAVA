package exercicio36;

import java.util.Scanner;

public class ProgramaVetoresPontencias {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		double[] vetorA = new double[11];
		
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o número na posição " + i + " do vetor A");
			vetorA[i] = teclado.nextInt();
			vetorA[i] = Math.pow(2, vetorA[i]);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		
		System.out.println();

	}

}
