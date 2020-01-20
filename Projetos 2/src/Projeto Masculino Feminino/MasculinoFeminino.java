package exercicio03;

import java.util.Scanner;

public class MasculinoFeminino {

	public static void main(String[] args) {
		
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu sexo: ");
		
		String sexo = teclado.nextLine();		
				
		if(sexo.equalsIgnoreCase("M") ) {
			System.out.println("Masculino");
		}else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");			
		}else {
			System.out.println("Sexo Inválido");
		}
		
	}

	
}
