package exercicio01;

public class Piramide extends Figura3D {
	
	private int arestaBase;
	private int altura;
	private int apotema;
	private int numPoliBase;
	
	private Figura2D base;
	
	public int getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(int arestaBase) {
		this.arestaBase = arestaBase;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getApotema() {
		return apotema;
	}

	public void setApotema(int apotema) {
		this.apotema = apotema;
	}

	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if(this.base != null){
			int area = (numPoliBase * ((arestaBase * apotema)/2)) + (int)base.calcularArea();
			return area;	
		}return 0;
		
	}
	
	@Override
	public double calcularVolume() {
		if(this.base != null) {
		int volume	= (int)(base.calcularArea() * altura)/3;
			return volume;
		} return 0;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "Área: " + this.calcularArea() + "\n";
		s += "Volume: " + this.calcularVolume() + "\n";
		
		return s;
	}
	
	

}
