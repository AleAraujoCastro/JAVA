package exercicio01;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	
	public ContaBancaria() {
	
	}
	
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean sacar(double saque) {
		
		if((this.saldo - saque) >= 0) {
			this.saldo -= saque;
			return true;
		}
			return false;
	}
	
	
	public void depositar(double dep) {
		this.saldo = dep;
		
	}


	@Override
	public String toString() {
		return "ContaBancaria [Nome do Cliente = " + nomeCliente + "; Número da Conta = " + numConta + "; Saldo = R$" + this.saldo + "]";
	}
	
	

}
