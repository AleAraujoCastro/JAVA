package exercicio15;

import java.util.Scanner;

public class ProgramaTriangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Entre com o primeiro lado: ");
		int lado1 = teclado.nextInt();		
		
		System.out.println("Entre com o segundo lado: ");
		int lado2 = teclado.nextInt();
		
		System.out.println("Entre com o terceiro lado: ");
		int lado3 = teclado.nextInt();
		
		System.out.println("Lado 1: " + lado1);
		System.out.println("Lado 2: " + lado2);
		System.out.println("Lado 3: " + lado3);
		
		if(((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado3 + lado1) > lado2)) {
			System.out.println("Forma Triângulo!");
		if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
			System.out.println("Triângulo Equilátero");			
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3 ){
			System.out.println("Triângulo Isósceles");			
		}else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
			System.out.println("Triângulo Escaleno");}		
		}else{
			System.out.println("Não Forma Triângulo!");
		}
		
				
		
		
	}

}
