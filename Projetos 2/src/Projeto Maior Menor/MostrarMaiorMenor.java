package exercicio07;

import java.util.Scanner;

public class MostrarMaiorMenor {

	public static void main(String[] args) {
	
		
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int n1  = teclado.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int n2 = teclado.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		int n3 = teclado.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O n�mero maior � o " + n1);
		}else if (n2 >= n1 && n2 >= n3) {
			System.out.println("O n�mero maior � o " + n2);		
		}else if (n3 >= n1 && n3 >= n2) {
			System.out.println("O n�mero maior � o " + n3);
		}if(n1 <= n2 && n1 <= n3) {
			System.out.println("O n�mero menor � o " + n1);
		}else if (n2 <= n1 && n2 <= n3) {
			System.out.println("O n�mero menor � o " + n2);		
		}else if (n3 <= n1 && n3 <= n2) {
			System.out.println("O n�mero menor � o " + n3);
		}
		

	}

}
