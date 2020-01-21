package exercicio33;

import java.util.Scanner;

public class ProgramaVetoresAPrimo {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.println("Entre com o número na posição " + i + " do vetor A");
			vetorA[i] = teclado.nextInt();
		}
		
		boolean primo;
		String msg;
		
		
		for(int i = 0; i<vetorA.length;i++) {
		
		primo = true;
		
		for(int j = 2; j<vetorA[i]; j++) {
			if(vetorA[i] % j == 0) {
				primo = false;
				break;
			}	
		}
		
		
		msg = "";
		if(primo) {
			msg = "Primo!";
		}else {
			msg = "Não é primo!";
		}
		
			System.out.println(vetorA[i] + " - "+ msg);
		}		

	}

}
