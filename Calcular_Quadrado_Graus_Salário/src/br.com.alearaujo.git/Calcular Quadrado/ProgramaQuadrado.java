package exercicio7;

import java.util.Scanner;

public class ProgramaQuadrado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		
		double lado = teclado.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é : " + area);
		
		double dobro = area * 2;
		
		System.out.println("O dobro da área é igual a: " + dobro);
		
		
		

	}

}
