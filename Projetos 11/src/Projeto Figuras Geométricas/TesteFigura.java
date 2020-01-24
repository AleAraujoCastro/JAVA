package exercicio01;

public class TesteFigura {

	public static void main(String[] args) {
		

		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("Azul");
		circulo.setRaio(2);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Verde");
		quadrado.setLado(2);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setCor("Vermelho");
		triangulo.setBase(3);
		triangulo.setAltura(2);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Amarelo");
		cubo.setLado(3);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Preto");
		cilindro.setRaio(2);
		cilindro.setAltura(3);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Pirâmide");
		piramide.setCor("Cinza");
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		
		piramide.setNumPoliBase(8);
		
		
		FiguraGeometrica[] figura = new FiguraGeometrica[6];
		figura[0] = circulo;
		figura[1] = quadrado;
		figura[2] = triangulo;
		figura[3] = cubo;
		figura[4] = cilindro;
		figura[5] = piramide;
		
		
		for(int i = 0; i < figura.length; i++) {
			System.out.println("---------------------------");
			System.out.println(figura[i].toString());
			}
	}

}
