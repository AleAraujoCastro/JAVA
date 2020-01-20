package exercicio21;

import java.util.Scanner;

public class ProgramaPostoGasolina {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o tipo de combustível: ");
		String comb = teclado.nextLine();
		
		System.out.println("Entre com a quantidade de litros: ");
		double litro = teclado.nextDouble();
		
		double precoA = litro * 1.90;
		double precoG = litro * 2.50;
		double precoTotal = 0;
		double desc = 0;
		double totalPagar = 0;
		
		if(comb.equalsIgnoreCase("A")) {
			precoTotal = precoA;
			comb = "ÁLCOOL";
		}else if (comb.equalsIgnoreCase("G")) {
			precoTotal = precoG;
			comb = "GASOLINA";
		}
		
		System.out.println("COMBUSTÍVEL: " + comb);
		System.out.println("LITROS: " + litro + "Lts");
		System.out.println("VALOR A PAGAR: R$" + precoTotal);
		
		if(comb.equalsIgnoreCase("ÁLCOOL")) {
			if(litro <= 20) {
				desc = (precoTotal * 3)/100;
			}else if(litro > 20) {
				desc = (precoTotal * 5)/100;
			}
		}else if(comb.equalsIgnoreCase("GASOLINA")) {
			if(litro <= 20) {
				desc = (precoTotal * 4)/100;
			}else if(litro > 20) {
				desc = (precoTotal * 6)/100;
			}
		}
		
		System.out.println("DESCONTO DE: R$" + desc);
		totalPagar = precoTotal - desc;
		System.out.println("TOTAL A SER PAGO COM DESCONTO: R$" + totalPagar);
	}

}
