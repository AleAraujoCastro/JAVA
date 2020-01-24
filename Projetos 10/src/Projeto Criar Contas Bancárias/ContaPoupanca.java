package exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
		
		private int diaRendimeto;
		

		public int getDiaRendimeto() {
			return diaRendimeto;
		}

		public void setDiaRendimeto(int diaRendimeto) {
			this.diaRendimeto = diaRendimeto;
		}
		
		public double calcularNovoSaldo() {
			
			return this.getSaldo() + this.getDiaRendimeto();
			
		}

		@Override
		public String toString() {
			String s = "Conta Poupança [Dia de Rendimento = " + diaRendimeto + "] - ";
			s += super.toString();
		return s;
		}
		
		public boolean calcularNovoSaldo (double taxaRendimento) {
			
			Calendar hoje = Calendar.getInstance();
			
			if (this.diaRendimeto == hoje.get(Calendar.DAY_OF_MONTH)) {
				this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
				 return true;
			}else {
			return false;
			}
		}

}
