package exercicio01;

public class Triangulo extends Figura2D {

	private int base;
	private int altura;
	
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		int area = (this.base * this.altura) / 2;
		
		return area;
	}
	
	public String toString() {
		String s = super.toString();
		s += "Área: " + this.calcularArea() + "\n";
				
		return s;
	}
	
}
