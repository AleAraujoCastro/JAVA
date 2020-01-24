package exercicio01;

public class Cilindro extends Figura3D {

	private double raio;
	private int altura;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	@Override
	public double calcularArea() {
		double areaDaBase = Math.PI * (Math.pow(this.raio, 2));
		double areaLateral = 2 * Math.PI * this.raio * this.altura ;
		double areaTotal = (2 * areaDaBase) + areaLateral;
		return areaTotal;
	}
	
	
	@Override
	public double calcularVolume() {
		double volume = this.altura * Math.PI * (Math.pow(this.raio, 2));
		return volume;
	}
	
	public String toString() {
		String s = super.toString();
		s += "Área: " + this.calcularArea() + "\n";
		s += "Volume: " + this.calcularVolume() + "\n";
		
		return s;
	}
	
	
	
	
	
	
	
}
