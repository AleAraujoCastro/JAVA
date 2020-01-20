package exercicio11;

import java.util.Scanner;

public class ProgramaGerarInteiros02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		

		System.out.println("Entre com o primeiro número:");
		int num1 = teclado.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int num2 = teclado.nextInt();
		
		int soma = 0;
		
		for(int i = num1; i <= num2; i++) {
			soma += i;
			System.out.println(i);
		}
		System.out.println("SOMA: " + soma);
		
		
		

	}

}
