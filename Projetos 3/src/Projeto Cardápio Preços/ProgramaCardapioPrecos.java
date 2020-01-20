package exercicio32;

import java.util.Scanner;

public class ProgramaCardapioPrecos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean invalid = true;
		int cod = 0;
		int quant = 0;
		String output = "";
		double preco = 0;
		double total = 0;
	
		
		
		do {
				invalid = true;
		
		System.out.println("Entre com o código do item: ");
		cod = teclado.nextInt();
		
		System.out.println("Entre com  a quantidade: ");
		quant = teclado.nextInt();
		
		
		
		if(cod == 0 && quant == 0) {
			invalid = false;
		}else {
				if(cod == 100) {
				preco = 1.20;				
				output += "Cachorro Quente";
				}if(cod == 101) {
				preco = 1.30;
				output += "Bauru Simples";
				}if (cod == 102) {
				preco = 1.50;
				output += "Bauru com Ovo";
				}if (cod == 103) {
				preco = 1.20;
				output += "Hambúrguer";
				}if (cod == 104) {
				preco = 1.30;
				output += "Cheeseburguer";
				}if (cod == 105) {
				preco = 1.00;
				output += "Refrigerante";
			}
			
			total = preco * quant;
			System.out.println(output + " ---> " + preco + " * " + quant + " = " + total);
		}	
		
		
		}while(invalid);
		
	

	}

}
