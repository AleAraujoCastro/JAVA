package exercicio20;

import java.util.Scanner;

public class ProgramaCriminologico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Telefonou para a V�tima?  ");
		String tel = teclado.nextLine();
		
		System.out.print("Esteve no local do crime?  ");
		String local = teclado.nextLine();
		
		System.out.print("Mora Perto da V�tima?  ");
		String mora = teclado.nextLine();
		
		System.out.print("Devia para a V�tima?  ");
		String devia = teclado.nextLine();
		
		System.out.print("J� trabalhou com a V�tima?  ");
		String trabalhou = teclado.nextLine();
		
		int cont = 0;
		
		if(tel.equalsIgnoreCase("S")) {
			cont++;
		}if (local.equalsIgnoreCase("S")) {
			cont++;
		}if (mora.equalsIgnoreCase("S")) {
			cont++;
		}if (devia.equalsIgnoreCase("S")) {
			cont++;
		}if (trabalhou.equalsIgnoreCase("S")) {
			cont++;
		}			
			
			if(cont <= 1) {
				System.out.println("INOCENTE!");
			}else if (cont == 2) {
				System.out.println("SUSPEITO!");
			}else if (cont >= 3 && cont <= 4){
				System.out.println("CUMPLICE!");				
			}else if (cont == 5) {
				System.out.println("ASSASSINO!");
			}			

	}

}
