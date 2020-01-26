package exercicio01;

public enum Operacao {
	
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	}, 
	
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	}, 
	
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}, 
	
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	
	private String operacao;

	private Operacao(String operacao) {
		this.operacao = operacao;
	}
	
	
	public abstract double executarOperacao(double x, double y);
	

	public String getOperacao() {
		return operacao;
	}
	
	
	@Override
	public String toString() {
	
		return this.operacao;
	}
	
	
	

}
