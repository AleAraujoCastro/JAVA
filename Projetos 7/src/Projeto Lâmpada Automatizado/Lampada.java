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
	
	boolean ligada;
	
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lâmpada está ligada!");
			} else {
				System.out.println("Lâmpada está desligada!");
			}
	}
	
	void mudarEstado(){
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
}
