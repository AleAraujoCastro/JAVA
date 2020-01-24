package exercicio02;

public class TesteImposto {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setCpf("185.727.707-47");
		p1.setRendaBruta(1000);
		
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setCnpj("88.852.341/0001-36");
		p2.setRendaBruta(5000);

		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setCpf("285.804.685-90");
		p3.setRendaBruta(2000);
		
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setCnpj("85.663.710/0001-54");
		p4.setRendaBruta(3000);
		
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setCpf("857.342.481-85");
		p5.setRendaBruta(3700);
		
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setCnpj("20.307.187/0001-88");
		p6.setRendaBruta(4000);
		
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(int i = 0; i<contribuintes.length; i++) {
			System.out.println(contribuintes[i]);
			System.out.println();
		}
		
	}

}
