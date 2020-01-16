package exercicio9;

import java.util.Scanner;

public class ProgramaGraus {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in) ;
		
		System.out.println("Qual a temperatura em graus Farenheit: ");
		double graus = teclado.nextDouble();
		
		double c = (5 * (graus - 32) / 9);
		
		System.out.println("A temperatura em graus Celsius é de " + c + "°");

	}

}
