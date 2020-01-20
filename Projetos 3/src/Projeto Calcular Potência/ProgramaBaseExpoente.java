package exercicio13;

import java.util.Scanner;

public class ProgramaBaseExpoente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a base: ");
		int base = teclado.nextInt();
		
		System.out.println("Entre com a expoente: ");
		int exp = teclado.nextInt();
		
		int resultado = 1;
		
		for (int i = 0;i < exp; i++) {
			resultado *= base;
						
		}
		System.out.println("Resultado: " + resultado);

	}

}
