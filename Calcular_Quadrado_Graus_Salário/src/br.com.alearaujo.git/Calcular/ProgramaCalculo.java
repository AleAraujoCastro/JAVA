package exercicio11;

import java.util.Scanner;

public class ProgramaCalculo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = teclado.nextInt();
		
		System.out.println("Digite um número real: ");
		double n3 = teclado.nextDouble();
		
		int a = (n1 * (n2 / 2));
		
		System.out.println("O produto do primeiro com a metade do segundo é: " + a);
		
		double b = (3 * n1) + n3;
		
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + b);
		
		double c = Math.pow(n3, 3);
		
		System.out.println("O terceiro elevado ao cubo é: " + c);
		
		
		

	}

}
