package exercicio01;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Agenda ag = new Agenda();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome da Agenda: ");
		ag.setNomeAgenda(scan.nextLine());
		
		
		System.out.println("Entre com 3 contatos... ");
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < contatos.length; i++) {
		
			Contato contato = new Contato();
		System.out.println("Contato número " + (i+1));	
		System.out.println("Entre com o nome: ");
		contato.setNome(scan.nextLine());
		System.out.println("Entre com o telefone: ");
		contato.setTelefone(scan.nextLine());
		System.out.println("Entre com o email: ");
		contato.setEmail(scan.nextLine());
		System.out.println();
		
		contatos[i] = contato; 
		}
		
		ag.setContato(contatos);
		
		if(ag != null) {
			System.out.println();
		}
		
		
	}

}
