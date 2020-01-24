package exercicio02;

public class PessoaFisica extends Contribuinte {
	
	
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double parcelaDeduzir = 0;
		if(this.getRendaBruta() <= 1400) {
			parcelaDeduzir = 0;
		}else if(this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100){
			parcelaDeduzir = (this.getRendaBruta() * 0.1) - 100;
		}else if(this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800){
			parcelaDeduzir = (this.getRendaBruta() * 0.15) - 270;
		}else if(this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600){
			parcelaDeduzir = (this.getRendaBruta() * 0.25) - 500;
		}else if(this.getRendaBruta() > 3600) {
			parcelaDeduzir = (this.getRendaBruta() * 0.30) - 700;
		}
		return parcelaDeduzir;
	}
	
	
	@Override
	public String toString() {
		String s = "PESSOA FÍSICA: \n";
		s += super.toString() + "\n";
		s += "CPF: " + this.cpf + "\n";
		s += "Imposto a ser Pago: " + calcularImposto();
		return s;
	}

}
