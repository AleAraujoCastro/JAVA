package exercicio17;

import java.util.Scanner;

public class ProgramaVetoresIdadePessoas {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int idade = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade " + (i+1));
			vetorA[i] = teclado.nextInt();
		}

		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] > 35) {
				idade++;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Pessoas com idade superior a 35 anos: " + idade);
		

	}

}
