package exemplo01;

public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	@Override
	public String toString() {
		return "Carro: marca = " + marca + ", modelo = " + modelo + ", numPassageiro = " + numPassageiro + ", capCombustivel = "
				+ capCombustivel + ", consumoCombustivel = " + consumoCombustivel + "" ;
	}

}
