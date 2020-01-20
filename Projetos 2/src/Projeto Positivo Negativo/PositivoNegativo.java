package exercicio02;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Entre com um número: ");
		int num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num);
			System.out.println("Este número é Par!");
		}else {
			System.out.println(num);
			System.out.println("Este número é Impar!");
		}
		

	}

}
