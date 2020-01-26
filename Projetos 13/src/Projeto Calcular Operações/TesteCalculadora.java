package exercicio01;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o primeiro número: ");
	double x = scan.nextDouble();
	
	
	System.out.println("Entre com o segundo número: ");
	double y = scan.nextDouble();
		
	System.out.println();
	
	for(Operacao op : Operacao.values()) {
		System.out.print(x + " ");
		System.out.print(op.toString() + " ");
		System.out.print(y + " = ");
		System.out.println(op.executarOperacao(x, y));
		
		String pf = new String();
		
	
		
	}
		
	}

}
