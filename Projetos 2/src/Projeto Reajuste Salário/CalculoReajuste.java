package exercicio11;

import java.util.Scanner;

public class CalculoReajuste {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Salário do Funcionário: ");
		double sal = teclado.nextDouble();
		double reaj = 0;
		double percentual = 0;
		
		System.out.println("Salário Atual: " + sal);
		
		if(sal <= 280) {
			percentual = 20;
			reaj = (sal * percentual)/100;			
			sal += (sal * 20)/100;						
		}else if (sal > 280 && sal <= 700) {
			percentual = 15;
			reaj = (sal * 15)/100;		
			sal += (sal * 15)/100;
		}else if (sal > 700 && sal <= 1500) {
			percentual = 10;
			reaj = (sal * 10)/100;
			sal += (sal * 10)/100;
		}else if (sal > 1500) {
			percentual = 5;
			reaj = (sal * 5)/100;
			sal += (sal * 5)/100;
			
		}
		
		System.out.println("Percentual de aumento aplicado: " + percentual + "%");
		System.out.println("O valor do aumento: " + reaj );						
		System.out.println("Salário Reajustado: " + sal);
		
	}

}
