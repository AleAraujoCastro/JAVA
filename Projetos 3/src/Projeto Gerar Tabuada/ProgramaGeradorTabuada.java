package exercicio12;

import java.util.Scanner;

public class ProgramaGeradorTabuada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual tabuada deseja? ");
		int tab = teclado.nextInt();
		
		System.out.println();
		System.out.println("Tabuada do " + tab + ":");
		System.out.println();
		
		for(int i = 0; i <= 10;i++) {
			int mult = tab * i;
			System.out.println(tab + " x " + i + " = " + mult);
		}
		

	}

}
