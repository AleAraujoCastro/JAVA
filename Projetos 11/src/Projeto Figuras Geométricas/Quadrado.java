package exercicio01;

public class Quadrado extends Figura2D {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		int area = (int)Math.pow(lado, 2);
		return area;
	}
	
	public String toString() {
		String s = super.toString();
		s += "Área: " + this.calcularArea() + "\n";
				
		return s;
	}
	
	
	
	
}
