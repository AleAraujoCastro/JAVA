package exercicio34;

import java.util.Scanner;

public class ProgramaVetoresRelacaoParesDeZero {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o n�mero na posi��o " + i + " do vetor A");
			vetorA[i] = teclado.nextInt();
		}
		
		for(int i = 0; i<vetorA.length;i++) {
		System.out.println();
		System.out.println("Analizando o n�mero " + vetorA[i]);
		System.out.println();
		
		for (int j = 2; j < vetorA[i]; j++) {
			
			if(j % 2 == 0) {
				System.out.println(j + " � par!");
				}	
			
			}
		
		}
		
		System.out.println();

	}

}
