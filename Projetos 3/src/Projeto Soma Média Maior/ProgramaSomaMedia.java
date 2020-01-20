package exercicio08;

import java.util.Scanner;

public class ProgramaSomaMedia {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media = 0;
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
		System.out.println("Entre com um número: ");
		num = teclado.nextInt();
		
		
		soma += num;
		
		
		if(num > maior) {
			maior = num;
		}

		media = soma/5;
	
	}
		System.out.println("A soma entre eles é: " + soma);
		System.out.println("A média entre eles é: " + media);
		System.out.println("O maior entre eles é: " + maior);
		

	}

}
