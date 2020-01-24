package exercicio03;

public class Mamifero extends Animal {

	
	public Mamifero() {
		this.setCor("Marrom");
		this.setAmbiente("Terra");
	}

	
	private String alimento() {
		String alimento = "Mel";
		
		return alimento;
	}
	
	
	@Override
	public String toString() {
		String s = super.toString() + "\n";
		s += "Alimento: " + alimento();
		return s; 
	}
}
