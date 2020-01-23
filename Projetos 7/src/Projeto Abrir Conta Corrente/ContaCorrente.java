package exercicio02;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	boolean sacar(double valor) {
		//tem saldo na conta
		if(saldo >= valor) {
			saldo -= valor;
		return true;
		}else {
			if(especial) {// verificar se tem saldo do limite especial
				double limite = limiteEspecial + saldo;
				if(limite >= valor) {
					saldo -= valor;
					return true;
			}else {
				return false;
				}
			}else {
				return false;
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarEspecial() {
		return saldo < 0;
	}
	
	
}
