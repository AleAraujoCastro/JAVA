package exercicio02;

public class ContaCorrente {

		private String numero;
		private String agencia;
		private boolean especial;
		private double limiteEspecial;
		private double valorEspecialUsado;
		private double saldo;
		
		
		public ContaCorrente() {
			
		}
		

		public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial,
				double valorEspecialUsado, double saldo) {
			super();
			this.numero = numero;
			this.agencia = agencia;
			this.especial = especial;
			this.limiteEspecial = limiteEspecial;
			this.valorEspecialUsado = valorEspecialUsado;
			this.saldo = saldo;
		}
		

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public boolean isEspecial() {
			return especial;
		}

		public void setEspecial(boolean especial) {
			this.especial = especial;
		}

		public double getLimiteEspecial() {
			return limiteEspecial;
		}

		public void setLimiteEspecial(double limiteEspecial) {
			this.limiteEspecial = limiteEspecial;
		}

		public double getValorEspecialUsado() {
			return valorEspecialUsado;
		}

		public void setValorEspecialUsado(double valorEspecialUsado) {
			this.valorEspecialUsado = valorEspecialUsado;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public boolean sacar(double valor) {
			//tem saldo na conta
			if(saldo >= valor) {
				saldo -= valor;
			return true;
			}else {
				if(especial) {// verificar se tem saldo o limite especial
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
		
		public void depositar(double valorDepositado) {
			saldo += valorDepositado;
		}
		
		public void consultarSaldo() {
			System.out.println("Saldo atual da conta = " + saldo);
		}
		
		public boolean verificarEspecial() {
			return saldo < 0;
		}
		
}
