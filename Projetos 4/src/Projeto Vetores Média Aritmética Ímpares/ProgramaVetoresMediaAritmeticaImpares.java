package exercicio14;

import java.util.Scanner;

public class ProgramaVetoresMediaAritmeticaImpares {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int soma = 0;
		int media = 0;
		int impar = 0;
		
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
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
				media = soma/impar;
				
			}			
		}
		
		System.out.println();
		System.out.println("A soma de todos elementos ímpares desse vetor é: " + soma);
		System.out.println("A média aritmética simples do elementos ímpares é: " + media);
		
		

	}

}
