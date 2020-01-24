package exercicio01;

public class Cubo extends Figura3D {
	
	private int lado;
	
	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		int area = (int)Math.pow(lado, 2) * 6;
		return area;
	}

	@Override
	public double calcularVolume() {
		int volume = (int)Math.pow(lado, 3);
		
		return volume;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "Área: " + this.calcularArea() + "\n";
		s += "Volume: " + this.calcularVolume() + "\n";
		
		return s;
	}
	
	
	

}
