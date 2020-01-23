package exercicio01;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		lamp.nome = "GE";
		lamp.modelo = "A60";
		lamp.tensao = "Bivolt";
		lamp.potencia = 7;
		lamp.cor = "Amarela";
		lamp.TipoDeLuz = "Amarela";
		lamp.garantia = 36;
		lamp.preco = 3.5;
		
		
		System.out.println(lamp.toString());
		

	}

}
