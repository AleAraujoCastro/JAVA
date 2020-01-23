package exercicio01;

public class Lampada {

	public String nome;
	public String modelo;
	public String tensao;
	public int potencia;
	public String cor;
	public String TipoDeLuz;
	public int garantia;
	public double preco;
	
	
	@Override
	public String toString() {
		return "Lampada [ nome = " + nome + ", modelo = " + modelo + ", tensao = " + tensao + ", potencia = " + potencia
				+ ", cor = " + cor + ", TipoDeLuz = " + TipoDeLuz + ", garantia = " + garantia + ", preco = " + preco + " ]";
	}
	
	
	
	

}
