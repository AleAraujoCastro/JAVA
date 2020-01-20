package exercicio16;

import java.util.Scanner;

public class ProgramaEquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Equa��o do segundo grau 'ax� + bx + c' ");
		System.out.println();
		
		System.out.println("Entre com o valor de 'A': ");
		int a = teclado.nextInt();
		System.out.println("Entre com o valor de 'B': ");
		int b = teclado.nextInt();
		System.out.println("Entre com o valor de 'C': ");
		int c = teclado.nextInt();
		
		System.out.println("Segue a equa��o: " + a + "x� + " + b + "x + " + c + " = 0");
		
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		
				
		if(a == 0) {
			System.out.println("Equa��o de 2� grau n�o existente, pois o valor de A � 0!");
		}else if (delta < 0) {
			System.out.println("Delta = " + delta);
			System.out.println("A equa��o do 2� grau n�o possui ra�zes reais, pois o Delta � negativo!");
		}else if (delta == 0) {
			System.out.println("Delta = " + delta);
			System.out.println("A equa��o do 2� grau possui apenas uma raiz real, pois o Delta � igual a 0!");
		}else {
			System.out.println("Delta = " + delta);
			System.out.println("A equa��o do 2� grau possui duas ra�zes reais e iguais, pois o Delta � positivo!");
		}

	}

}
