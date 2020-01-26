package exemplo01;

public class TesteDocumento {

	public static void main(String[] args) {
		
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf);
		
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj);
		
		
		
		
		
		
	}

}
