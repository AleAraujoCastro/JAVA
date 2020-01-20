package exercicio17;

import java.util.Scanner;

public class ProgramaAnoBissexto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");
		int ano = teclado.nextInt();
		
		System.out.println("ANO: " + ano);
		
		if(ano%4 == 0 && ano%100 != 0) {
			System.out.println("Esse ano é Bissexto!");
		}else {
			System.out.println("Esse ano NÃO é Bissexto!");
		}

	}

}
