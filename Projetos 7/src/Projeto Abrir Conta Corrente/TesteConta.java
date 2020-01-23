package exercicio02;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.numero = "123456";
		conta1.agencia = "1234";
		conta1.especial = true;
		conta1.limiteEspecial = 500;
		conta1.saldo = -10;

		boolean saqueEfetuado = conta1.sacar(30);
		
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com Sucesso!" );
			conta1.consultarSaldo();
		}else {
			System.out.println("Saque não Efetuado... Saldo Insuficente!");
		}
		
		System.out.println();
		
		saqueEfetuado = conta1.sacar(500);
		
		if(saqueEfetuado) {
			System.out.println("Saque Efetuado com Sucesso!" );
			conta1.consultarSaldo();
		}else {
			System.out.println("Não é possivel efetuar o saque. Saldo Insuficente!");
		}
		
		System.out.println();
		
		conta1.depositar(500);
		
		conta1.consultarSaldo();
		
		if(conta1.verificarEspecial()) {
			System.out.println("Está utilizando Cheque Especial!");
		}else {
			System.out.println("Não está utilizando Cheque Especial!");
		}
		
		System.out.println();
		
		conta1.sacar(600);
		conta1.consultarSaldo();
		
		if(conta1.verificarEspecial()) {
			System.out.println("Está utilizando Cheque Especial!");
		}else {
			System.out.println("Não está utilizando Cheque Especial!");
		}
		
	}

}
