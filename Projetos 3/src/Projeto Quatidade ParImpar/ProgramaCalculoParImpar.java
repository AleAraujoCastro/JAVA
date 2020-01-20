package exercicio14;

import java.util.Scanner;

public class ProgramaCalculoParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int somaP = 0;
		int somaI = 0;
		int num = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = teclado.nextInt();
			
			if(num%2 == 0) {
				somaP++;			
			}else if (num%2 == 1) {
				somaI++;				
			}			
		}
		
		System.out.println("Pares: " + somaP);
		System.out.println("Ímpares: " + somaI);

	}

}
