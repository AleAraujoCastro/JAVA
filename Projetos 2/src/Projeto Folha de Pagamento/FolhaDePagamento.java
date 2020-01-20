package exercicio12;

import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu valor por hora trabalhado: ");
		double valorHora = teclado.nextDouble();
		
		System.out.println("Quantos horas de trabalho no mês: ");
		double horaMes = teclado.nextDouble();
		
		double salarioB = horaMes * valorHora;
		double ir = 0;
		int irPorc = 0;
		double inss = (salarioB * 10)/100;
		double fgts = (salarioB * 11)/100;
		
		
		
		
		System.out.println("Salário Bruto: " + salarioB);
		
		if(salarioB <= 900) {
			System.out.println("Isento do Imposto de Renda");
		}else if (salarioB <= 1500){
			irPorc = 5;			
		}else if (salarioB <= 2500) {
			irPorc = 10;		
		}else if (salarioB > 2500) {
			irPorc = 20;						
		}
		
		ir = (salarioB * irPorc)/100;
		double totDesc = ir + inss;
		double saliq = salarioB - totDesc;
		
		System.out.println("(-) IR " + irPorc + "%: " + "R$ " + ir );
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("(-) FGTS (11%): R$ " + fgts);
		System.out.println("Total de desconto: R$ " + totDesc);
		System.out.println("Salário Líquido: R$ " + saliq);
		
		
			
	}

}
