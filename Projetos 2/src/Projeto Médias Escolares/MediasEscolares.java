package exercicio14;

import java.util.Scanner;

public class MediasEscolares {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		
		double media = (nota1 + nota2)/2;
		String conc = "";
		
		System.out.println("Média: " + media);
		
		if(media >= 9 && media <= 10) {
			conc = "A";
		}else if(media >= 7.5 && media < 9) {
			conc = "B";
		}else if (media >= 6 && media < 7.5) {
			conc = "C";
		}else if (media >= 4 && media < 6) {
			conc = "D";
		}else if (media < 4) {
			conc = "E";
		}
		
		System.out.println("CONCEITO: " + conc);
		
		switch(conc) {
		
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO!");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO!");
			break;
		}

	}

}
