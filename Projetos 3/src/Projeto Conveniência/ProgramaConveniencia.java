package exercicio25;

import java.util.Scanner;

public class ProgramaConveniencia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//System.out.println();
		//System.out.println();
		
		boolean sair = false;
		double preco;
		String contComp = "";
		double total = 0;
		double dinheiro = 0;
		double troco = 0;
		String output;
		
		
		do {
				

			System.out.println("Deseja informar uma nova compra? S/N" );
			contComp = teclado.nextLine();
			
		if(contComp.equalsIgnoreCase("s")){
			
			sair = true;
			
			output = "Lojas Tabajara\n";
			
			System.out.println("Entre com a quantidade de produtos:");
			int prod = teclado.nextInt();
			
			total = 0;
			
			for(int i = 1; i <= prod; i++) {
				System.out.println("Entre com o preço do produto " + i);
				preco = teclado.nextDouble();
				total += preco;
				
				output += "Produto " + i + ": R$ " + preco + "\n";
				
			}
					
					output += "Total: R$" + total + "\n";
					
					System.out.println("TOTAL: R$" + total);
					
					System.out.println("Valor pago: ");
					dinheiro = teclado.nextDouble();
					
					output += "Dinheiro: R$" + dinheiro + "\n";
					
					troco = dinheiro - total;
					
					output += "TROCO: R$" + troco;
					
					System.out.println(output);
					
			}else {			
				sair = false;
			}
		}while(!sair);

	}

}
