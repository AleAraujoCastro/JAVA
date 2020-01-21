package exercicio16;

import java.util.Scanner;

public class ProgramaVetoresSomaMediaComplexo {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int soma = 0;
		int igual = 0;
		int soma2 = 0;
		int media = 0;
		int qtdMaior = 0;
		
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = teclado.nextInt();
			
		}
		
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] < 15) {
				soma += vetorA[i];
			}
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] == 15) {
				igual++;
			}
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] > 15) {
				qtdMaior++;
				soma2 += vetorA[i]; 
				media = soma2 /qtdMaior;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma dos menores que 15: " + soma);
		System.out.println("Quantidade dos números iguais a 15: " + igual);
		System.out.println("Média dos que são maiores que 15: " + media);
		
		
	}

}
