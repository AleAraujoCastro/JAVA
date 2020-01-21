package exercicio15;

import java.util.Scanner;

public class ProgramaVetoresPercentualPareseImpares {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int par = 0;
		
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = teclado.nextInt();
			
		}
		
		
		System.out.println();
		
		int impar = 0;
		for(int i = 0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		}
			
			par = vetorA.length - impar;
			//vetorA.length-----------100%
			//par -------------------- x
			//= x * vetorA.length == par * 100
			//= x = (par * 100)/vetorA.length
			double porPar = (par * 100)/vetorA.length;
			double porImpar = 100 - porPar;
			
			
			
			System.out.print("Vetor A = ");
			for(int i = 0; i<vetorA.length;i++) {
				System.out.print(vetorA[i] + " ");
			}
			
			System.out.println();
			
			System.out.println("Porcentagem Pares: " + porPar + "%");
			System.out.println("Porcentagem Ímpares: " + porImpar + "%");
			
	}

}
