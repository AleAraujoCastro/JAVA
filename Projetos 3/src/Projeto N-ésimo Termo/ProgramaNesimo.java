package exercicio15;

import java.util.Scanner;

public class ProgramaNesimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
		int n = teclado.nextInt();
		
		int pri = 1;
		int seg = 1;
		int proximo; 
		
		System.out.println(pri);
		System.out.println(seg);
		
		for(int i=3; i <= n;i++) {
			proximo = pri + seg;
			pri = seg;
			seg = proximo;
			
			System.out.println(proximo);
		}
		
		
		

	}

}
