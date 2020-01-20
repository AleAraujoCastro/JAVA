package exercicio23;

import java.util.Scanner;

public class PragramaTabajaraCarnes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o tipo de Carne: ");
		System.out.println("1 - Filé Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		System.out.println("----------------------------------");
		int tipocarne = teclado.nextInt();
		
		System.out.println("Entre com a quantidade (em Kg) de");
		double kg = teclado.nextDouble();
		
		double precoKg = 0;
		String carne = "";
		
		if (tipocarne == 1) {
			carne = "Filé Duplo";
			if(kg <= 5) {
				precoKg = 4.90;				
			}else {
				precoKg = 5.80;
			}
		}if (tipocarne == 2) {
			carne = "Alcatra";
			if(kg <= 5) {
				precoKg = 5.90;
			}else {
				precoKg = 6.80;
			}			
		}if(tipocarne == 3) {
			carne = "Picanha";
			if(kg <= 5) {
				precoKg = 6.90;
			}else {
				precoKg = 7.80;
			}			
		}
		
		double precoTotal = kg * precoKg;
		
		System.out.println("Forma de Pagamento: 1[CRÉDITO] - 2[DÉBITO] - 3[DINHEIRO]");
		int formapg = teclado.nextInt();
		
		
		double totalPg = 0;
		
		System.out.println("----------------------------------");
		System.out.println("         CUPOM FISCAL        ");
		System.out.println("----------------------------------");
		System.out.println("TIPO DE CARNE: " + tipocarne);
		System.out.println("CARNE: " + carne);
		System.out.println("PREÇO POR KILO: " + precoKg);
		System.out.println("KG: " + kg );
		System.out.println("PREÇO TOTAL: " + precoTotal);
		System.out.println("FORMA DE PAGAMENTO: " + formapg);		
		
		
		if(formapg == 1) {
			double desc = (precoTotal * 5)/100;
			totalPg = precoTotal - desc;	
			System.out.println("DESCONTO: " + desc);
			System.out.println("TOTAL Á PAGAR: " + totalPg);		
		
		}
		System.out.println("-----------------------------------");
		
		if (tipocarne != 1 && tipocarne != 2 && tipocarne != 3) {
			System.out.println("Tipo de carne inválido!");
		}

	}

}
