package exercicio13;

import java.util.Scanner;

public class ProgramaSalario {
	
	public static void main (String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		double valorHora = teclado.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês: ");
		double horasMes = teclado.nextDouble();
		
		double salarioMes = valorHora * horasMes;
		
		System.out.println("Seu salario no mês bruto é de R$" + salarioMes);
		
		double ir = (salarioMes * 11) / 100;
		double inss = (salarioMes * 8) / 100;
		double sindicato = (salarioMes * 5) / 100;
		double descontos = ir + inss + sindicato;
		double salarioLiq = salarioMes - descontos;
		
		
		
		System.out.println("Desconto IR: " + ir);
		System.out.println("Desconto INSS: " + inss);
		System.out.println("Desconto Sindicato: " + sindicato);
		System.out.println("Total de Descontos: " + descontos);
		System.out.println("Seu Salário Liquido será de: " + salarioLiq);
		
		
		
		
		
		
		
		
		
	}
	
	

}
