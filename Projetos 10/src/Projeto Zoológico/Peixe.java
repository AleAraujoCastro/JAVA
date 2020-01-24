package exercicio03;

public class Peixe extends Animal {
	
	
	public Peixe() {
		 this.setPatas(0);
		 this.setAmbiente("Mar");
		 this.setCor("Cinzento");
		 
	}

	private String caracteristicas() {
		String c1 = "Barbatanas";
		String c2 = "Cauda";
		return c1 + " e "+ c2;
	}
	
	@Override
	public String toString() {
		String s = super.toString() + "\n";
		s += "Característica: " + caracteristicas();
		return s;
	}

}
