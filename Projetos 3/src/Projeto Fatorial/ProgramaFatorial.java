package exercicio26;

import java.util.Scanner;

public class ProgramaFatorial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int fat = 1;
		
		
		System.out.println("Entre com o número: ");
		int num = teclado.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		
		
		
		for(int i = num; i > 1; i--) {
			fat *= i; 
			System.out.print(i + " . ");
		}
		
		System.out.print("1 = " + fat);
		

	}

}
