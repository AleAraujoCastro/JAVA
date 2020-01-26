package exercicio01;

import java.util.Scanner;

public class TesteContato {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while(opcao != 3) {
			opcao = obterOpcaoMenu(scan);	
			
			if (opcao == 1) { // Consultar Contato
				consultarContato(scan, agenda);
			}else if(opcao == 2){ // Adicionar Contato
				adicionarContato(scan, agenda);
			}
		}	
		
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leInformacaoString(scan, "Entre com o nome do contato a ser pesquisado: ");
		try {
			if(agenda.ConsultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato Existe!");
			}
		} catch (ContatoNãoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		try {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = leInformacaoString(scan, "Entre com o nome do contato: ");
		String telefone = leInformacaoString(scan, "Entre com o telefone do contato: ");
		String email = leInformacaoString(scan, "Entre com o email do contato: ");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		System.out.println("\nContato a ser criado: ");
		System.out.println(contato);
		
		agenda.adicionarContato(contato);
		
		}catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da Agenda: ");
			System.out.println(agenda);
		}
		
	}
	
		public static String leInformacaoString(Scanner scan, String msg){
			System.out.println(msg);
			String entrada = scan.nextLine();
			return entrada;
		}
		
		
		public static int obterOpcaoMenu(Scanner scan){
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida) {
			System.out.println("------------ MENU ------------");
			System.out.println("Digite 1: Consultar Contato");
			System.out.println("Digite 2: Adicionar Contato");
			System.out.println("Digite 3: Sair");
			System.out.println("------------------------------");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao == 1 || opcao == 2 || opcao == 3){
					entradaValida = true;
				}else {
					throw new Exception ("Entrada Inválida");
				}
			}
			catch(Exception e){
				System.out.println("Entrada Inválida! Digite novamente... \n");
			}
		}
		return opcao;
	}

}
