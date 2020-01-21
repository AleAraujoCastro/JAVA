package exercicio18;

import java.util.Scanner;

public class ProgramaVetoresIdadeMaiorMenorPosicao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int idade = 0;
		/*int idadeMaior = Integer.MIN_VALUE;
		int idadeMenor = Integer.MAX_VALUE;
		int posMaior = 0;
		int posMenor = 0;*/
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade " + (i+1));
			vetorA[i] = teclado.nextInt();
		}
		
		int idadeMaior = vetorA[0];
		int posMaior = 0;
		int idadeMenor = vetorA[0];
		int posMenor = 0;
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] > idadeMaior) {
				idadeMaior = vetorA[i];
				posMaior = i;
			}
		}	
		
		for(int i = 0; i<vetorA.length; i++) {	
			if(vetorA[i] < idadeMenor) {
				idadeMenor = vetorA[i];
				posMenor = i;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("A maior idade dentre o grupo é: " + idadeMaior + " na posição " + posMaior );
		System.out.println("A menor idade dentre o grupo é: " + idadeMenor + " na posição " + posMenor );
	}

}
