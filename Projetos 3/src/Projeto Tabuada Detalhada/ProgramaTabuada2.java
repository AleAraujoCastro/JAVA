package exercicio30;

import java.util.Scanner;

public class ProgramaTabuada2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int mult = 0;
		boolean invalid = true;
		int numI = 0;
		int numF = 0;
		
		System.out.println("Entre com o n�mero da tabuada: ");
		int tab = teclado.nextInt();
		
		
		do {
			
			System.out.println("Entre com o n�mero inicial: ");
			numI = teclado.nextInt();
			
			System.out.println("Entre com o n�mero final: ");
			numF = teclado.nextInt();
			
			if(numF > numI) {
				invalid = false;
			}			
		
		}while(invalid);
		
		System.out.println("Montar a tabuada de: " + tab);
		System.out.println("Come�ar por: " + numI);
		System.out.println("Terminar em: " + numF);
		System.out.println();
		System.out.println("Vou montar a tabuada de " +  tab + " come�ando em " + numI + " e terminado em " + numF + ":");
		
		for(int i = numI; i <= numF; i++) {
			mult = tab * i;
			System.out.println(tab + " X " + i + " = " + mult);
		}
		
		
		
	}

}
