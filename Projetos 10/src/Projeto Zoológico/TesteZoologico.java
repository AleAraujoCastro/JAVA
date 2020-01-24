package exercicio03;

public class TesteZoologico {

	public static void main(String[] args) {
		
		
		Animal camelo = new Animal();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		
		Peixe peixe = new Peixe();
		peixe.setNome("Tubarão Branco");
		peixe.setComprimento(300);
		peixe.setVelocidade(1.5);
		
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setVelocidade(0.5);
		urso.setCor("Vermelho");
		
		
		Animal[] zoologico = new Animal[3];
		zoologico[0] = camelo;
		zoologico[1] = peixe;
		zoologico[2] = urso;
		
		System.out.println("ZOO:");
		System.out.println("------------------------");
		
		for(int i =0; i<zoologico.length; i++) {
			System.out.println(zoologico[i]);
			System.out.println("------------------------");
		}
		
		
				
	}

}
