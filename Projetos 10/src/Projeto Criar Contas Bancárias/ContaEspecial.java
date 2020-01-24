package exercicio01;

public class ContaEspecial extends ContaBancaria {
	
		private double limite;

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		
		@Override
		public String toString() {
			String s = "Conta Especial [Limite = " + limite + "] - ";
			s += super.toString();
		return s;
		}
		
		
		
		public boolean sacar(double valor) {
			double saldoComLimite = this.getLimite() + this.getSaldo();
			
			if((saldoComLimite - valor)>= 0) {
				this.setSaldo(this.getSaldo() - valor);
				return true;
			}
			
				return false;
		}
}
