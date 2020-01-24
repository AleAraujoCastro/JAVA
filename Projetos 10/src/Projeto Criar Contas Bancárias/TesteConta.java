package exercicio01;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		
		/*************************************Teste 01************************************************/
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Teste ContaBancária ***");
		
		ContaBancaria conta1 = new ContaBancaria();
		
		System.out.println("Entre com o nome do Cliente da Conta Simples: ");
		conta1.setNomeCliente(scan.nextLine());
		
		System.out.println("Entre com o número da Conta: ");
		conta1.setNumConta(scan.nextInt());
		
		
		conta1.depositar(100);
		
		
		System.out.println(conta1);
		
	}
	
	
		
	/*************************************Teste 02************************************************/
		
		/*
		System.out.println("*** Teste Conta Poupança ***");
		
		ContaPoupanca contaPoup = new ContaPoupanca();
		
		System.out.println("Entre com o nome do Cliente da Conta Poupança: ");
		contaPoup.setNomeCliente(scan.nextLine());
		
		System.out.println("Entre com o número da Conta: ");
		contaPoup.setNumConta(scan.nextInt());
		
		contaPoup.setDiaRendimeto(14);
		
		contaPoup.depositar(100);
		
		
		
		
		if(contaPoup.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de: " + contaPoup.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!");
		}
		
		
		System.out.println(contaPoup);
		
		System.out.println(); 
		
	}
		*/
		
	
	/*************************************Teste 03************************************************/
		
		/*
		ContaEspecial contaEsp = new ContaEspecial();
		
		System.out.println("Entre com o nome do Cliente da Conta Especial: ");
		contaEsp.setNomeCliente(scan.nextLine());
		
		System.out.println("Entre com o número da Conta: ");
		contaEsp.setNumConta(scan.nextInt());
		
		contaEsp.setLimite(50);
		
		contaEsp.depositar(100);
		
		realizarSaque(contaEsp, 50);
		
		realizarSaque(contaEsp, 70);
		
		realizarSaque(contaEsp, 80);
		
		
		System.out.println(contaEsp);
		
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
		if(conta.sacar(valor)) {
			System.out.println("Saque Efetuado com Sucesso! Saldo Atual = R$" + conta.getSaldo());
		}else {
			System.out.println("Saldo Insulficiente para saque de R$" + valor + ", saldo de R$" + conta.getSaldo());
		}
	}
	*/
}
