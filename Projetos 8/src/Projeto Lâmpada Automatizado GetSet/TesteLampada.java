package exercicio01;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp =  new Lampada();
		
		lamp.ligar();
		
		lamp.mostrarEstado();
	
		System.out.println();
		
		lamp.desligar();
		
		lamp.mostrarEstado();
		
		System.out.println();
		
		lamp.mudarEstado();
		
		lamp.mostrarEstado();
		
		
	}

}
