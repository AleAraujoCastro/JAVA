package exercicio02;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		
		conta.setNumero("123456");
		conta.setAgencia("Caixa");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
		
		
		
		boolean saqueEfetuado = conta.sacar(30);
		
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com Sucesso!" );
			conta.consultarSaldo();
		}else {
			System.out.println("Saque não Efetuado... Saldo Insuficente!");
		}
		
		System.out.println();
		
		saqueEfetuado = conta.sacar(500);
		
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com Sucesso!" );
			conta.consultarSaldo();
		}else {
			System.out.println("Não é possivel efetuar o saque. Saldo Insuficente!");
		}
		
		System.out.println();
		
		conta.depositar(500);
		
		conta.consultarSaldo();
		
		if(conta.verificarEspecial()) {
			System.out.println("Está utilizando Cheque Especial!");
		}else {
			System.out.println("Não está utilizando Cheque Especial!");
		}
		
		System.out.println();
		
		conta.sacar(600);
		conta.consultarSaldo();
		
		if(conta.verificarEspecial()) {
			System.out.println("Está utilizando Cheque Especial!");
		}else {
			System.out.println("Não está utilizando Cheque Especial!");
		}
		
		System.out.println();

		conta.setAgencia("Banespa");
		conta.setNumero("1551-10");
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Número: " + conta.getNumero());
		
	}

}
