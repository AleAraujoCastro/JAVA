package exercicio02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return (this.getRendaBruta()*10)/100;
	}
	
	
	@Override
	public String toString() {
		String s = "PESSOA JURÍDICA: \n";
		s += super.toString() + "\n";
		s += "CNPJ: " + this.cnpj + "\n";
		s += "Imposto a ser Pago: " + calcularImposto();
		return s;
	}
	
}
