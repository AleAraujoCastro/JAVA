package exercicio01;

public class Lampada {
	
	private String nome;
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String TipoDeLuz;
	private int garantia;
	private double preco;
	
	private boolean ligada;
	
	
	public Lampada() {
		
	}
	
	
	public Lampada(String nome, String modelo, String tensao, int potencia, String cor, String tipoDeLuz, int garantia,
			double preco, boolean ligada) {
		
		this.nome = nome;
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.TipoDeLuz = tipoDeLuz;
		this.garantia = garantia;
		this.preco = preco;
		this.ligada = ligada;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = "GE";
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		modelo = "A60";
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		tensao = "Bivolt";
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		potencia = 7;
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		cor = "Amarela";
		this.cor = cor;
	}

	public String getTipoDeLuz() {
		return TipoDeLuz;
	}

	public void setTipoDeLuz(String tipoDeLuz) {
		tipoDeLuz = "Amarela";
		TipoDeLuz = tipoDeLuz;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		garantia = 36;
		this.garantia = garantia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		preco = 3.5;
		this.preco = preco;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		if(ligada == true) {
			System.out.println("Ligada");
		}else {
			System.out.println("Desligada");
		}
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("Lâmpada está ligada!");
			} else {
				System.out.println("Lâmpada está desligada!");
			}
	}
	
	public void mudarEstado(){
		if(isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}

}
