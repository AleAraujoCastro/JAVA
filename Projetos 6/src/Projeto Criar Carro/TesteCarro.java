package exemplo01;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		
		System.out.println(van.toString());
		
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiro = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		

		System.out.println(fusca.toString());
	}

}
