package exercicio16;

import java.util.Scanner;

public class ProgramaEquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Equação do segundo grau 'ax² + bx + c' ");
		System.out.println();
		
		System.out.println("Entre com o valor de 'A': ");
		int a = teclado.nextInt();
		System.out.println("Entre com o valor de 'B': ");
		int b = teclado.nextInt();
		System.out.println("Entre com o valor de 'C': ");
		int c = teclado.nextInt();
		
		System.out.println("Segue a equação: " + a + "x² + " + b + "x + " + c + " = 0");
		
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		
				
		if(a == 0) {
			System.out.println("Equação de 2° grau não existente, pois o valor de A é 0!");
		}else if (delta < 0) {
			System.out.println("Delta = " + delta);
			System.out.println("A equação do 2° grau não possui raízes reais, pois o Delta é negativo!");
		}else if (delta == 0) {
			System.out.println("Delta = " + delta);
			System.out.println("A equação do 2° grau possui apenas uma raiz real, pois o Delta é igual a 0!");
		}else {
			System.out.println("Delta = " + delta);
			System.out.println("A equação do 2° grau possui duas raízes reais e iguais, pois o Delta é positivo!");
		}

	}

}
