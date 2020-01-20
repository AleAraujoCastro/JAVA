package exercicio20;

import java.util.Scanner;

public class ProgramaMediaIdade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas: ");
		int num = teclado.nextInt();
		
		int soma = 0;
		int media = 0;
		int idade;
		String turma = "";
		
		for(int i = 0; i < num; i++ ) {
			System.out.println("Entre com a idade " + (i+1));
			idade = teclado.nextInt();
			soma += idade;
			media = soma/num;		
		}
		
		if(media >= 0  && media <= 25) {
			turma = "Jovem";
		}else if(media >= 26 && media <= 60) {
			turma = "Adulta";
		}else if (media > 60) {
			turma = "Idosa";
		}else {
			System.out.println("Turma Inexistente!");
		}
		
		System.out.println("MEDIA: " + media + " Anos.");
		System.out.println("TURMA: " + turma);

	}

}
